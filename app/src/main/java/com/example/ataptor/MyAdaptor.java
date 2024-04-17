package com.example.ataptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MyAdaptor extends BaseAdapter {
    Context context;
    int [] data;

    LayoutInflater inflater;
    MyAdaptor(Context context, int [] data){
        this.context=context;
        this.data=data;
        inflater=(LayoutInflater.from(context)) ;
    }
    @Override
    public int getCount() {
        return data.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {
          convertView= inflater.inflate(R.layout.ui_view_img,null);
        ImageView imageView=convertView.findViewById(R.id.ui_imgview);
        imageView.setImageResource(data[position]);

        return convertView;
    }
}
