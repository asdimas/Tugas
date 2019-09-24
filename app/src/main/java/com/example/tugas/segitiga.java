package com.example.tugas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class segitiga extends Activity {
    private EditText txtAlas;
    private EditText txtTinggi;
    private EditText txtMiring;
    private EditText txtKeliling;
    private EditText txtLuas;
    private Button btnHitung;

    /**
     * Method yang dipanggil pada saat applikaasi dijalankan
     * */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        txtAlas = (EditText) findViewById(R.id.txtAlas);
        txtTinggi = (EditText) findViewById(R.id.txtTinggi);
        txtMiring = (EditText) findViewById(R.id.txtMiring);
        txtKeliling= (EditText) findViewById(R.id.txtKeliling);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        btnHitung = (Button) findViewById(R.id.btnHitung);

    }

    /**
     * Method untuk Menghitung Luas Segitiga dipanggil pada saat button
     * Hitung Luas diklik
     *
     * @param view
     */
    public void hitungLuas(View view) {
        try {

            float alas = Integer.parseInt(txtAlas.getText().toString());
            float tinggi = Integer.parseInt(txtTinggi.getText().toString());
            float miring = Integer.parseInt(txtMiring.getText().toString());
            float luas = (alas * tinggi) / 2;
            float keliling = 2*miring + tinggi;
            txtLuas.setText(String.valueOf(luas));
            txtKeliling.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method untuk menutup activity dan kembali ke menu
     * @param view
     */
    public void backtoMenu(View view){
        finish();
    }
}
