package com.brunno.atividadereflexiva;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

     private TextView informacao;

        private Button nosMaisUm;
        private Button nosMenosUm;
        private TextView nosPontuacao;
        private int nosContadorRodada = 0;

        private Button elesMaisUm;
        private Button elesMenosUm;
        private TextView elesPontuacao;
        private int elesContadorRodada = 0;


        private Button truco;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        informacao = (TextView) findViewById(R.id.informacao);

        nosPontuacao = (TextView) findViewById(R.id.nosPontuacaoRodada);
        nosMaisUm = (Button) findViewById(R.id.nosmais1);
        nosMenosUm = (Button) findViewById(R.id.nosmenos1);

        elesPontuacao = (TextView) findViewById(R.id.elesPontuacaoRodada);
        elesMaisUm = (Button) findViewById(R.id.elesmais1);
        elesMenosUm = (Button) findViewById(R.id.elesmenos1);


        nosMaisUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nosContadorRodada < 11){
                    nosContadorRodada++;
                }
                else
                {
                    nosContadorRodada = 0;
                    informacao.setText("Nós Ganhamoos!!");
                }
                nosPontuacao.setText(nosContadorRodada + "");
            }
        });

        nosMenosUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nosContadorRodada > 0){
                    nosContadorRodada--;
                }
                nosPontuacao.setText(nosContadorRodada + "");
            }
        });

        elesMaisUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(elesContadorRodada < 11){
                    elesContadorRodada++;
                }
                else
                {
                    elesContadorRodada = 0;
                    informacao.setText("Eles Ganharaam!!");
                }
                elesPontuacao.setText(elesContadorRodada + "");
            }
        });

        elesMenosUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(elesContadorRodada > 0){
                    elesContadorRodada--;
                }
                elesPontuacao.setText(elesContadorRodada + "");
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_principal,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){

        switch (item.getItemId()){
            case R.id.item_sobre:
                Intent intent = new Intent(MainActivity.this,ActivityMenuSobre.class);
                startActivity(intent);
                        break;

        }

        return super.onOptionsItemSelected(item);
    }

}