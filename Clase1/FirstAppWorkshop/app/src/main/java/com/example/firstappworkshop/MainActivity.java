package com.example.firstappworkshop;

import android.content.Intent;
import android.provider.MediaStore;
import android.service.autofill.TextValueSanitizer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity<tv1_respuesta> extends AppCompatActivity {

    private EditText et1_name;
    private TextView tv1_respuesta;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    private static int j = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1_respuesta = (TextView) findViewById(R.id.textView1Respuesta);
        et1_name = (EditText) findViewById(R.id.et1_nombre);

        Intent i = getIntent();

        Bundle b = i.getExtras();

        // Comprobamos que el Bundle contenga datos, para evitar posibles
        // errores. Si no lo comprobamos y el Intent no tiene incorporado un
        // bundle, al intentar utilizar el bundle después nos saltará una
        // excepción por intentar un objeto que no existe (NullPointerException).
        if (b != null) {
            String cancel_act2 = b.getString("cancel_act2");
            String accept_act2 = b.getString("accept_act2");
            if(cancel_act2.isEmpty()){
                tv1_respuesta.setText("Hola " + accept_act2);
            }else {
                tv1_respuesta.setText("El usuario canceló la operación");
            }
            // Se puede hacer la asignación directamente:
            //tv1_respuesta.setText(getIntent().getExtras().getString("datos"));
        }

        else{
            tv1_respuesta.setText("");
        }
    }

    public void Ir(View view){
        // Comprobamos que el EditText contenga algo escrito, de no tener nada
        // escrito no hará nada cuando se pulse el botón.
        if (et1_name.getText().length() != 0) {
            // Utilizamos un objeto de la clase Bundle para incluir un par
            // "Clave/Valor", este objeto tendrá como clave "datos", y su valor
            // será el texto que se introduzca en el EditText.
            Bundle bundle = new Bundle();
            bundle.putString("datos", et1_name.getText().toString());

            // La clase Intent establece un link entre esta Activity y la nueva
            // que queremos lanzar, para ello al instanciar el Intent
            // introducimos como parámetros esta propia Activity, y la clase que
            // representa a la nueva Activity.
            Intent intent = new Intent(this, SecondActivity.class);

            // En el Intent añadimos el Bundle, para que lleve la información a
            // la siguiente Activity.
            intent.putExtras(bundle);
//            inte.putExtra("EXTRA_MESSAGE",message);
            //i.putExtra("nombre_act1", et1_nombre.getText().toString());
            // Lanzamos la siguiente Activity.
            startActivity(intent);
        }else{
            Toast.makeText(this, "Ingrese un nombre", Toast.LENGTH_SHORT).show();
        }

    }

    public void SacarFoto(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

}
