package com.example.therecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[]= {R.drawable.afc_bournemouth, R.drawable.arsenal,
    R.drawable.aston_villa, R.drawable.chelsea,
    R.drawable.crystal_palace, R.drawable.leicester_city, R.drawable.liverpool,
    R.drawable.manchester_city, R.drawable.manchester_united, R.drawable.newcastle_united,
    R.drawable.norwich_city, R.drawable.southampton,
    R.drawable.tottenham_hotspur, R.drawable.watford, R.drawable.west_ham,
    R.drawable.wolverhampton};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Initialize
        s1 = getResources().getStringArray(R.array.premiership_clubs);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
