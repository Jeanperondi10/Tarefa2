package br.edu.ifc.concordia.hewerton.basicexplictintent.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.edu.ifc.concordia.hewerton.basicexplictintent.R;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);


        Button next2 = findViewById(R.id.nextBtn2);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Criando um intent explícito
                // Recupera-se o contexto da view
                // Chama-se explicitamente a classe da activity que deseja abrir
                Intent intent2 = new Intent(v.getContext(),MainActivity.class);

                // Inicia-se a activity
                startActivity(intent2);
            }
        });
    }
}
