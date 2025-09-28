package com.example.book_flight_mcp;

import com.example.book_flight_mcp.tools.BookingFlightMcpServer;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BookFlightMcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookFlightMcpApplication.class, args);
	}

	@Bean
	public List<ToolCallback> flightSearchToolBack(BookingFlightMcpServer bookingFlightMcpServer){
		return List.of(ToolCallbacks.from(bookingFlightMcpServer));
	}

}
