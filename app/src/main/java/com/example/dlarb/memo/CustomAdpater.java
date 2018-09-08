package com.example.dlarb.memo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdpater extends BaseAdapter {

    ArrayList<Data> items = new ArrayList<>();
    Context mContext;

    public CustomAdpater(ArrayList<Data> items, Context mContext) {
        this.items = items;
        this.mContext = mContext;

    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item, null);
        TextView TV = v.findViewById(R.id.TV);

        TV.setText(items.get(position).getContents());
        return v;
    }
}
