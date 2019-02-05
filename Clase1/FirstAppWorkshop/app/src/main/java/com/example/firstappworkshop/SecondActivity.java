package com.example.firstappworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView tv2_nombre;
    private EditText et2_respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et2_respuesta = (EditText) findViewById(R.id.et2Respuesta);
        tv2_nombre = (TextView) findViewById(R.id.textView2Nombre);

        // Sacamos el intent con el que se ha iniciado la Activity.
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        // Comprobamos que el Bundle contenga datos, para evitar posibles
        // errores. Si no lo comprobamos y el Intent no tiene incorporado un
        // bundle, al intentar utilizar el bundle después nos saltará una
        // excepción por intentar un objeto que no existe (NullPointerException).
        if (b != null) {
            String datos = b.getString("datos");
            tv2_nombre.setText("Hola " + datos);

            // Se puede hacer la asignación directamente:
            //tv2_nombre.setText("Hola " + getIntent().getExtras().getString("datos"));
        } else{
            tv2_nombre.setText("");
        }
    }

    public void Accept(View view){
        if (et2_respuesta.getText().length() != 0) {
            Intent i = new Intent(this, MainActivity.class);
            i.putExtra("accept_act2", et2_respuesta.getText().toString());
            i.putExtra("cancel_act2", "");
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Ingrese un nombre", Toast.LENGTH_SHORT).show();
        }
    }

    public void Cancel(View view){
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("cancel_act2", " ");
        startActivity(i);
    }

}
