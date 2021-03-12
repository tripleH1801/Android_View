package com.example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGood;
    Custom adt;
    ArrayList<Test> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGood = findViewById(R.id.lvGood);

        arrayList = new ArrayList<>();
        arrayList.add(new Test(R.drawable.google, "Google", "80$"));
        arrayList.add(new Test(R.drawable.google, "Google", "80$"));
        arrayList.add(new Test(R.drawable.google, "Google", "80$"));
        arrayList.add(new Test(R.drawable.google, "Google", "80$"));
        adt = new Custom(this, R.layout.item_listview, arrayList);
        lvGood.setAdapter(adt);
    }
}