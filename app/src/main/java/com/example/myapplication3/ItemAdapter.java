package com.example.myapplication3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter {
    Activity atv;
    int layoutItem;
    ArrayList<Items> arrayList;
    ImageView imgItem;

    public ItemAdapter(Activity atv, int layoutItem, ArrayList<Items> arrayList) {
        this.atv = atv;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Items items = arrayList.get(i);
        view = LayoutInflater.from(atv).inflate(layoutItem,viewGroup,false);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvContent = view.findViewById(R.id.tvContent);
        TextView tvPrice = view.findViewById(R.id.tvContent);
        ImageView imgItem = view.findViewById(R.id.imgItem);

        tvName.setText(items.getName());
        tvContent.setText(items.getContent());
        tvPrice.setText(items.getPrice());
        imgItem.setImageResource(items.getImgItem());


        return view;
    }
}
