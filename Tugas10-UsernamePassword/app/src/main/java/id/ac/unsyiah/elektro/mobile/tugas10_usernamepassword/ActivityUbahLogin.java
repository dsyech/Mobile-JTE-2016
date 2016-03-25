package id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Alchusuvie on 3/25/2016.
 */
public class ActivityUbahLogin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubahlogin);


    }

    public void onClickBtnSimpan(View view){
        EditText userBaru = (EditText) findViewById(R.id.edtUserBaru);
        String userStr = userBaru.getText().toString();

        EditText passBaru = (EditText) findViewById(R.id.edtPassBaru);
        String passStr = passBaru.getText().toString();



        SharedPreferences sharedPreferences = getSharedPreferences
                ("id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword.PREF_BERSAMA", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("user",userStr);
        editor.putString("pass",passStr);
        editor.apply();

        Intent pesan = new Intent(getApplicationContext(), MainActivity.class);
        pesan.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(pesan);
        finish();
    }
}
