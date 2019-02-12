package com.example.eva1_7_eventos_recursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup rdGrupo;
    RadioButton rdEspanol, rdIngles;
    TextView txtNom, txtApe;
    EditText edTxtNom,edTxtApe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrupo.findViewById(R.id.rdGroup);
        txtNom.findViewById(R.id.txtNom);
        txtApe.findViewById(R.id.txtApe);
        edTxtNom.findViewById(R.id.txtEdNom);
        edTxtApe.findViewById(R.id.txtEdApe);
        rdEspanol.findViewById(R.id.rdEspanol);
        rdIngles.findViewById(R.id.rdIngles);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId == R.id.rdEspanol){
            txtNom.setText(R.string.nom_es);
            txtApe.setText(R.string.ape_es);
            edTxtNom.setText(R.string.hint_nom_es);
            edTxtApe.setText(R.string.hint_ape_es);
            rdIngles.setText(R.string.idioma_en_es);
            rdEspanol.setText(R.string.idioma_es_es);
        }else{
            txtNom.setText(R.string.nom_en);
            txtApe.setText(R.string.ape_en);
            edTxtNom.setText(R.string.hint_nom_en);
            edTxtApe.setText(R.string.hint_ape_en);
            rdIngles.setText(R.string.idioma_en_en);
            rdEspanol.setText(R.string.idioma_es_en);
        }
    }
}
