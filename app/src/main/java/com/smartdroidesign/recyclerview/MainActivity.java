package com.smartdroidesign.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Items> exampleList = new ArrayList<>();
        exampleList.add(new Items(R.drawable.ic_android, "Line 1", "Line 2"));
        exampleList.add(new Items(R.drawable.ic_audiotrack, "Line 3", "Line 4"));
        exampleList.add(new Items(R.drawable.ic_brightness, "Line 5", "Line 6"));

        // contains the Recyclerview
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        // aligns the single items in the list
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        // bridge between data (ArrayList) and Recyclerview
        RecyclerView.Adapter adapter = new Adapter(exampleList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
