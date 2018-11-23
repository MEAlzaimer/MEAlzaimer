package mealzaimerproject.com.mealzaimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.gamesMEAlzheimer.ordemDoze.GamesActivity;

public class MenuInicialActivity extends AppCompatActivity {
    private ImageButton botaoJogos;
    private ImageButton botaoManual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_inicial);
        botaoJogos=(ImageButton)findViewById(R.id.btnJogos);
        botaoJogos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),GamesActivity.class));
            }
        });

    }
}
