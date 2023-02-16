package com.example.erkinbekovbilimdz_3_3_3_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> applicationList;

    private ApplicationAdapter adapter;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_application);
        loadDara();
        adapter = new ApplicationAdapter(applicationList);
        recyclerView.setAdapter(adapter);
    }

    private void loadDara() {
        applicationList = new ArrayList<>();
        applicationList.add("Spotify");
        applicationList.add("Instagram");
        applicationList.add("WhatsApp");
        applicationList.add("Telegram");
        applicationList.add("Translator");
        applicationList.add("Play Game");
        applicationList.add("Play Market");
        applicationList.add("Calculator");
        applicationList.add("AliExpress");
        applicationList.add("Glovo");
        applicationList.add("Pinterest");
    }
}