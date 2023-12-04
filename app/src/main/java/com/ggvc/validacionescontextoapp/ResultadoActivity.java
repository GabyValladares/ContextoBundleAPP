package com.ggvc.validacionescontextoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultadoActivity extends AppCompatActivity {
    TextView tvResultado;
    Button btRegresar,btSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        tvResultado=findViewById(R.id.txtMensaje);
        btRegresar=findViewById(R.id.btnRegresar);
        btSalir=findViewById(R.id.btnSalir);
        //RECIBO SIEMPRE EN ONCREATE LA ESTRUCTURA BUNDLE
        //OBTENGO EL INTENT Y LUEGO LA INFORMACIÓN EXTRA
        Bundle parametros=this.getIntent().getExtras();
        //ALMACENO EN VARIABLES EL CONTENIDO DE LO RECIBIDO A TRAVÉS DE LA CLAVE
        String signo=parametros.getString("signoZodiacal");
        //tvResultado.setText(this.horoscopo(signo));
        String mensaje=this.horoscopo(signo);
        Toast.makeText(ResultadoActivity.this,mensaje,Toast.LENGTH_LONG).show();
        tvResultado.setText(mensaje);
    }
    public String horoscopo(String signo){
        if(!signo.isEmpty()){
            if (signo.compareTo("Aries")==0) {
                return "El día de hoy te vas a ganar la lotería";
            }
            }
            return "Ingrese un Signo Zodiacal";

        }

        public void salir(View view)
        {
            this.onDestroy();

        }
      public void regresar(View view)
    {
        Intent intent=new Intent(this, MainActivity.class);

        startActivity(intent);

    }
    }
