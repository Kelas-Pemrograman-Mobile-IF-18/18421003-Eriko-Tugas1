package com.eriko.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    TextView txtNama;
    TextView txtUmur;
    TextView txtAlamat;
    TextView txtLahir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (TextView) findViewById(R.id.txtNama);
        txtNama.setText("Eriko Zakaria");

        txtUmur = (TextView) findViewById(R.id.txtUmur);
        txtUmur.setText("21 Tahun");

        txtAlamat = (TextView) findViewById(R.id.txtAlamat);
        txtAlamat.setText("Jl. Kartini gg. Setia Negara No. 46");

        txtLahir = (TextView) findViewById(R.id.txtLahir);
        txtLahir.setText("07  Desember 1999");

    }
}