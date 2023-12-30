package com.example.tuan22.ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.tuan22.R;

public class T2ListViewMainActivity extends AppCompatActivity {
    ListView lv;
    @SuppressLint("MissingInflatedID")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t2_list_view_main);
        lv = findViewById(R.id.t2lv);
        // nguồn dữ liệu
        String[] arr = new String[] {"Môn 1","Môn 2","Môn 3","Môn 4","Môn 5","Môn 6","Môn 7","Môn 8"};
        // adapter
        ArrayAdapter<String>
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        // hiện lên listview
        lv.setAdapter(adapter);
    }
}