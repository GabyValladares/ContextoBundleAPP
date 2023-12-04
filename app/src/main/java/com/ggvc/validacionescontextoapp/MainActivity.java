package com.ggvc.validacionescontextoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edSignoZodiacal;
    Button btIr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //COMUNICACIÓN DEL OBJETO LÓGICO EN EL LAYOUT CON EL OBJETO EN LA
        //ACTIVIDAD
        edSignoZodiacal=findViewById(R.id.txtSignoZodiacal);
        btIr=findViewById(R.id.btnEnviar);
        String signo=edSignoZodiacal.getText().toString();
        btIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //PASO 1) INSTANCIA DE OBJETO BUNDLE QUE PERMITE ESTRUCTURAR ENVÍO DE INFORMACIÓN
                Bundle parametrosEnvio=new Bundle();
                //CREO LA ESTRUCTURA A TRAVÉS DEL MÉTODO PUT
                parametrosEnvio.putString("signoZodiacal",signo);

                //PASO 2) INDICAR DE QUE ACTIVIDAD PARTO Y A QUE ACTIVIDAD LLEGO
                Intent intent=new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtras(parametrosEnvio);
                startActivity(intent);
            }
        });


    }
}