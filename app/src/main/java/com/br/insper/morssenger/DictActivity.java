package com.br.insper.morssenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class DictActivity extends AppCompatActivity {

    private void backToSend() {
        // Exemplo de código para abrir uma activity. Especificamente, a SendActivity.
        Intent intent = new Intent(this, SendActivity.class);
        startActivity(intent);

        // Depois de abrir a SendActivity, não há porque manter a MainActivity aberta.
        finish();
    }

    public void onBackPressed(){
        backToSend();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dict);

//        Button feito = (Button) findViewById(R.id.button_feito);

        final TextView dict = (TextView) findViewById(R.id.Dict);
        final List<Character> abc = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'w', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9');


        final Translator tradutor = new Translator();
        StringBuilder tabela = new StringBuilder();



        for (Character s : abc) {
            tabela.append(s);
            tabela.append(" = \t");
            tabela.append(tradutor.charToMorse(s));
            tabela.append("\n");

        }

        dict.setText(tabela.toString());

//        feito.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                backToSend();
//            }
//
//
//        });


    }
}
