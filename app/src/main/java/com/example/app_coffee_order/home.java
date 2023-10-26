package com.example.app_coffee_order;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private List<Product> productList;
    Button homelogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        productList = new ArrayList<>();
        productList.add(new Product("Cappuccino", R.drawable.product_image1, 4.53));
        productList.add(new Product("Kopi Kudda", R.drawable.product_image2, 3.90));
        productList.add(new Product("Lungo", R.drawable.product_image3, 5.23));
        productList.add(new Product("Mocha", R.drawable.product_image4, 4.50));
        productList.add(new Product("Irish", R.drawable.product_image5, 6.02));
        productList.add(new Product("Doppio", R.drawable.product_image6, 5.70));
        productList.add(new Product("Macchiato", R.drawable.product_image7, 6.35));
        productList.add(new Product("Affogato", R.drawable.product_image8, 6.15));

        recyclerView = findViewById(R.id.recyclerView);
        productAdapter = new ProductAdapter(this, productList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // Display 2 products per row
        recyclerView.setAdapter(productAdapter);
    }
}