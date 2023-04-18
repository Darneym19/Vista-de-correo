package com.movilespascual.recyclerview;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VistaCorreo extends AppCompatActivity {
    TextView recibir, recibir2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_correo);

        recibir = findViewById(R.id.dato1);
        recibir2 = findViewById(R.id.dato2);

        String name = getIntent().getStringExtra("name");
        recibir.setText(name);
        String ciudad = getIntent().getStringExtra("ciudad");
        recibir2.setText(ciudad);
    }
}