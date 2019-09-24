package com.example.tugas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class persegi extends Activity {
    private EditText txtPanjang;
    private EditText txtLebar;
    private EditText txtLuas;
    private EditText txtKeliling;
    private Button btnHitung;

    /**
     * Method yang dipanggil pada saat applikaasi dijalankan
     * */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        txtPanjang = (EditText) findViewById(R.id.txtPanjang);
        txtLebar = (EditText) findViewById(R.id.txtLebar);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        txtKeliling = (EditText) findViewById(R.id.txtKeliling);
        btnHitung = (Button) findViewById(R.id.btnHitung);

    }

    /**
     * Method untuk Menghitung Luas Persegi panjang dipanggil pada saat button
     * Hitung Luas diklik
     *
     * @param view
     */
    public void hitungLuas(View view) {
        try {

            int panjang = Integer.parseInt(txtPanjang.getText().toString());
            int lebar = Integer.parseInt(txtLebar.getText().toString());
            int keliling = 2*panjang + 2*lebar;
            int luas = panjang * lebar;
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
