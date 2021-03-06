package id.ac.unsyiah.elektro.mobile.tugas03_terjemahkan;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void onClickRadioButton (View view){
        txtHello = (TextView) findViewById(R.id.txtHello);
        String english = getString(R.string.english);
        String indo = getString(R.string.indo);
        String aceh = getString(R.string.aceh);

        switch (view.getId()){
            case R.id.rdEnglish:
                txtHello.setText(english);
                break;
            case R.id.rdIndo:
                txtHello.setText(indo);
                break;
            case R.id.rdAceh:
                txtHello.setText(aceh);
                break;
        }
    }
        }

