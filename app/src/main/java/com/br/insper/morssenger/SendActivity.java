package com.br.insper.morssenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SendActivity extends AppCompatActivity {

    private void openDictActivity() {
        // Exemplo de código para abrir uma activity. Especificamente, a SendActivity.
        Intent intent = new Intent(this, DictActivity.class);
        startActivity(intent);

        // Depois de abrir a SendActivity, não há porque manter a MainActivity aberta.
        finish();
    }

    private void openMainActivity() {
        // Exemplo de código para abrir uma activity. Especificamente, a SendActivity.
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        // Depois de abrir a SendActivity, não há porque manter a MainActivity aberta.
        finish();
    }

    public void onBackPressed(){
        openMainActivity();
    }

    public int getCont() {
        return cont;
    }

    public final void setCont(int contador) {
        cont = contador;
    }

    private String contact;
    int cont = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        final List<String> ajuda = Arrays.asList("Estou com sede", "Estou com fome", "Preciso ir ao banheiro");

        final TranslatorHashMap tradutor = new TranslatorHashMap();
        final EditText editMessage = (EditText) findViewById(R.id.edit_msg);
        //final EditText editNumber = (EditText) findViewById(R.id.edit_Number);

        Button button = (Button) findViewById(R.id.button_enviar);
        Button dict = (Button) findViewById(R.id.button_dict);
        Button morse = (Button) findViewById(R.id.button_morse);
        Button delete = (Button) findViewById(R.id.button_delete);
        Button espaco = (Button) findViewById(R.id.button_espaco);
        Button help = (Button) findViewById(R.id.button_help);
        Button morse2 = (Button) findViewById(R.id.button_morse2);
        Button delete2 = (Button) findViewById(R.id.button_delete3);
        Button espaco2 = (Button) findViewById(R.id.button_espaco2);



        final Spinner spinner = (Spinner) findViewById(R.id.spinner);

        final Contacts contacts = new Contacts();

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, android.R.id.text1);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);
        for (String key : contacts.getNames()) {
            spinnerAdapter.add(key);
            spinnerAdapter.notifyDataSetChanged();
        }


        final StringBuilder tmpMsg = new StringBuilder();


        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editMessage.setText(ajuda.get(cont));
                cont++;
                if (cont == 3) {
                    cont = 0;
                }
            }

        });




        morse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpMsg.append(".");
                editMessage.append(".");

            }
        });

        morse2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                tmpMsg.append("-");
                editMessage.append("-");
                return true;
            }
        });

        morse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpMsg.append(".");
                editMessage.append(".");

            }
        });

        morse.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                tmpMsg.append("-");
                editMessage.append("-");
                return true;
            }
        });

        espaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tmpMsg.length() > 0) {
                    String str = editMessage.getText().toString();
                    str = str.replace(tmpMsg.toString(), "");
                    editMessage.setText(str);
                    Character letra = tradutor.morseToChar(tmpMsg.toString(), SendActivity.this);
                    editMessage.append(letra.toString());
                    tmpMsg.setLength(0);
                } else {
                    editMessage.append(" ");
                }

            }
        });

        espaco2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tmpMsg.length() > 0) {
                    String str = editMessage.getText().toString();
                    str = str.replace(tmpMsg.toString(), "");
                    editMessage.setText(str);
                    Character letra = tradutor.morseToChar(tmpMsg.toString(), SendActivity.this);
                    editMessage.append(letra.toString());
                    tmpMsg.setLength(0);
                } else {
                    editMessage.append(" ");
                }

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editMessage.getText().toString();
                if (str.length() > 0) {
                    str = str.substring(0, str.length() - 1);
                    editMessage.setText(str);
                }

            }
        });

        delete.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                editMessage.setText("");
                return true;
            }
        });

        delete2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editMessage.getText().toString();
                if (str.length() > 0) {
                    str = str.substring(0, str.length() - 1);
                    editMessage.setText(str);
                }

            }
        });

        delete2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                editMessage.setText("");
                return true;
            }
        });


        dict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDictActivity();
            }


        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = editMessage.getText().toString();

                if (message.isEmpty()) {
                    Utils.showToast(SendActivity.this, "Mensagem vazia!");
                    return;
                }

                //String number = editNumber.getText().toString();
                String number = contacts.getNumber(spinner.getSelectedItem().toString());

                if (!PhoneNumberUtils.isGlobalPhoneNumber(number)) {
                    Utils.showToast(SendActivity.this, "Telefone inválido!");
                    return;
                }

                SmsManager manager = SmsManager.getDefault();
                manager.sendTextMessage(number, null, message, null, null);
                editMessage.setText("");
                Utils.showToast(SendActivity.this, "Mensagen enviada!");
            }


        });
    }
}
