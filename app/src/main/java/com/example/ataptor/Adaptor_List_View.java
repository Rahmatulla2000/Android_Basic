package com.example.ataptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptor_List_View extends BaseAdapter {
    int [] image_data;
    String [] name;
    Context context;
    LayoutInflater inflater;
    Adaptor_List_View(Context context,int [] image_data,String[] name){
        this.image_data=image_data;
        this.name=name;
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return name.length;
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
       convertView= inflater.inflate(R.layout.ui_list_view,null);
        ImageView imageView=convertView.findViewById(R.id.imageview_ui);
        TextView textView=convertView.findViewById(R.id.textview2);
        imageView.setImageResource(image_data[position]);
        textView.setText(name[position]);
        return convertView;
    }
}
