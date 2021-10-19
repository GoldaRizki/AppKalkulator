package com.example.appkalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button persegi, segitiga, lingkaran;
    EditText inputPanjangAlasDiameter, inputLebarTinggi;
    TextView otKeliling, otLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        persegi = findViewById(R.id.tb_persegi);
        segitiga = findViewById(R.id.tb_segitiga);
        lingkaran = findViewById(R.id.tb_lingkaran);

        otKeliling = findViewById(R.id.tul_keliling);
        otLuas = findViewById(R.id.tul_luas);


        inputPanjangAlasDiameter = findViewById(R.id.panjangAlasDiameter);
        inputLebarTinggi = findViewById(R.id.lebarTinggi);


        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer keliling, luas, pjg, lbr;


                try {
                    pjg = Integer.parseInt(inputPanjangAlasDiameter.getText().toString());
                    lbr = Integer.parseInt(inputLebarTinggi.getText().toString());

                    keliling = 2 * (pjg + lbr);
                    luas = pjg * lbr;
                    otKeliling.setText("Keliling \t: " + keliling.toString());
                    otLuas.setText("Luas \t\t\t: " + luas.toString());
                } catch (NumberFormatException e) {
                   Toast iniToast = Toast.makeText(getApplicationContext(), "Masukkan Input yang benar", Toast.LENGTH_SHORT);
                    iniToast.show();
                }


            }


        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double keliling, luas, als, tng;



                try {
                    als = Double.parseDouble(inputPanjangAlasDiameter.getText().toString());
                    tng = Double.parseDouble(inputLebarTinggi.getText().toString());

                    keliling = 2 * Math.sqrt(Math.pow(als,2)+Math.pow(tng,2));
                    luas = 0.5*als*tng;
                    otKeliling.setText("Keliling \t: " + keliling.toString());
                    otLuas.setText("Luas \t\t\t: " + luas.toString());
                } catch (NumberFormatException e) {
                    Toast iniToast = Toast.makeText(getApplicationContext(), "Masukkan Input yang benar", Toast.LENGTH_SHORT);
                    iniToast.show();
                }


            }

        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double keliling, luas, D;



                try {
                    D = Double.parseDouble(inputPanjangAlasDiameter.getText().toString());


                    keliling = Math.PI*D;
                    luas = Math.PI*Math.pow((D/2), 2);
                    otKeliling.setText("Keliling \t: " + keliling.toString());
                    otLuas.setText("Luas \t\t\t: " + luas.toString());
                } catch (NumberFormatException e) {
                    Toast iniToast = Toast.makeText(getApplicationContext(), "Masukkan Input yang benar", Toast.LENGTH_SHORT);
                    iniToast.show();
                }
            }
        });

    }




}