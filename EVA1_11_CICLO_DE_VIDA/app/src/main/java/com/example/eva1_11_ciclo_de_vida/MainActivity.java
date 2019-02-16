package com.example.eva1_11_ciclo_de_vida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    /*FOREGOUND -->Visible para el usuario*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate - Jale de la GUI", Toast.LENGTH_SHORT).show();
    }

    /*ForeGround -> visible al usuario*/
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart - Se carga", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume - Reconectar", Toast.LENGTH_SHORT).show();

    }
/*backgrpund*/

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause - Duración breve", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop - Jale importante", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy - Lo que se olvido", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onResart - Paso de Back a Fore", Toast.LENGTH_SHORT).show();

    }
}
