package ru.zimina;

// Lesson06 Task 5.0.4
// Airport

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static ru.zimina.Generator.*;

public class Main {

    public static void main(String[] args) {

        List<Baggage> baggageList = new ArrayList<>();
        int countOfObjects = 5;

        for (int i = 0; i < countOfObjects; i++) {
            baggageList.add(new Baggage(generateCarrierCompany(), generateFlightClass(), generateWeight()));
        }

        Comparator<Baggage> baggageWeightComparator = (o1, o2) -> {
            if (o1.getMaxAllowableWeight() < o2.getMaxAllowableWeight()) {
                return -1;
            } else if (o1.getMaxAllowableWeight() > o2.getMaxAllowableWeight()) {
                return 1;
            } else {
                return 0;
            }
        };

        Comparator<Baggage> stringLengthComparator = new Comparator<Baggage>() {
            @Override
            public int compare(Baggage o1, Baggage o2) {
                String o1CarrierName = o1.getCarrierCompanyName().name();
                String o1FlightClass = o1.getFlightClass().name();
                int o1Result = (o1CarrierName + o1FlightClass).length();

                String o2CarrierName = o2.getCarrierCompanyName().name();
                String o2FlightClass = o2.getFlightClass().name();
                int o2Result = (o2CarrierName + o2FlightClass).length();

                if (o1Result < o2Result) {
                    return -1;
                } else if (o1Result > o2Result) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        baggageList.stream().sorted(baggageWeightComparator).forEach(System.out::println);
        System.out.println("=================================================================\r\n");
        baggageList.stream().sorted(Collections.reverseOrder(stringLengthComparator)).forEach(System.out::println);


    }

}
