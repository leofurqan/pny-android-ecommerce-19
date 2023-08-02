package com.example.myapplication.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.ProductDetailsActivity;
import com.example.myapplication.R;
import com.example.myapplication.data.ProductsData;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {

    Context context;
    ArrayList<ProductsData> productsData;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        MaterialCardView cardProduct;
        private ImageView imgProduct;
        private TextView txtName, txtBrandName, txtPrice;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cardProduct = itemView.findViewById(R.id.card_product);
            imgProduct = itemView.findViewById(R.id.img_product);
            txtName = itemView.findViewById(R.id.txt_name);
            txtBrandName = itemView.findViewById(R.id.txt_brand);
            txtPrice = itemView.findViewById(R.id.txt_price);
        }

        public MaterialCardView getCardProduct() {
            return cardProduct;
        }

        public void setCardProduct(MaterialCardView cardProduct) {
            this.cardProduct = cardProduct;
        }

        public ImageView getImgProduct() {
            return imgProduct;
        }

        public void setImgProduct(ImageView imgProduct) {
            this.imgProduct = imgProduct;
        }

        public TextView getTxtName() {
            return txtName;
        }

        public void setTxtName(TextView txtName) {
            this.txtName = txtName;
        }

        public TextView getTxtBrandName() {
            return txtBrandName;
        }

        public void setTxtBrandName(TextView txtBrandName) {
            this.txtBrandName = txtBrandName;
        }

        public TextView getTxtPrice() {
            return txtPrice;
        }

        public void setTxtPrice(TextView txtPrice) {
            this.txtPrice = txtPrice;
        }
    }

    public ProductsAdapter(Context context, ArrayList<ProductsData> productsData) {
        this.context = context;
        this.productsData = productsData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_products, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProductsData product = productsData.get(position);

        holder.getTxtName().setText(product.getName());
        holder.getTxtBrandName().setText(product.getBrand_name());
        holder.getTxtPrice().setText(product.getPrice());

        Glide.with(context).load(product.getImage()).into(holder.getImgProduct());

        holder.getCardProduct().setOnClickListener(v -> {
            Intent intent = new Intent(context, ProductDetailsActivity.class);
            intent.putExtra("product", product);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return productsData.size();
    }
}
