package com.example.book_flight_mcp.model;

public class Airport {

    private String airportCode;
    private String airportName;
    private String cityName;

    public String getAirportCode() {
        return airportCode;
    }

    public Airport(String airportCode, String airportName, String cityName) {
        this.airportCode = airportCode;
        this.airportName = airportName;
        this.cityName = cityName;
    }

    public Airport() {
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
