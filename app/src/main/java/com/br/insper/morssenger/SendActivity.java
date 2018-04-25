package com.br.insper.morssenger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        final TranslatorHashMap tradutor = new TranslatorHashMap();
        final EditText editMessage = (EditText) findViewById(R.id.edit_msg);
        final EditText editNumber = (EditText) findViewById(R.id.edit_Number);

        Button button = (Button) findViewById(R.id.button_enviar);
        Button traco = (Button) findViewById(R.id.button_traco);
        Button ponto = (Button) findViewById(R.id.button_ponto);
        Button delete = (Button) findViewById(R.id.button_delete);
        Button espaco = (Button) findViewById(R.id.button_espaco);

        final StringBuilder tmpMsg = new StringBuilder();


        traco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpMsg.append("-");
                editMessage.append("-");


            }});



        ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpMsg.append(".");
                editMessage.append(".");

            }
        });

        espaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tmpMsg.length() >0) {
                    String str = editMessage.getText().toString();
                    str = str.replace(tmpMsg.toString(), "");
                    editMessage.setText(str);
                    Character letra = tradutor.morseToChar(tmpMsg.toString());
                    editMessage.append(letra.toString());
                    tmpMsg.setLength(0);
                }
                else{
                    editMessage.append(" ");
                }

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editMessage.getText().toString();
                if (str.length()>0) {
                    str = str.substring(0, str.length() - 1);
                    editMessage.setText(str);
                }

            }
        });

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String message = editMessage.getText().toString();

                if (message.isEmpty()) {
                    Utils.showToast(SendActivity.this, "Mensagem vazia!");
                    return;
                }

                String number = editNumber.getText().toString();

                if (!PhoneNumberUtils.isGlobalPhoneNumber(number)) {
                    Utils.showToast(SendActivity.this, "Telefone inválido!");
                    return;
                }

                SmsManager manager = SmsManager.getDefault();
                manager.sendTextMessage(number, null, message, null, null);
//                editMessage.setText("");
            }


        });
    }
}