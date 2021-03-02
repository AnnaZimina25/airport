package ru.zimina;

public class Baggage {

    private CarrierCompanies carrierCompanyName;
    private FlightClasses flightClass;
    private int maxAllowableWeight;

    public Baggage(CarrierCompanies carrierCompanyName, FlightClasses flightClass, int maxAllowableWeight) {
        this.carrierCompanyName = carrierCompanyName;
        this.flightClass = flightClass;
        this.maxAllowableWeight = maxAllowableWeight;
    }

    @Override
    public String toString() {
        return "Baggage{" +
                "carrierCompanyName=" + carrierCompanyName +
                ", flightClass='" + flightClass + '\'' +
                ", maxAllowableWeight=" + maxAllowableWeight +
                '}';
    }

    public CarrierCompanies getCarrierCompanyName() {
        return carrierCompanyName;
    }

    public FlightClasses getFlightClass() {
        return flightClass;
    }

    public int getMaxAllowableWeight() {
        return maxAllowableWeight;
    }

}
