package com.example.sayla.listviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;
    TextView textname;
    TextView textfather;
    String name,fname;
    int i=0;
    Button btn;
ArrayList<Record> rec = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list);
        textname = (TextView) findViewById(R.id.name);
        textfather = (TextView) findViewById(R.id.fname);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = textname.getText().toString();
                fname = textfather.getText().toString();
              if(fname =="" || name==""){
                  Toast.makeText(MainActivity.this, "Please Enter Name or Father", Toast.LENGTH_SHORT).show();
                  textname.setText("");
                  textfather.setText("");


              }
                else {

                  rec.add(new Record(name, fname));



                  CustomAdapter cstm = new CustomAdapter(getApplicationContext(), rec);
                  list.setAdapter(cstm);
              }




            }
        });

        ///////////////////










        /////////////////////////











    }
}
