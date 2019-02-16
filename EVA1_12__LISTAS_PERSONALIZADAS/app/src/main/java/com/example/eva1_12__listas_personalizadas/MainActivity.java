package com.example.eva1_12__listas_personalizadas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
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
    }
}