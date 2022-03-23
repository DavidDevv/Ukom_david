package com.example.ujikom_david;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class homepage extends AppCompatActivity {
    private Button btnhomepage, btntranshome,btnjenkripik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        btnhomepage=(Button) findViewById(R.id.btnhome);
        btntranshome=(Button) findViewById(R.id.btntransaksi);
        btnjenkripik=(Button) findViewById(R.id.btnjenkripik);

        btntranshome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homepage.this, com.example.ujikom_david.transaksi.class));
                finish();
            }
        });
        btnjenkripik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homepage.this, com.example.ujikom_david.menudanjeniskeripik.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.listmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.op1:
                Toast.makeText(getApplicationContext(),"HOME PAGE",
                        Toast.LENGTH_SHORT).show();
                startActivity(new Intent(homepage.this,homepage.class));
                break;
            case R.id.op2:
                Toast.makeText(getApplicationContext(),"menu dan jenis keripik",
                        Toast.LENGTH_SHORT).show();
                startActivity(new Intent(homepage.this, com.example.ujikom_david.menudanjeniskeripik.class));
                break;

            case R.id.op3:
                Toast.makeText(getApplicationContext(),"INPUT DATA",
                        Toast.LENGTH_SHORT).show();
                startActivity(new Intent(homepage.this, com.example.ujikom_david.inputkeripik.class));
                break;
            case R.id.op5:
                Toast.makeText(getApplicationContext(),"INPUT DATA PENJUALAN",
                        Toast.LENGTH_SHORT).show();
                startActivity(new Intent(homepage.this, com.example.ujikom_david.datapenjualan.class));
                break;
        }
        return true;
    }
}