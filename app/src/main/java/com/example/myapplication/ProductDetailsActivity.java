package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.myapplication.data.ProductsData;

public class ProductDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        ProductsData product = (ProductsData) getIntent().getSerializableExtra("product");

        Toast.makeText(this, product.getName(), Toast.LENGTH_SHORT).show();
    }
}