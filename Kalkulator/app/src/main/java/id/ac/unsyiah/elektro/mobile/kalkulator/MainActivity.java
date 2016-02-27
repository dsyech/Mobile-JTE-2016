package id.ac.unsyiah.elektro.mobile.kalkulator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



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

    public void onClickBtnSamaDengan (View view){

        EditText numAngka1 = (EditText) findViewById(R.id.numAngka1);
        String angka1Str = numAngka1.getText().toString();
        float angka1 = Long.valueOf(angka1Str);

        EditText numAngka2 = (EditText) findViewById(R.id.numAngka2);
        String angka2Str = numAngka2.getText().toString();
        float angka2 = Long.valueOf(angka2Str);

        Spinner spnOperasi = (Spinner) findViewById(R.id.spnOperasi);
        TextView txtHasil = (TextView) findViewById(R.id.txtHasil);

        String selectedItem = (String) spnOperasi.getSelectedItem();
        if(selectedItem.trim().equals("+")){
            float hasil = Float.valueOf(angka1+angka2);
            String hasilStr = Float.toString(hasil);
            txtHasil.setText(hasilStr);
        }else if(selectedItem.trim().equals("-")){
            float hasil = Float.valueOf(angka1-angka2);
            String hasilStr = Float.toString(hasil);
            txtHasil.setText(hasilStr);
        }else if(selectedItem.trim().equals("*")){
            float hasil = Float.valueOf(angka1*angka2);
            String hasilStr = Float.toString(hasil);
            txtHasil.setText(hasilStr);
        }else if(selectedItem.trim().equals("/")){
            float hasil = Float.valueOf(angka1/angka2);
            String hasilStr = Float.toString(hasil);
            txtHasil.setText(hasilStr);
        }


    }
}
