package com.example.assignment5_cpcandroidcourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    private List<Product> productList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();
        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        adapter = new ProductAdapter(productList,MainActivity.this);
        recyclerView.setAdapter(adapter);

        String[] phonenames = getResources().getStringArray(R.array.phones);
        String[] phoneprices = getResources().getStringArray(R.array.prices);
        int[] img = {R.drawable.mobile1,R.drawable.phone2,R.drawable.phone3,
                R.drawable.phone4,R.drawable.phone5,R.drawable.phone6,R.drawable.phone7};

        for (int i=0; i<phonenames.length;i++)
        productList.add(new Product(phonenames[i],phoneprices[i],img[i]));



        adapter.notifyDataSetChanged();


    }
}