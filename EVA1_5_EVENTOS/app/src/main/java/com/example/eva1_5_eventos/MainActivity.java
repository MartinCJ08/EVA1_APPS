package com.example.eva1_5_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn2, btnClaseAn, btnClaseExt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btnClaseAn = findViewById(R.id.btnClaseAn);
        btnClaseExt = findViewById(R.id.btnClaseExt);
        EventoClick evClick = new EventoClick(this);
        btnClaseExt.setOnClickListener(evClick);
        btnClaseAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Evento se surgió a partir de una clase anónima",Toast.LENGTH_LONG).show();
            }
        });


    }

    public void onClickXML(View v){
        Toast.makeText(this,"Le has picado, tio",Toast.LENGTH_LONG).show();
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Evento generado por listener ",Toast.LENGTH_LONG).show();
    }
}
