package com.example.tugas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class lingkaran extends Activity {
    private EditText txtDiameter;
    private EditText txtLuas;
    private EditText txtKeliling;
    private Button btnHitung;

    /**
     * Method yang dipanggil pada saat applikaasi dijalankan
     * */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        txtDiameter = (EditText) findViewById(R.id.txtDiameter);
        txtKeliling= (EditText) findViewById(R.id.txtKeliling);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        btnHitung = (Button) findViewById(R.id.btnHitung);

    }

    /**
     * Method untuk Menghitung Luas Lingkaran dipanggil pada saat button
     * Hitung Luas diklik
     *
     * @param view
     */
    public void hitungLuas(View view) {
        try {

            int diameter = Integer.parseInt(txtDiameter.getText().toString());
            double phi = 3.14;
            double keliling =  2 * diameter ;
            double luas = 0.25 *  phi * diameter * diameter;
            txtKeliling.setText(String.valueOf(keliling));
            txtLuas.setText(String.valueOf(luas));
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
