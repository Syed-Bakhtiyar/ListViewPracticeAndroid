package com.example.sayla.listviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sayla on 30/10/2016.
 */
public class CustomAdapter extends BaseAdapter {

    public LayoutInflater inflate;
    Context cont;
    ArrayList<Record> recc;
    TextView text1;
    TextView text2;

    public CustomAdapter(Context cont, ArrayList<Record> recc) {
        this.inflate = inflate.from(cont);
        this.cont = cont;
        this.recc = recc;

    }

    @Override



    public int getCount() {
        return recc.size();
    }

    @Override
    public Object getItem(int i) {
        return 0;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       View v = inflate.inflate(R.layout.list_view_sample, viewGroup,false);
        text1 = (TextView) v.findViewById(R.id.txt1);
        text2 = (TextView) v.findViewById(R.id.txt2);

        text1.setText(recc.get(i).getName());
        text2.setText(recc.get(i).getFname());
        return v;


    }
}
