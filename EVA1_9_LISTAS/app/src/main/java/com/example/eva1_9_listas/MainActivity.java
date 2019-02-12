package com.example.eva1_9_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView lstTitu;
    TextView txtDesc;
    static String[] sPelis = {"50 sombras del paco el chato","DETERGENTE"};
    static String[] sDesc = {"Un hombre interpido."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstTitu.findViewById(R.id.lstTitu);
        txtDesc.findViewById(R.id.txtDesc);
        lstTitu.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sPelis));

        lstTitu.setAdapter(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        txtDesc.setText(sDesc[position]);
    }
}
