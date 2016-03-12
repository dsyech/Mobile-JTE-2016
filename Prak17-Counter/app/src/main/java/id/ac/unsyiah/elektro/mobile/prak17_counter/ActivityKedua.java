package id.ac.unsyiah.elektro.mobile.prak17_counter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Alchusuvie on 3/12/2016.
 */
public class ActivityKedua extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesan1Str = pesan.getStringExtra("var1");

        TextView txtAct2 = (TextView) findViewById(R.id.txtAct2);
        txtAct2.setText(pesan1Str);
}


}
