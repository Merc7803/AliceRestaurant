package com.example.foodapp;

import com.example.foodapp.models.CartModel;
import com.example.foodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class CartManager {

    private static CartManager instance;
    private List<CartModel> cartItems;

    private CartManager() {
        cartItems = new ArrayList<>();
    }

    public static CartManager getInstance() {
        if (instance == null) {
            instance = new CartManager();
        }
        return instance;
    }

    public void addItemToCart(HomeVerModel item) {
        cartItems.add(new CartModel(item.getImage(), item.getName(), item.getPrice(), item.getRating()));
    }

    public List<CartModel> getCartItems() {
        return cartItems;
    }

    public void removeItem(int position) {
        if (position >= 0 && position < cartItems.size()) {
            cartItems.remove(position);
        }
    }

}
