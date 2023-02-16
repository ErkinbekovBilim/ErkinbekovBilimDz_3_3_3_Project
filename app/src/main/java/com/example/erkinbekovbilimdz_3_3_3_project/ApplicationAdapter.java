package com.example.erkinbekovbilimdz_3_3_3_project;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ApplicationAdapter extends RecyclerView.Adapter<ApplicationViewHolder> {

    private ArrayList<String> applicationList;

    public ApplicationAdapter(ArrayList<String> applicationList) {
        this.applicationList = applicationList;
    }


    @NonNull
    @Override
    public ApplicationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ApplicationViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_application, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ApplicationViewHolder holder, int position) {
        holder.bind(applicationList.get(position));
    }

    @Override
    public int getItemCount() {
        return applicationList.size();
    }
}
