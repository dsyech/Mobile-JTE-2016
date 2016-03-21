package id.ac.unsyiah.elektro.mobile.praktikum21_ubahpin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Alchusuvie on 3/19/2016.
 */
public class ActivityHalUtama extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halutama);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView txtAct2 = (TextView) findViewById(R.id.txtAct2);
        txtAct2.setText(pesanStr);

    }

    public void onClickBtnKeAct3 (View view){
            Intent pesan = new Intent(getApplicationContext(), ActivityUbahPin.class);
            pesan.putExtra("var1", "Masukkan PIN Baru Anda");
            startActivity(pesan);
    }
}




