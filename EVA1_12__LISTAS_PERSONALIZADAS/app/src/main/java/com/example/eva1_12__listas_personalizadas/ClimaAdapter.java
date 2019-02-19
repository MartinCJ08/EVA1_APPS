package com.example.eva1_12__listas_personalizadas;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ClimaAdapter extends ArrayAdapter<Clima> {
    private Context cApp;
    private int iMyLayout;
    private Clima[] acDatos;

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView imgVwClima;
        TextView txtVwCiudad,txtVwTemp,txtVwClima,txtVwDesc;

        View vwMyLayout = convertView;

        if (vwMyLayout == null){//No existe fila, hay que crearla
            LayoutInflater liCrearLayout = ((Activity) cApp).getLayoutInflater();
            vwMyLayout =  liCrearLayout.inflate(iMyLayout,parent,false);
        }

        imgVwClima = vwMyLayout.findViewById(R.id.imgVwClima);
        txtVwCiudad = vwMyLayout.findViewById(R.id.txtVwCiudad);
        txtVwTemp = vwMyLayout.findViewById(R.id.txtVwTemp);
        txtVwClima = vwMyLayout.findViewById(R.id.txtVwClima);
        txtVwDesc = vwMyLayout.findViewById(R.id.txtVwDesc);

        Clima cClimaCd = acDatos[position];
        imgVwClima.setImageResource(cClimaCd.getImagen_clima());
        txtVwCiudad.setText(cClimaCd.getCiudad());
        txtVwTemp.setText(cClimaCd.getTemperatura()+"*C");
        txtVwClima.setText(cClimaCd.getClima());
        txtVwDesc.setText(cClimaCd.getDesc_clima());

        return vwMyLayout;
    }

    public ClimaAdapter(@NonNull Context context, int resource, @NonNull Clima[] objects) {
        super(context, resource, objects);
        cApp = context;
        iMyLayout = resource;
        acDatos = objects;
    }
}
