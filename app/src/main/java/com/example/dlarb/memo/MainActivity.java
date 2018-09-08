package com.example.dlarb.memo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Data> items = new ArrayList<>();
    ListView LV;
    CustomAdpater mAdapter;
    EditText ET;
    Button BT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LV = findViewById(R.id.LV);
        ET = findViewById(R.id.ET);
        BT = findViewById(R.id.BT);


        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ET.getText().toString()==""){

                }else{
                items.add(new Data(ET.getText().toString()));
                ET.setText("");
                mAdapter.notifyDataSetChanged();
                }
            }
        });

        mAdapter = new CustomAdpater(items, this);
        LV.setAdapter(mAdapter);
    }
}
