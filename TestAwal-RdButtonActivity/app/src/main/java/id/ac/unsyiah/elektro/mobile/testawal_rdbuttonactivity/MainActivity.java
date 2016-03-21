package id.ac.unsyiah.elektro.mobile.testawal_rdbuttonactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;

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

        public void onClick (View view){
            RadioButton a = (RadioButton) findViewById(R.id.rdA);
            RadioButton b = (RadioButton) findViewById(R.id.rdB);
            RadioButton c = (RadioButton) findViewById(R.id.rdC);
            RadioButton d = (RadioButton) findViewById(R.id.rdD);
            RadioButton e = (RadioButton) findViewById(R.id.rdE);

            final Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);

            a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    A++;
                    pesan.putExtra("var1", "Anda telah memilih A sebanyak "+(String.valueOf(A)));
                    startActivity(pesan);
                }
            });

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    B++;
                    pesan.putExtra("var1", "Anda telah memilih B sebanyak "+(String.valueOf(B)));
                    startActivity(pesan);
                }
            });

            c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    C++;
                    pesan.putExtra("var1", "Anda telah memilih C sebanyak "+(String.valueOf(C)));
                    startActivity(pesan);
                }
            });

            d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    D++;
                    pesan.putExtra("var1", "Anda telah memilih D sebanyak "+(String.valueOf(D)));
                    startActivity(pesan);
                }
            });

            e.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    E++;
                    pesan.putExtra("var1","Anda telah memilih E sebanyak "+ (String.valueOf(E)));
                    startActivity(pesan);
                }
            });
        }
    int A =0;
    int B=0;
    int C=0;
    int D=0;
    int E=0;
}
