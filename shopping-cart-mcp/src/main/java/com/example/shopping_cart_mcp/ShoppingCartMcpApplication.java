package com.example.shopping_cart_mcp;

import com.example.shopping_cart_mcp.tools.ShoppingCartMcpService;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ShoppingCartMcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartMcpApplication.class, args);
	}

	@Bean
	public List<ToolCallback> shopingCartToolBack(ShoppingCartMcpService shoppingCartMcpService){
		return List.of(ToolCallbacks.from(shoppingCartMcpService));
	}

}
