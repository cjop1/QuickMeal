package com.grupo4.reto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Declaración de varibles
     **/

    /**
     * Botón de Ingreso
     **/
    Button btn_Ingresar;

    /**
     * Texto de Bienvenida
     **/
    TextView txt_Bienvenida;

    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Constructor texto de Bienvenida
         **/
        txt_Bienvenida = (TextView)findViewById(R.id.txt_Bienvenida);

        /**
         * Constructor botón de ingreso
         **/
        btn_Ingresar = (Button)findViewById(R.id.btn_Ingresar);
        btn_Ingresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txt_Bienvenida.setText("Nos alegra que estés aquí");
                Toast.makeText(getApplicationContext(), "Se oprimió el botón de Ingresar", Toast.LENGTH_LONG).show();
            }
        });
    }

    /**
     * Implementación de menú de opciones
     **/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuprincipal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.inicio) {
            Toast.makeText(getApplicationContext(), "Empecemos", Toast.LENGTH_LONG).show();
            Intent pantallaInicio = new Intent(this, MainActivity.class);
            startActivity(pantallaInicio);
        }
        if (id == R.id.menu){
            Toast.makeText(getApplicationContext(), "Escoge nuestras deliciosas recetas", Toast.LENGTH_LONG).show();
            Intent pantallaMenu = new Intent(this, MainActivity2.class);
            startActivity(pantallaMenu);
        }
        if (id == R.id.combos){
            Toast.makeText(getApplicationContext(), "Más disfrute al mejor precio", Toast.LENGTH_LONG).show();
            Intent pantallaCombos = new Intent(this, MainActivity3.class);
            startActivity(pantallaCombos);
        }
        if (id == R.id.domicilios){
            Toast.makeText(getApplicationContext(), "Nada como la comodidad de tu propia casa", Toast.LENGTH_LONG).show();
            Intent pantallaDomicilios = new Intent(this, MainActivity4.class);
            startActivity(pantallaDomicilios);
        }
        if (id == R.id.restaurantes){
            Toast.makeText(getApplicationContext(), "Ven, visítanos. Te sorprenderás", Toast.LENGTH_LONG).show();
            Intent pantallaRestaurantes = new Intent(this, MainActivity5.class);
            startActivity(pantallaRestaurantes);
        }
        if (id == R.id.pagos){
            Toast.makeText(getApplicationContext(), "Todos los medios de pago a tu alcance", Toast.LENGTH_LONG).show();
            Intent pantallaPagos = new Intent(this, MainActivity6.class);
            startActivity(pantallaPagos);
        }
        if (id == R.id.contacto){
            Toast.makeText(getApplicationContext(), "Seamos los mejores amigos", Toast.LENGTH_LONG).show();
            Intent pantallaContacto = new Intent(this, MainActivity7.class);
            startActivity(pantallaContacto);
        }
        return super.onOptionsItemSelected(item);
    }
}