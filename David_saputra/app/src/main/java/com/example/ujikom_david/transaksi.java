package com.example.ujikom_david;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class transaksi extends AppCompatActivity {
    Button btnhitung,bkirim;
    EditText nama, jumlah;
    RadioButton pil1, pil2;
    CheckBox cek1, cek2, cek3;
    TextView total;
    Double harga1, harga2, harga3, totalharga, harga1asin,harga2asin,harga3asin;
    Double tjbeli;
    String rasa1,rasa2,jenis1,jenis2,jenis3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi);
        btnhitung = (Button) findViewById(R.id.hitung);
        nama = (EditText) findViewById(R.id.namapembeli);
        jumlah = (EditText) findViewById(R.id.jumlahbeli);
        pil1 = (RadioButton) findViewById(R.id.rdmanis);
        pil2 = (RadioButton) findViewById(R.id.rdasin);
        cek1 = (CheckBox) findViewById(R.id.cekdaunubi);
        cek2 = (CheckBox) findViewById(R.id.cekbayam);
        cek3 = (CheckBox) findViewById(R.id.cekdaunmelinjo);
        total=(TextView)findViewById(R.id.totalharga);
        bkirim=(Button)findViewById(R.id.btnbayarkirim);
        //passing data

        // menghitung total harga pada tombol hitung
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pil1.isChecked() && cek1.isChecked()
                        && cek2.isChecked()&&cek3.isChecked()) {
                    rasa1 = pil1.getText().toString();
                    rasa2 = "";
                    jenis1 = cek1.getText().toString();
                    jenis2 = cek2.getText().toString();
                    jenis3 = cek3.getText().toString();
                    harga1 = 20000.0;
                    harga2 = 18500.0;
                    harga3 = 17000.0;
                    tjbeli = Double.parseDouble(jumlah.getText().toString());
                    totalharga = tjbeli * ((harga1 + harga2 + harga3));
                    total.setText("Total Bayar Rp.  " + String.valueOf(totalharga));
                } else if (pil1.isChecked() && cek1.isChecked()) {
                    rasa1 = pil1.getText().toString();
                    rasa2 = "";
                    jenis1 = cek1.getText().toString();
                    jenis2 = "";
                    jenis3 = "";
                    harga1 = 20000.0;
                    harga2 = 18500.0;
                    harga3 = 17000.0;
                    tjbeli = Double.parseDouble(jumlah.getText().toString());
                    totalharga = tjbeli * ((harga1));
                    total.setText("Total Bayar Rp.  " + String.valueOf(totalharga));
                } else if (pil1.isChecked() &&cek2.isChecked()) {
                    rasa1 = pil1.getText().toString();
                    rasa2 = "";
                    jenis1 = "";
                    jenis2 = cek2.getText().toString();
                    jenis3 = "";
                    harga1 = 20000.0;
                    harga2 = 18500.0;
                    harga3 = 17000.0;
                    tjbeli = Double.parseDouble(jumlah.getText().toString());
                    totalharga = tjbeli * ((harga2));
                    total.setText("Total Bayar Rp.  " + String.valueOf(totalharga));
                }else if (pil1.isChecked() &&  cek3.isChecked()) {
                    rasa1 = pil1.getText().toString();
                    rasa2 = "";
                    jenis1 = "";
                    jenis2 = "";
                    jenis3 = cek3.getText().toString();
                    harga1 = 20000.0;
                    harga2 = 18500.0;
                    harga3 = 17000.0;
                    tjbeli = Double.parseDouble(jumlah.getText().toString());
                    totalharga = tjbeli * ((harga3));
                    total.setText("Total Bayar Rp.  " + String.valueOf(totalharga));
                } else if (pil1.isChecked()&& cek1.isChecked() &&  cek2.isChecked()) {
                    rasa1 = pil1.getText().toString();
                    rasa2 = "";
                    jenis1 = cek1.getText().toString();
                    jenis2 = cek2.getText().toString();
                    jenis3 = "";
                    harga1 = 20000.0;
                    harga2 = 18500.0;
                    harga3 = 17000.0;
                    tjbeli = Double.parseDouble(jumlah.getText().toString());
                    totalharga = tjbeli * ((harga1+harga2));
                    total.setText("Total Bayar Rp.  " + String.valueOf(totalharga));
                } else if (pil1.isChecked()&& cek1.isChecked() &&  cek3.isChecked()) {
                    rasa1 = pil1.getText().toString();
                    rasa2 = "";
                    jenis1 = cek1.getText().toString();
                    jenis2 = "";
                    jenis3 = cek3.getText().toString();
                    harga1 = 20000.0;
                    harga2 = 18500.0;
                    harga3 = 17000.0;
                    tjbeli = Double.parseDouble(jumlah.getText().toString());
                    totalharga = tjbeli * ((harga1 + harga3));
                    total.setText("Total Bayar Rp.  " + String.valueOf(totalharga));
                } else if (pil2.isChecked()&& cek1.isChecked() && cek2.isChecked() &&  cek3.isChecked()) {
                    rasa1 = "";
                    rasa2 = pil1.getText().toString();
                    jenis1 = cek1.getText().toString();
                    jenis2 = cek2.getText().toString();
                    jenis3 = cek3.getText().toString();
                    harga1asin = 19000.0;
                    harga2asin = 17000.0;
                    harga3asin = 16000.0;
                    tjbeli = Double.parseDouble(jumlah.getText().toString());
                    totalharga = tjbeli * ((harga1asin + harga2asin + harga3asin));
                    total.setText("Total Bayar Rp.  " + String.valueOf(totalharga));
                }else if (pil2.isChecked()&& cek1.isChecked()) {
                    rasa1 = "";
                    rasa2 = pil2.getText().toString();
                    jenis1 = cek1.getText().toString();
                    jenis2 = "";
                    jenis3 = "";
                    harga1asin = 19000.0;
                    harga2asin = 17000.0;
                    harga3asin = 16000.0;
                    tjbeli = Double.parseDouble(jumlah.getText().toString());
                    totalharga = tjbeli * ((harga1asin));
                    total.setText("Total Bayar Rp.  " + String.valueOf(totalharga));
                } else if (pil2.isChecked()&& cek2.isChecked()) {
                    rasa1 = "";
                    rasa2 = pil2.getText().toString();
                    jenis1 = "";
                    jenis2 = cek2.getText().toString();
                    jenis3 = "";
                    harga1asin = 19000.0;
                    harga2asin = 17000.0;
                    harga3asin = 16000.0;
                    tjbeli = Double.parseDouble(jumlah.getText().toString());
                    totalharga = tjbeli * ((harga2asin));
                    total.setText("Total Bayar Rp.  " + String.valueOf(totalharga));
                } else if (pil2.isChecked()&& cek3.isChecked()) {
                    rasa1 = "";
                    rasa2 = pil1.getText().toString();
                    jenis1 = "";
                    jenis2 = "";
                    jenis3 = cek3.getText().toString();
                    harga1asin = 19000.0;
                    harga2asin = 17000.0;
                    harga3asin = 16000.0;
                    tjbeli = Double.parseDouble(jumlah.getText().toString());
                    totalharga = tjbeli * ((harga3asin));
                    total.setText("Total Bayar Rp.  " + String.valueOf(totalharga));
                }else if (pil2.isChecked()&&cek1.isChecked()&& cek2.isChecked()) {
                    rasa1 = "";
                    rasa2 = pil2.getText().toString();
                    jenis1 = cek1.getText().toString();
                    jenis2 = cek2.getText().toString();
                    jenis3 = "";
                    harga1asin = 19000.0;
                    harga2asin = 17000.0;
                    harga3asin = 16000.0;
                    tjbeli = Double.parseDouble(jumlah.getText().toString());
                    totalharga = tjbeli * ((harga1asin+harga2asin));
                    total.setText("Total Bayar Rp.  " + String.valueOf(totalharga));
                }else if (pil2.isChecked()&&cek1.isChecked()&& cek3.isChecked()) {
                    rasa1 = "";
                    rasa2 = pil2.getText().toString();
                    jenis1 = cek1.getText().toString();
                    jenis2 = "";
                    jenis3 = cek3.getText().toString();
                    harga1asin = 19000.0;
                    harga2asin = 17000.0;
                    harga3asin = 16000.0;
                    tjbeli = Double.parseDouble(jumlah.getText().toString());
                    totalharga = tjbeli * ((harga1asin + harga2asin));
                    total.setText("Total Bayar Rp.  " + String.valueOf(totalharga));
                }


                    bkirim.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent setdata1=new Intent
                                    (transaksi.this, com.example.ujikom_david.tampiltransaksi.class);
                            //AMBIL NAMA DATA 1
                            setdata1.putExtra("Data1",nama.getText().toString());
                            //AMBIL DATA 2 JUMLAH BELI

                            setdata1.putExtra("Data2",jumlah.getText().toString());

                            //AMBIL DATA 3 JENIS KERIPIK
                            setdata1.putExtra("Data3",jenis1);
                            setdata1.putExtra("Data4",jenis2);
                            setdata1.putExtra("Data5",jenis3);
                            //KIRIM DATA RASA KERIPIK
                            setdata1.putExtra("Data6",rasa1);
                            setdata1.putExtra("Data7",rasa2);

                            //TOTAL HARGA
                            setdata1.putExtra("Data8",Double.toString(totalharga));

                            startActivity(setdata1);

                        }
                    });
            }
        });

    }
}
