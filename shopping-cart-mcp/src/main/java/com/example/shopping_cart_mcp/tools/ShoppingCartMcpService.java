package com.example.shopping_cart_mcp.tools;

import com.example.shopping_cart_mcp.entity.CartItem;
import com.example.shopping_cart_mcp.repository.CartItemRepository;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ShoppingCartMcpService {

    private CartItemRepository cartItemRepository;
    ShoppingCartMcpService(CartItemRepository cartItemRepository){
        this.cartItemRepository = cartItemRepository;
    }

    //tools

    private static final Map<String , Double> PRODUCTS = Map.of(
            "iphone",79999.0,
        "MacBook Air", 129999.0,
        "Boat AirDopes", 1999.0
    );


    @Tool(name="add-to-cart", description = "Add product to shopping cart. If product exists, update the quantity")
    public String addToCart(@ToolParam  String productName, @ToolParam int quantity) {
//        if(!PRODUCTS.containsKey(productName)){
//            return "product not found";
//        }
//        Double price = PRODUCTS.get(productName);
//
//        CartItem cartItem = this.cartItemRepository.findByProductId(productName);
//
//        if(cartItem == null){
//            cartItem = new CartItem();
//            cartItem.setProductId(productName);
//            cartItem.setProductName(productName);
//            cartItem.setQuantity(quantity);
//        } else {
//            cartItem.setQuantity(cartItem.getQuantity() + quantity);
//        }
//
//        cartItem.setPrice(cartItem.getQuantity()*price);
//        cartItemRepository.save(cartItem);
        return quantity + " " + productName + " added to cart. Total price: "+ (Math.random());
    }

    @Tool(name="remove-from-cart", description = "Remove product from cart")
    public String removeCart(@ToolParam String productName){
//        cartItemRepository.deleteByProductId(productName);
        return productName + "removed from cart";
    }

    @Tool(name="get-carts", description = "Retreive the current shopping cart items")
    public List<String> getCart(@ToolParam String productName){
//        return cartItemRepository.findAll();
        return List.of("Apple", "Grapes");
    }

    @Tool(name = "get-cart-total", description = "Get total value of the cart")
    public double getCartTotal() {
//        return cartItemRepository.findAll().stream().mapToDouble(CartItem::getPrice).sum();
        return Math.random();
    }
}
