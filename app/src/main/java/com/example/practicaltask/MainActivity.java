package com.example.practicaltask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeListView();
    }

    private void initializeListView() {
        this.listView = findViewById(R.id.list_view);
        this.arrayList = new ArrayList<>();
        this.arrayList.add("Lesson 7 exercise");
        this.arrayList.add("Practical Task 41 (tasks 1-3)");
        this.arrayList.add("Practical Task 41 (tasks 4,5)");
        this.arrayList.add("Practical Task 41 (tasks 6)");
        this.adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, this.arrayList);
        this.listView.setAdapter(adapter);
        this.listView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if (this.adapter.equals(adapterView.getAdapter())) {
            switch (i) {
                case 0:
                    Intent intent = new Intent(getApplicationContext(), ScreenCaptureExercise.class);
                    startActivity(intent);
                    break;
                case 1:
                    Intent intent1 = new Intent(getApplicationContext(), KeyboardInputControls.class);
                    startActivity(intent1);
                    break;
                case 2:
                    Intent intent2 = new Intent(getApplicationContext(), AlertDataPickers.class);
                    startActivity(intent2);
                    break;
                case 3:
                    Intent intent3 = new Intent(getApplicationContext(), DroidCafe.class);
                    startActivity(intent3);
            }
        }
    }
}
