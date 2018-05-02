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

public class DictActivity extends AppCompatActivity {

    private void backToSend() {
        // Exemplo de código para abrir uma activity. Especificamente, a SendActivity.
        Intent intent = new Intent(this, SendActivity.class);
        startActivity(intent);

        // Depois de abrir a SendActivity, não há porque manter a MainActivity aberta.
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dict);

        Button feito = (Button) findViewById(R.id.button_feito);

        final TextView dict = (TextView) findViewById(R.id.Dict);


        final TranslatorHashMap tradutor = new TranslatorHashMap();
        StringBuilder tabela = new StringBuilder();



        for (int i = 0; i < tradutor.getABC().size(); i++) {
            tabela.append(tradutor.getABC().get(i));
            tabela.append(" = \t");
            tabela.append(tradutor.getMorse().get(i));
            tabela.append("\n");

        }

        dict.setText(tabela.toString());

        feito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToSend();
            }


        });


    }
}
