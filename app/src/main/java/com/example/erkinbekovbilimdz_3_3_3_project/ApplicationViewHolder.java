package com.example.erkinbekovbilimdz_3_3_3_project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ApplicationViewHolder extends RecyclerView.ViewHolder {

    private TextView tvApplication;

    public ApplicationViewHolder(@NonNull View itemView) {
        super(itemView);
        tvApplication = itemView.findViewById(R.id.tv_application);
    }
    void bind(String application){
        tvApplication.setText(application);
    }
}
