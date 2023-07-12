package com.example.cl.ejercicio6;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cl.ejercicio6.databinding.FragmentImageBinding;

import java.util.ArrayList;
import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {

    private ArrayList<Image> images = new ArrayList<>();
    private FragmentImageBinding imageBinding;
    @NonNull
    @Override
    public Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        FragmentImageBinding binding = FragmentImageBinding.inflate(LayoutInflater.from(parent.getContext()));

        return new viewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.viewHolder holder, int position) {
      Image item = images.get(position);
      holder.showInformation(item);





    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {


        public viewHolder(@NonNull FragmentImageBinding binding) {
            super(binding.getRoot());
            imageBinding = binding;
        }

        public void showInformation(Image image){

            Glide.with(imageBinding.getRoot()).load(image.url).into(imageBinding.imageView);
        }
    }

    public void setImages(ArrayList<Image> items){
        this.images = items;



    }
}
