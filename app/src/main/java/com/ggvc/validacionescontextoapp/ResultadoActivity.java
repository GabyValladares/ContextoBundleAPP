package com.ggvc.validacionescontextoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultadoActivity extends AppCompatActivity {
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        tvResultado=findViewById(R.id.txtMensaje);
        //RECIBO SIEMPRE EN ONCREATE LA ESTRUCTURA BUNDLE
        //OBTENGO EL INTENT Y LUEGO LA INFORMACIÓN EXTRA
        Bundle parametros=this.getIntent().getExtras();
        //ALMACENO EN VARIABLES EL CONTENIDO DE LO RECIBIDO A TRAVÉS DE LA CLAVE
        String signo=parametros.getString("signoZodiacal");
        //tvResultado.setText(this.horoscopo(signo));
        String mensaje=this.horoscopo(signo);
        Toast.makeText(ResultadoActivity.this,mensaje,Toast.LENGTH_LONG).show();
        tvResultado.setText("hola");
    }
    public String horoscopo(String signo){
        if(!signo.isEmpty()){
            if (signo.compareTo("Aries")==1) {
                return "El día de hoy te vas a ganar la lotería";
            }
            }
            return "";

        }


    }
