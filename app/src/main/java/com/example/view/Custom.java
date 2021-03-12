package com.example.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Custom extends BaseAdapter {
    Context ctx;
    int layoutItem;
    ArrayList<Test> arrayList;

    public Custom(Context ctx, int layoutItem, ArrayList<Test> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = LayoutInflater.from(ctx).inflate(layoutItem, parent, false);
        TextView tvName = view.findViewById(R.id.name);
        TextView tvPrice = view.findViewById(R.id.price);
        ImageView img = view.findViewById(R.id.imageView);

        tvName.setText(arrayList.get(i).getName());
        tvPrice.setText(arrayList.get(i).getPrice());
        img.setImageResource(arrayList.get(i).getImg());
        return view;
    }
}
