package com.example.p2_expectativa_de_vida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    boolean isMan = true;
    int iPais = 0,iAño = 0, iExp=0,iDes=0;

    RadioGroup rdGenero,rdGrpRegion;
    EditText edtTxtFecha;
    TextView txtVwExpectativa,txtVwDeceso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGenero = findViewById(R.id.rdGenero);
        rdGrpRegion = findViewById(R.id.rdGrpRegion);
        edtTxtFecha= findViewById(R.id.edtTxtFecha);
        txtVwExpectativa = findViewById(R.id.txtVwExpectativa);
        txtVwDeceso = findViewById(R.id.txtVwDeceso);
        rdGrpRegion.setOnCheckedChangeListener(this);
        rdGenero.setOnCheckedChangeListener(this);

        edtTxtFecha.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(edtTxtFecha.getText().length()>0){
                    iAño = Integer.parseInt(edtTxtFecha.getText().toString());

                    iExp = getExpectativa(iAño,iPais,isMan);
                    iDes = iExp + iAño;
                    txtVwExpectativa.setText(iExp+" años");
                    txtVwDeceso.setText(iDes+"");
                }
            }
        });
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        iAño = Integer.parseInt(edtTxtFecha.getText().toString());
        //boolean isMan=false;
        if(group == rdGrpRegion ){
            if(checkedId == R.id.rdDesarrollados){
                iPais=0;
            }else if(checkedId == R.id.rdAfrica){
                iPais=3;
            }else if(checkedId == R.id.rdAsia){
                iPais=2;
            }else if(checkedId == R.id.rdLatina){
                iPais=1;
            }
        }else if(group == rdGenero){
            if(checkedId == R.id.rdHombre){
                isMan = true;
            }else if(checkedId == R.id.rdMujer){
                isMan = false;
            }
        }

        iExp = getExpectativa(iAño,iPais,isMan);
        iDes = iExp + iAño;
        txtVwExpectativa.setText(iExp+" años");
        txtVwDeceso.setText(iDes+"");
    }

    /**
     *
     * @param iAño Año
     * @param iRegion
     * @param isMan
     */
    public int getExpectativa(int iAño,int iRegion,boolean isMan){
        int iDifGen=0;
        int iExpc = 0, iExpcFinal=0;
        if(iAño<1960){ //Años 50s
            iDifGen = 10;
            switch(iRegion){
                case 0://Desarrollados
                    iExpc = 75;
                    break;
                case 1: //América latina
                    iExpc = 60;
                    break;
                case 2: //Asia
                    iExpc = 45;
                    break;
                case 3: //Africa
                    iExpc = 35;
                    break;
            }
        }else if(iAño>=1960 && iAño < 1970){ //Años 60s

            iDifGen = 9;
            switch(iRegion){
                case 0://Desarrollados
                    iExpc = 75;
                    break;
                case 1: //América latina
                    iExpc = 65;
                    break;
                case 2: //Asia
                    iExpc = 50;
                    break;
                case 3: //Africa
                    iExpc = 45;
                    break;
            }

        }else if(iAño>=1970 && iAño < 1980){ //Años 70s

            iDifGen = 8;
            switch(iRegion){
                case 0://Desarrollados
                    iExpc = 80;
                    break;
                case 1: //América latina
                    iExpc = 70;
                    break;
                case 2: //Asia
                    iExpc = 65;
                    break;
                case 3: //Africa
                    iExpc = 55;
                    break;
            }

        }else if(iAño>=1980 && iAño < 1990){ //Años 80s

            iDifGen = 7;
            switch(iRegion){
                case 0://Desarrollados
                    iExpc = 80;
                    break;
                case 1: //América latina
                    iExpc = 75;
                    break;
                case 2: //Asia
                    iExpc = 65;
                    break;
                case 3: //Africa
                    iExpc = 60;
                    break;
            }

        }else if(iAño>=1990 && iAño < 2000){ //Años 90s

            iDifGen = 6;
            switch(iRegion){
                case 0://Desarrollados
                    iExpc = 85;
                    break;
                case 1: //América latina
                    iExpc = 75;
                    break;
                case 2: //Asia
                    iExpc = 60;
                    break;
                case 3: //Africa
                    iExpc = 55;
                    break;
            }

        }else if(iAño>=2000 && iAño < 2010){ //Años 00s

            iDifGen = 4;
            switch(iRegion){
                case 0://Desarrollados
                    iExpc = 90;
                    break;
                case 1: //América latina
                    iExpc = 70;
                    break;
                case 2: //Asia
                    iExpc = 65;
                    break;
                case 3: //Africa
                    iExpc = 60;
                    break;
            }

        }

     if (isMan){
         iExpcFinal = iExpc-iDifGen/2;
     }else{
         iExpcFinal = iExpc+iDifGen/2;
     }
    return iExpcFinal;
    }
}
