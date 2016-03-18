package id.ac.unsyiah.elektro.mobile.tugas08_pilihgambar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Spinner spinner = (Spinner) findViewById(R.id.spnGambar);
        final int[] photos={R.drawable.mobil, R.drawable.motor,R.drawable.becakmotor,R.drawable.becakdayung, R.drawable.sepeda};

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 1:
                        Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
                        pesan.putExtra("var1", photos[0]);
                        startActivity(pesan);
                        break;
                    case 2:
                        Intent pesan1 = new Intent(getApplicationContext(), ActivityKedua.class);
                        pesan1.putExtra("var1", photos[1]);
                        startActivity(pesan1);
                        break;
                    case 3:
                        Intent pesan2 = new Intent(getApplicationContext(), ActivityKedua.class);
                        pesan2.putExtra("var1", photos[2]);
                        startActivity(pesan2);
                        break;
                    case 4:
                        Intent pesan3 = new Intent(getApplicationContext(), ActivityKedua.class);
                        pesan3.putExtra("var1", photos[3]);
                        startActivity(pesan3);
                        break;
                    case 5:
                        Intent pesan4 = new Intent(getApplicationContext(), ActivityKedua.class);
                        pesan4.putExtra("var1", photos[4]);
                        startActivity(pesan4);
                        break;
                    case 6:
                        Intent pesan5 = new Intent(getApplicationContext(), ActivityKedua.class);
                        pesan5.putExtra("var1", photos[5]);
                        startActivity(pesan5);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                // sometimes you need nothing here
            }
        });


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
}
