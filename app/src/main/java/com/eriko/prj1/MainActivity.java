package com.eriko.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    TextView txtNama, txtNpm, txtUmur, txtAlamat,  txtJudul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtJudul = (TextView) findViewById(R.id.txtJudul);
        txtJudul.setText("Biodata");

        txtNama = (TextView) findViewById(R.id.txtNama);
        txtNama.setText("Eriko Zakaria");

        txtNpm = (TextView) findViewById(R.id.txtNpm);
        txtNpm.setText("18421003");

        txtUmur = (TextView) findViewById(R.id.txtUmur);
        txtUmur.setText("21");

        txtAlamat = (TextView) findViewById(R.id.txtAlamat);
        txtAlamat.setText("Jl. Kartini gg. Setia Negara No. 46");
    }
}