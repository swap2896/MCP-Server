package com.example.book_flight_mcp.tools;

import com.example.book_flight_mcp.constants.FlightConstant;
import com.example.book_flight_mcp.model.Airlines;
import com.example.book_flight_mcp.model.Airport;
import com.example.book_flight_mcp.model.FlightSearchResult;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BookingFlightMcpServer {
    @Tool(name = "get-airlines", description = "To get list of all the airlines with code, name & country")
    public List<Airlines> getAirlines() {
        return FlightConstant.listOfAirlines();
    }


    @Tool(name = "get-airports", description = "To get the list of all the airports with IATA code & city")
    public List<Airport> getAirports() {
        return FlightConstant.listOfAirports();

    }

    @Tool(name = "search-flights", description = "Search flights based on origin, destination and date")
    public List<FlightSearchResult> searchFlights(@ToolParam String origin, @ToolParam String destination, @ToolParam String date){
        return List.of(
                new FlightSearchResult(
                        "FL123", "Indira Gandhi International Airport", "11:00",  "7:00", "60$", destination, origin, date),
                new FlightSearchResult("FL987", "Indira Gandhi International Airport", "12:00",  "8:00", "67$", destination, origin, date)
                );
    }

    @Tool(name = "create-booking", description = "book a flight and create a booking with a PNR")
    public String createBooking(@ToolParam String flightId, @ToolParam String passengerName){
        return "Booking successful . \n PNR :KIJ543 \n Booking Details: {" +
                "Flight ID:  "+flightId + " for passenger:" + passengerName +" }";

    }

}
