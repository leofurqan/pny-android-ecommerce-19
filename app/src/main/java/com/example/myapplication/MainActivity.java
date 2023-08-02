package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.adapters.ProductsAdapter;
import com.example.myapplication.data.ProductsData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvProducts;
    ArrayList<ProductsData> products;
    ProductsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvProducts = findViewById(R.id.rv_products);

        products = new ArrayList<>();
        products.add(new ProductsData(1, "HP Laptop", "15000", "https://www.mega.pk/items_images/Laptop+price+in+pakistan%2C+HP+Laptop+%2C+HP+15+6+8GB+256GB_-_22853.webp", "HP"));
        products.add(new ProductsData(2, "Dell Laptop", "12000", "https://sourceit.com.sg/cdn/shop/products/dell-latitude-3420-laptop-intel-touchscreen-nontouchscreen-sata-storage-3-year-local-onsite-warranty-663772.jpg?v=1654153974", "Dell"));
        products.add(new ProductsData(3, "Acer Laptop", "16000", "https://images.acer.com/is/image/acer/aspire-7-a715-fpbl-bk-01a?$Product-Cards-XL$", "Acer"));
        products.add(new ProductsData(4, "Lenovo Laptop", "20000", "https://www.lenovo.com/medias/lenovo-laptops-x1-carbon-6th-gen-hero.png?context=bWFzdGVyfHJvb3R8Mjk0NzU4fGltYWdlL3BuZ3xoYTIvaDZjLzE0NDQ3MTYzNzM2MDk0LnBuZ3xiMThiNWJlY2NjODExN2U0M2E4ZDE2NGNmMTM2NTExMWZkNzYwMzE4YTBmNDE5YzFiNThhODc2ZDEzYTMwZWQ5", "Lenovo"));
        products.add(new ProductsData(5, "Asus Laptop", "90000", "https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6507/6507909_sd.jpg", "Asus"));

        adapter = new ProductsAdapter(this, products);
        rvProducts.setLayoutManager(new GridLayoutManager(this, 2));
        rvProducts.setAdapter(adapter);
    }
}