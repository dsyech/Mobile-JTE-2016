package id.ac.unsyiah.elektro.mobile.tugas08_pilihgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Alchusuvie on 3/17/2016.
 */
public class ActivityKedua extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        int pesanStr = pesan.getIntExtra("var1",0);
        ImageView gambar = (ImageView) findViewById(R.id.imageView);
        gambar.setImageResource(pesanStr);
    }
}
