package com.example.eva1_5_eventos;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class EventoClick implements View.OnClickListener {
    Context cnt;

    public  EventoClick(Context cnt){
        this.cnt = cnt;
    }
    @Override
    public void onClick(View v) {
        Toast.makeText(cnt,"Clase externa, papa!",Toast.LENGTH_LONG).show();
    }
}
