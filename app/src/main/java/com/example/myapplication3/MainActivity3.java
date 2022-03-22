package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView nameItem;
    TextView contentItem;
    TextView priceItem;
    ImageView imageViewItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nameItem = findViewById(R.id.tvNameData);
        contentItem = findViewById(R.id.tvContentData);
        priceItem = findViewById(R.id.tvContent);
        imageViewItem = findViewById(R.id.imageItemData);

        Intent intent = getIntent();
        nameItem.setText(intent.getStringExtra("name"));
        contentItem.setText(intent.getStringExtra("content"));
        priceItem.setText(intent.getStringExtra("price"));
        imageViewItem.setImageResource(intent.getIntExtra("imageView",0));

    }
}