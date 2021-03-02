package ru.zimina;

public class Generator {

    public static CarrierCompanies generateCarrierCompany() {
        CarrierCompanies[] companiesArray = CarrierCompanies.values();
        int companiesCount = companiesArray.length;
        int index = (int) (Math.random() * companiesCount);

        return companiesArray[index];
    }

    public static FlightClasses generateFlightClass() {
        FlightClasses[] classesArray = FlightClasses.values();
        int classesCount = classesArray.length;
        int index = (int) (Math.random() * classesCount);

        return classesArray[index];
    }

    public static int generateWeight() {
        int maxValue = 30;
        int minValue = 15;

        return minValue + (int)(Math.random() * maxValue);
    }
}
