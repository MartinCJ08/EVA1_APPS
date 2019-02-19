package com.example.eva1_12__listas_personalizadas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
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
        Toast.makeText(this,acClimaCd[position].getCiudad(),Toast.LENGTH_SHORT).show();
    }
}