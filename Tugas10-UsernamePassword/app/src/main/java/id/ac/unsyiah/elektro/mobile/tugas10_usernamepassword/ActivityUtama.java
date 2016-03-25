package id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Alchusuvie on 3/25/2016.
 */
public class ActivityUtama extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView txtLabel = (TextView) findViewById(R.id.txtAct2);
        txtLabel.setText(pesanStr);
}

    public void onClickbtnUbah (View view){
        Intent pesan = new Intent(getApplicationContext(), ActivityUbahLogin.class);
        startActivity(pesan);
    }
}
