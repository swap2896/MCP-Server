package com.example.book_flight_mcp.model;

public class FlightSearchResult {
    private String id;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String origin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public FlightSearchResult() {
    }

    public FlightSearchResult(String id, String airportName, String arrivalTime, String departureTime, String price, String destination, String origin, String date) {
        this.id = id;
        this.airportName = airportName;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.price = price;
        this.destination = destination;
        this.origin = origin;
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    private String destination;
    private String price;
    private String departureTime;
    private String arrivalTime;
    private String airportName;
    private String date;
}
