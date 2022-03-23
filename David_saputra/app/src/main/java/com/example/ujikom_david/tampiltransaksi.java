package com.example.ujikom_david;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class tampiltransaksi extends AppCompatActivity {
    Button btnbelilagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampiltransaksi);
        btnbelilagi=(Button)findViewById(R.id.btnbelilagi);

        btnbelilagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tampiltransaksi.this,transaksi.class));
            }
        });

        //PASING DATA NAMA PEMBELI
        TextView getdata1=(TextView)findViewById(R.id.data1);
        getdata1.setText(""+getIntent().getStringExtra("Data1"));
        //PASING DATA JUMLAH PEMBELI
        TextView getdata2=(TextView)findViewById(R.id.data2);
        getdata2.setText(""+getIntent().getStringExtra("Data2"));

        //PASING DATA JENIS KERIPIK
        TextView getdata3=(TextView)findViewById(R.id.data3);
        getdata3.setText
                (" "+getIntent().getStringExtra("Data3") +
                        getIntent().getStringExtra("Data4")+getIntent().getStringExtra("Data5"));


        //PASING DATA NAMA RASA KERIPIK
        TextView getdata4=(TextView)findViewById(R.id.data4);
        getdata4.setText(""+getIntent().getStringExtra("Data6") +
                getIntent().getStringExtra("Data7"));

        //PASING DATA HARGA BAYAR
        TextView getdata5=(TextView)findViewById(R.id.data5);
        getdata5.setText("RP. "+getIntent().getStringExtra("Data8"));

    }
}