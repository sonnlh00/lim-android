package com.ecdue.lim.features.foods_storage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.ecdue.lim.R;
import com.ecdue.lim.data.Product;
import com.ecdue.lim.databinding.FoodRowItemBinding;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    private ArrayList<Product> products;
    public FoodAdapter(ArrayList<Product> products) {
        this.products = products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public FoodAdapter() {
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        FoodRowItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.food_row_item,
                parent,
                false
        );
        return new FoodViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.binding.setProduct(products.get(position));
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    class FoodViewHolder extends RecyclerView.ViewHolder {
        private final FoodRowItemBinding binding;
        public FoodViewHolder(FoodRowItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}