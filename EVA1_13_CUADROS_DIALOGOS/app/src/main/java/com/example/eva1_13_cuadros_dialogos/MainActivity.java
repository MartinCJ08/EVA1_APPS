package com.example.eva1_13_cuadros_dialogos;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //btnDefault = findViewById(R.id.button2);


    }

    public void clickDialogoDefault(View v){
        new AlertDialog.Builder(this)
        .setTitle("Cuadro de dialogo de Android")
        .setMessage("Hola Mundoo cruel!!")
        .setPositiveButton("Fierro", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Fierro pues",Toast.LENGTH_SHORT).show();
            }
        })

        .setNegativeButton("Nel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Nel krnl",Toast.LENGTH_SHORT).show();
            }
        })

        .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"X krnl",Toast.LENGTH_SHORT).show();
            }
        }).create().show();
    }

    public void clickDialogoPropio(View v){
        final Dialog dlgMiDialogo;
        dlgMiDialogo = new Dialog(this);
        //El Layuot, tenemos que decir como se ve
        dlgMiDialogo.setContentView(R.layout.cuadro_dialogo);
        TextView txtVwTitu;
        final EditText edtTxtCaptu;
        Button btnOK;

        //Queremos que jale las ID de el layout cuadro de dialogo
        txtVwTitu = dlgMiDialogo.findViewById(R.id.txtVwTitu);
        edtTxtCaptu = dlgMiDialogo.findViewById(R.id.edtTxtCaptu);
        btnOK = dlgMiDialogo.findViewById(R.id.btnOK);

        txtVwTitu.setText("MI CUADRO DE DIALOGO");
        edtTxtCaptu.setHint("Introduce tu noombre");
        btnOK.setText("SALUDAR");
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),edtTxtCaptu.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

        dlgMiDialogo.show();

    }
}
