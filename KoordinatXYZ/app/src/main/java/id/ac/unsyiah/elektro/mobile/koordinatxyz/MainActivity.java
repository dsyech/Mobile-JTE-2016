package id.ac.unsyiah.elektro.mobile.koordinatxyz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

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

    public void onClickButton (View view){
        final TextView txtX = (TextView) findViewById(R.id.txtX);
        final TextView txtY = (TextView) findViewById(R.id.txtY);
        final TextView txtZ = (TextView) findViewById(R.id.txtZ);
        Button btnXatas = (Button) findViewById(R.id.btnXAtas);
        Button btnXbawah = (Button) findViewById(R.id.btnXBawah);
        Button btnYatas = (Button) findViewById(R.id.btnYAtas);
        Button btnYbawah = (Button) findViewById(R.id.btnYBawah);
        Button btnZatas = (Button) findViewById(R.id.btnZAtas);
        Button btnZbawah = (Button) findViewById(R.id.btnZBawah);




        btnXatas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x++;
                txtX.setText((String.valueOf(x)));
            }
        });

        btnXbawah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x--;
                txtX.setText((String.valueOf(x)));
            }
        });

        btnYatas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y++;
                txtY.setText((String.valueOf(y)));
            }
        });

        btnYbawah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y--;
                txtY.setText((String.valueOf(y)));
            }
        });
        btnZatas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z++;
                txtZ.setText((String.valueOf(z)));
            }
        });
        btnZbawah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z--;
                txtZ.setText((String.valueOf(z)));
            }
        });

    }
    int x=0;
    int y = 0;
    int z = 0;
}
