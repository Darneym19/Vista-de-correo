package com.movilespascual.recyclerview;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VistaCorreo extends AppCompatActivity {
    TextView recibir, recibir2, recibir3, recibir4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_correo);

        recibir = findViewById(R.id.nom);
        recibir2 = findViewById(R.id.city);
        recibir3 = findViewById(R.id.correo);
        recibir4 = findViewById(R.id.tel);

        String name = getIntent().getStringExtra("name");
        recibir.setText(name);
        String ciudad = getIntent().getStringExtra("ciudad");
        recibir2.setText(ciudad);
        String correo = getIntent().getStringExtra("correo");
        recibir3.setText(correo);
        String tel = getIntent().getStringExtra("tel");
        recibir4.setText(tel);
    }
}