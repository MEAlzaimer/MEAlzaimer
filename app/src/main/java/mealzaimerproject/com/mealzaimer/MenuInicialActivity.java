package mealzaimerproject.com.mealzaimer;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.gamesMEAlzheimer.ordemDoze.GamesActivity;

public class MenuInicialActivity extends AppCompatActivity {
    private ImageButton botaoJogos;
    private ImageButton botaoManual;
    private ImageButton eu;
    private ImageButton familia;
    private ImageButton botaoEnderecos;
    private ImageButton botaoRemedios;
    private ImageButton botaoTarefas;
    private ImageButton botaoAnotacoes;
    private ImageButton botaoDicas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);
        botaoJogos=(ImageButton)findViewById(R.id.btnJogos);
        botaoJogos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),GamesActivity.class));
                finish();
            }
        });
        eu=(ImageButton)findViewById(R.id.btnEu);
        eu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EuActivity.class));

            }
        });
        familia=(ImageButton)findViewById(R.id.btnFamilia);
        familia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FamiliaActivity.class));
            }
        });
        botaoEnderecos=(ImageButton)findViewById(R.id.btnEnderecos);
        botaoEnderecos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EmDesenvolvimentoActivity.class));

            }
        });
        botaoTarefas=(ImageButton)findViewById(R.id.btnTarefas);
        botaoTarefas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EmDesenvolvimentoActivity.class));
            }
        });
        botaoAnotacoes=(ImageButton)findViewById(R.id.btnAnotacoes);
        botaoAnotacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EmDesenvolvimentoActivity.class));
            }
        });
        botaoRemedios=(ImageButton)findViewById(R.id.btnRemedios);
        botaoRemedios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EmDesenvolvimentoActivity.class));
            }
        });
        botaoManual=(ImageButton)findViewById(R.id.btnManual);
        botaoManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EmDesenvolvimentoActivity.class));
            }
        });
        botaoDicas=(ImageButton)findViewById(R.id.btnSaude);
        botaoDicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),EmDesenvolvimentoActivity.class));
            }
        });


    }
}
