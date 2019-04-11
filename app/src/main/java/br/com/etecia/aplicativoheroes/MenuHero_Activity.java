package br.com.etecia.aplicativoheroes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuHero_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_hero_layout);
    }


    public void abrirPersonagem(View view) {

        switch (view.getId()) {
            case R.id.idBatman:
                Intent intentb = new Intent(this, Batman_Activity.class);
                startActivity(intentb);
                break;
            case R.id.idAquaman:
                Intent intenta = new Intent(this, Aquaman_Activity.class);
                startActivity(intenta);
                break;
        }

    }
}
