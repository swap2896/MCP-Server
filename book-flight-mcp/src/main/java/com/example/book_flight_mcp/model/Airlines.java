package com.example.book_flight_mcp.model;


public class Airlines {

    private String airlineName;
    private String airlineCode;
    private String countryName;

    public Airlines(String airlineName, String airlineCode, String countryName) {
        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.countryName = countryName;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public Airlines() {
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
