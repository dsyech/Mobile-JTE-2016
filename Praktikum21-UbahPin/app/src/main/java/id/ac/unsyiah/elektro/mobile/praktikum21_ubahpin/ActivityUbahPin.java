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
public class ActivityUbahPin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubahpin);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView txtAct2 = (TextView) findViewById(R.id.txtAct3);
        txtAct2.setText(pesanStr);

    }

    public void onClickBtnKeActHome (View view){
        EditText pin = (EditText)findViewById(R.id.edtUbahPin);
        String editTextStr = pin.getText().toString();
        int pinInt = Integer.valueOf(editTextStr);

        SharedPreferences sharedPreferences = getSharedPreferences
                ("id.ac.unsyiah.elektro.mobile.prak21_ubahpin.PREF_BERSAMA", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("pin",pinInt);
        editor.apply();

        Intent pesan = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(pesan);
        finish();
    }

}




