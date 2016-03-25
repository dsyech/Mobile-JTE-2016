package id.ac.unsyiah.elektro.mobile.tugas11_doubletexteditor;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditText atas = (EditText) findViewById(R.id.edtAtas);
        EditText bawah = (EditText) findViewById(R.id.edtBawah);

        SharedPreferences sharedPreferences =
                getSharedPreferences("id.ac.unsyiah.elektro.mobile.tugas11_doubletexteditor.PREF_BERSAMA", Context.MODE_PRIVATE);
        String teksAtas = sharedPreferences.getString("atas", "");
        String teksBawah = sharedPreferences.getString("bawah","");

        atas.setText(teksAtas);
        bawah.setText(teksBawah);



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
        @Override
        protected void onStop(){
            super.onStop();

            EditText atas = (EditText) findViewById(R.id.edtAtas);
            String atasStr = atas.getText().toString();
            EditText bawah = (EditText) findViewById(R.id.edtBawah);
            String bawahStr = bawah.getText().toString();

            SharedPreferences sharedPreferences =
                    getSharedPreferences("id.ac.unsyiah.elektro.mobile.tugas11_doubletexteditor.PREF_BERSAMA", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("atas", atasStr);
            editor.putString("bawah", bawahStr);
            editor.apply();
        }
    }