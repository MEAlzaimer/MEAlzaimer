package mealzaimerproject.com.mealzaimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import mealzaimerproject.com.mealzaimer.ordemDoze.GameOrdemStartActivity;


public class GamesActivity extends AppCompatActivity {
   private ImageButton botaoJogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        botaoJogo=findViewById(R.id.ordemStart);

        botaoJogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(),GameOrdemStartActivity.class));
            }
        });


    }
}
