package com.example.ujikom_david;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class datakeripik extends AppCompatActivity {
    private EditText edidbarang, edjenis, edrasa, edharga;
    private Button btaddata;
    private Button btviewdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datakeripik);
        edidbarang = (EditText) findViewById(R.id.editidbarang);
        edjenis = (EditText) findViewById(R.id.editiJenis);
        edrasa = (EditText) findViewById(R.id.editidrasa);
        edharga = (EditText) findViewById(R.id.editidharga);
        btaddata = (Button) findViewById(R.id.btnaddviewkeripik);
        btviewdata = (Button) findViewById(R.id.btnaddviewdatabarang);

        btaddata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String idbarang = edidbarang.getText().toString().trim();
                final String jenis = edjenis.getText().toString().trim();
                final String rasa = edrasa.getText().toString().trim();
                final String harga = edharga.getText().toString().trim();


                class AddNilai extends AsyncTask<Void, Void, String> {
                    ProgressDialog loading;

                    @Override
                    protected void onPreExecute() {
                        super.onPreExecute();
                        loading = ProgressDialog.show(datakeripik.this, "Menambahkan...", "Tunggu...", false, false);
                    }

                    @Override
                    protected void onPostExecute(String s) {
                        super.onPostExecute(s);
                        loading.dismiss();
                        Toast.makeText(datakeripik.this, s,
                                Toast.LENGTH_LONG).show();

                    }

                    @Override
                    protected String doInBackground(Void... v) {
                        HashMap<String, String> params = new HashMap<>();
                        params.put(com.example.ujikom_david.konfigurasi.KEY_EMP_ID, idbarang);
                        params.put(com.example.ujikom_david.konfigurasi.KEY_EMP_RASA, rasa);
                        params.put(com.example.ujikom_david.konfigurasi.KEY_EMP_HARGA, harga);


                        com.example.ujikom_david.RequestHandler rh = new com.example.ujikom_david.RequestHandler();
                        String res = rh.sendPostRequest(com.example.ujikom_david.konfigurasi.URL_ADD,
                                params);
                        return res;
                    }
                }
                AddNilai ae = new AddNilai();
                ae.execute();


            }


        });
        btviewdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(datakeripik.this, lihatbarang.class));
            }
        });


    }
}