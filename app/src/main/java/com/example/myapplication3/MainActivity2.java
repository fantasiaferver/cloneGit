package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class MainActivity2 extends AppCompatActivity {
    ListView lvItems;
    ItemAdapter adt;
    ArrayList<Items> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lvItems = findViewById(R.id.lvItems);
        arrayList = new ArrayList<>();
        arrayList.add(new Items("Xe đạp màu vàng","Xe đạp chạy bằng cơm", "3.000.000VND",R.drawable.xedap1));
        arrayList.add(new Items("Xe đạp màu đỏ","Xe đạp chạy bằng cơm", "999.000.000VND",R.drawable.xedap2));
        adt = new ItemAdapter(this, R.layout.item_listview, arrayList);
        lvItems.setAdapter(adt);

        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str = lvItems.getAdapter().getItem(i).toString();
                Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                intent.putExtra("name", str);
       //         intent.putExtra("contentItem",str);
   //             intent.putExtra("priceItem",str);
  //              intent.putExtra("imageView",i);
                startActivity(intent);
            }
        });
    }


}