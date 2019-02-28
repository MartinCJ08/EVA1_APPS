package com.example.p1_cafeteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup rdGrpCafe;
    TextView txtTotal,txtVwDatos;
    EditText edtTxtCant;
    CheckBox chkCrema,chkAzucar;

    private int iPrecioCafe=0,iExtras=0,iCant=1,iFinal=0;
    String sCafe = "", sExtra="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpCafe=findViewById(R.id.rdGrpCafe);
        rdGrpCafe.setOnCheckedChangeListener(this);
        txtTotal = findViewById(R.id.txtTotal);
        txtVwDatos = findViewById(R.id.txtVwDatos);
        chkCrema = findViewById(R.id.chkCrema);
        chkAzucar = findViewById(R.id.chkAzucar);
        edtTxtCant = findViewById(R.id.edtTxtCant);
    }

    public void onClick(View v){

        iCant = Integer.parseInt(edtTxtCant.getText().toString());
        //iFinal = iPrecioCafe * iCant;

        if (chkAzucar.isChecked() && chkCrema.isChecked()){
            sExtra = "Azúcar, Crema";
            iExtras = 2;
        }else if(chkAzucar.isChecked() && !chkCrema.isChecked()){
            sExtra = "Azúcar";
            iExtras = 1;
        }else if(!chkAzucar.isChecked() && chkCrema.isChecked()){
            sExtra = "Crema";
            iExtras = 1;
        }else{
            sExtra="sin extras seleccionados";
            iExtras = 0;
        }
        iFinal = iPrecioCafe*iCant+iExtras;
        //txtTotal.setText("$"+iFinal);
        txtVwDatos.setText(sCafe+","+sExtra);
        txtTotal.setText("Total:$"+iFinal);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId == R.id.rdAmericano){
            iPrecioCafe = 20;
            sCafe = "Americano";
        }else if(checkedId==R.id.rdCapuchino){
            iPrecioCafe = 48;
            sCafe = "Capuchino";
        }else if(checkedId == R.id.rdExpresso){
            iPrecioCafe = 30;
            sCafe = "Expresso";
        }
    }
}
