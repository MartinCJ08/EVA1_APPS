package com.example.eva1_6_otros_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup rdGrpProfes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpProfes.findViewById(R.id.rdGrpProfes);
        rdGrpProfes.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.rdBlanca) {

        } else if (checkedId == R.id.rdGloria) {
            Toast.makeText(this, "Vas a sacar un 80 con gloria", Toast.LENGTH_SHORT).show();

        } else if (checkedId == R.id.rdMartin) {
            Toast.makeText(this, "Vas a sacar un 80 con martin", Toast.LENGTH_SHORT).show();

        } else if (checkedId == R.id.rdLorena) {
            Toast.makeText(this, "Vas a sacar un 80 con lorena", Toast.LENGTH_SHORT).show();

        } else if (checkedId == R.id.rdRuben) {
            Toast.makeText(this, "Vas a sacar un 80 con ruben", Toast.LENGTH_SHORT).show();

        }
    }
}
