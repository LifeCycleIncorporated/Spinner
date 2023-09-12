package com.example.spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int[] flags;
    String[] countryName;
    String[] currencyName;

    private LayoutInflater inflater;
    Context context;

    CustomAdapter ( Context context, int[] flags, String[] countryName, String[] currencyName){

        this.context = context;
        this.flags = flags;
        this.countryName = countryName;
        this.currencyName = currencyName;

    }

    @Override
    public int getCount() {
        return countryName.length;
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

        if (view==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.simple_view, viewGroup,false);
        }


        ImageView countryImage = view.findViewById(R.id.countryImageId);
        TextView countryNames = view.findViewById(R.id.countryNameId);
        TextView currencyNames = view.findViewById(R.id.currencyNameId);

        countryImage.setImageResource(flags[i]);
        countryNames.setText(countryName[i]);
        currencyNames.setText(currencyName[i]);

        return view;
    }
}
