package id.ac.unsyiah.elektro.mobile.tugas09_tebakgambar;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickGambar (View view){


        int[] photos={R.drawable.mobil, R.drawable.motor,R.drawable.becakmotor,R.drawable.becakdayung, R.drawable.sepeda};
        Random ran=new Random();
        int i=ran.nextInt(photos.length);

        switch (view.getId()) {
            case R.id.img1:
              if (R.id.img1 == photos[i]) {
                  Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                    pesan.putExtra("var1","Selamat Jawaban Kamu Benar");
                    pesan.putExtra("var2",photos[i]);
                    startActivity(pesan);

                } else {
                  Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                    pesan.putExtra("var1", "Maaf Jawaban Kamu Salah");
                    pesan.putExtra("var2",photos[i]);
                    startActivity(pesan);
                }

                break;

            case R.id.img2:
              if (R.id.img2 == photos[i]) {
                  Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                  pesan.putExtra("var1","Selamat Jawaban Kamu Benar");
                  pesan.putExtra("var2",photos[i]);
                  startActivity(pesan);


              } else {
                  Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                  pesan.putExtra("var1", "Maaf Jawaban Kamu Salah");
                  pesan.putExtra("var2",photos[i]);
                  startActivity(pesan);
              }

                break;

            case R.id.img3:
            if (R.id.img3 == photos[i]) {
                Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                pesan.putExtra("var1","Selamat Jawaban Kamu Benar");
                pesan.putExtra("var2",photos[i]);
                startActivity(pesan);


            } else {
                Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                pesan.putExtra("var1", "Maaf Jawaban Kamu Salah");
                pesan.putExtra("var2",photos[i]);
                startActivity(pesan);
            }

                break;

            case R.id.img4:
                if (R.id.img4 == photos[i]) {
                    Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                    pesan.putExtra("var1","Selamat Jawaban Kamu Benar");
                    pesan.putExtra("var2",photos[i]);
                    startActivity(pesan);


                } else {
                    Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                    pesan.putExtra("var1", "Maaf Jawaban Kamu Salah");
                    pesan.putExtra("var2",photos[i]);
                    startActivity(pesan);
                }

                break;

            case R.id.img5:
             if (R.id.img5 == photos[i]) {
                 Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                 pesan.putExtra("var1","Selamat Jawaban Kamu Benar");
                 pesan.putExtra("var2",photos[i]);
                 startActivity(pesan);


             } else {
                 Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                 pesan.putExtra("var1", "Maaf Jawaban Kamu Salah");
                 pesan.putExtra("var2",photos[i]);
                 startActivity(pesan);
             }
                break;

        }
    }
}
