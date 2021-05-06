package com.example.assignment5_cpcandroidcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductViewActivity extends AppCompatActivity {

    TextView name,price;
    ImageView imageView;
    Button buy,addcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_view);
        name = findViewById(R.id.pname);
        price = findViewById(R.id.pprice);
        imageView = findViewById(R.id.img);
        buy = findViewById(R.id.buynow);
        addcard = findViewById(R.id.addcard);

        name.setText(getIntent().getStringExtra("name"));
        price.setText(getIntent().getStringExtra("price"));
    }
}