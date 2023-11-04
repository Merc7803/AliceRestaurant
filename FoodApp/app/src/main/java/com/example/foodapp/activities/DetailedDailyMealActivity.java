package com.example.foodapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.foodapp.R;
import com.example.foodapp.adapters.DetailedDailyAdapter;
import com.example.foodapp.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if (type != null && type.equalsIgnoreCase("breakfast")){

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1, "Breakfast", "description", "4.4", "35.000vnd", "8:00 - 17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2, "Breakfast", "description", "4.4", "35.000vnd", "8:00 - 17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3, "Breakfast", "description", "4.4", "35.000vnd", "8:00 - 17:00"));
            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("lunch")){

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1, "Lunch", "description", "4.4", "35.000vnd", "8:00 - 17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2, "Lunch", "description", "4.4", "35.000vnd", "8:00 - 17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fries2, "Lunch", "description", "4.4", "35.000vnd", "8:00 - 17:00"));
            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("dinner")){

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ver1, "Dinner", "description", "4.4", "35.000vnd", "8:00 - 17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ver2, "Dinner", "description", "4.4", "35.000vnd", "8:00 - 17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ver3, "Dinner", "description", "4.4", "35.000vnd", "8:00 - 17:00"));
            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("sweets")){

            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1, "Sweet", "description", "4.4", "35.000vnd", "8:00 - 17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2, "Sweet", "description", "4.4", "35.000vnd", "8:00 - 17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3, "Sweet", "description", "4.4", "35.000vnd", "8:00 - 17:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s4, "Sweet", "description", "4.4", "35.000vnd", "8:00 - 17:00"));
            dailyAdapter.notifyDataSetChanged();
        }

        if (type != null && type.equalsIgnoreCase("coffee")){

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffe, "Coffee", "description", "4.4", "35.000vnd", "8:00 - 17:00"));
            dailyAdapter.notifyDataSetChanged();
        }

    }
}