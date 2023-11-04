package com.example.foodapp.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodapp.CartManager;
import com.example.foodapp.R;
import com.example.foodapp.adapters.CartAdapter;
import com.example.foodapp.models.CartModel;
import com.example.foodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import android.widget.Button;
import android.widget.Toast;


public class MyCartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;
    Button makeOrderButton;

    public MyCartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = CartManager.getInstance().getCartItems();

        cartAdapter = new CartAdapter(list, new CartAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                CartManager.getInstance().removeItem(position);
                cartAdapter.notifyItemRemoved(position);
            }
        });
        recyclerView.setAdapter(cartAdapter);


        makeOrderButton = view.findViewById(R.id.button);
        makeOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a success message
                Toast.makeText(getContext(), "Order Success!", Toast.LENGTH_SHORT).show();

                // Clear the cart
                CartManager.getInstance().getCartItems().clear();

                // Update the CartAdapter
                cartAdapter.notifyDataSetChanged();
            }
        });

        return view;
    }



}