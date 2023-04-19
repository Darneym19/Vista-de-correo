package com.movilespascual.recyclerview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListaElementos> elementos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    public void init() {
        elementos = new ArrayList<>();
        elementos.add(new ListaElementos("#80F978", "Ivan", "Medellin", "Activo", "Ivan@gmail.com","310343900"));
        elementos.add(new ListaElementos("#F9DC78", "Jose", "Cartagena", "Activo", "Jose@gmail.com", "3213456789"));
        elementos.add(new ListaElementos("#7888F9", "Marcela", "Bogota", "Activo", "Marcela@gmail.com","3210009890"));
        elementos.add(new ListaElementos("#F33E95", "Karen", "Cali", "Activo", "Karen@gmail.com","3219009876"));
        elementos.add(new ListaElementos("#F35724", "Lucas", "Santa Marta", "Activo", "Lucas@gmail.com","3216753421"));

        ListAdapter listAdapter = new ListAdapter(elementos, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}