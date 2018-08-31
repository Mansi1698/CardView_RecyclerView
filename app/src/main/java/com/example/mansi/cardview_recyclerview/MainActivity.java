package com.example.mansi.cardview_recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rc;
    ProductAdapter adapter;
    List<person> personList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personList=new ArrayList<>();

        rc = findViewById(R.id.recyclerview1);
        rc.setHasFixedSize(true);

        rc.setLayoutManager(new LinearLayoutManager(this));
        personList.add(new person("Mansi","9979775543",android.R.drawable.btn_star));
        personList.add(new person("Meghna","9979775543",android.R.drawable.btn_star));
        personList.add(new person("Ishani","9979775543",android.R.drawable.btn_star));
      ProductAdapter pa =new ProductAdapter(this,personList);
       rc.setAdapter(pa);

    }



}
