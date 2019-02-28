package com.example.eva1_12__listas_personalizadas;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView lstVwCiudades;
    static Clima[] acClimaCd = {
            new Clima(R.drawable.light_rain,"delicias","Despejado","Seco y polvoriento",17),
            new Clima(R.drawable.sunny,"Entre rios","Soleado","Despejado",24),
            new Clima(R.drawable.rainy,"Cuauhtemoc","Lluvioso","Nublado con intervalos",22),
            new Clima(R.drawable.snow,"Meoqui","Nevado","Cayendo nievecita",-2),
            new Clima(R.drawable.tornado,"Saucillo","Mucho viento","Creeemos que hay un tornado",14),
            new Clima(R.drawable.thunderstorm,"Camargo","Tormenta electrico","Thor esta enojado",8.7),
            new Clima(R.drawable.cloudy,"Jimenez","Nublado","Hay una que otra nube",23),
            new Clima(R.drawable.atmospher,"Silent Hill","Neblina","Creo que ya perdí una pierna",666)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwCiudades = findViewById(R.id.lstVwCiudades);
        lstVwCiudades.setAdapter(
                new ClimaAdapter(this,R.layout.layout_clima,acClimaCd)
                );
        lstVwCiudades.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(this,acClimaCd[position].getCiudad(),Toast.LENGTH_SHORT).show();
        final Dialog dlgMyDialog;
        dlgMyDialog = new Dialog(this);
        dlgMyDialog.setContentView(R.layout.layout_dialogo);

        ImageView imgVwClima;
        TextView txtVwCiudad,txtVwTemp,txtVwClima,txtVwDesc;
        Button btnOK;

        imgVwClima = dlgMyDialog.findViewById(R.id.imgVwClima);
        txtVwCiudad = dlgMyDialog.findViewById(R.id.txtVwCiudad);
        txtVwTemp = dlgMyDialog.findViewById(R.id.txtVwTemp);
        txtVwClima = dlgMyDialog.findViewById(R.id.txtVwClima);
        txtVwDesc = dlgMyDialog.findViewById(R.id.txtVwDesc);
        btnOK = dlgMyDialog.findViewById(R.id.btnOK);

        imgVwClima.setImageResource(acClimaCd[position].getImagen_clima());
        txtVwCiudad.setText(acClimaCd[position].getCiudad());
        txtVwTemp.setText(acClimaCd[position].getTemperatura()+"*C");
        txtVwClima.setText(acClimaCd[position].getClima());
        txtVwDesc.setText(acClimaCd[position].getDesc_clima());

        btnOK.setText("OK");
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlgMyDialog.dismiss();
            }
        });

        dlgMyDialog.show();


    }
}