package br.edu.ifc.concordia.hewerton.basicexplictintent.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.edu.ifc.concordia.hewerton.basicexplictintent.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recuperando view da activity
        Button next = findViewById(R.id.nextBtn);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Criando um intent explícito
                // Recupera-se o contexto da view
                // Chama-se explicitamente a classe da activity que deseja abrir
                Intent intent = new Intent(v.getContext(), TaskActivity.class);

                // Inicia-se a activity
                startActivity(intent);
            }
        });

    }
}
