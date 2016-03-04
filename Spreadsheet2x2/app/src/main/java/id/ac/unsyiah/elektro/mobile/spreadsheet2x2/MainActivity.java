package id.ac.unsyiah.elektro.mobile.spreadsheet2x2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
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

    public void onClickSamaDengan (View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        String num1Str = num1.getText().toString();
        int cell1 = Integer.valueOf(num1Str);


        EditText num2 = (EditText) findViewById(R.id.num2);
        String num2Str = num2.getText().toString();
        int cell2 = Integer.valueOf(num2Str);

        EditText num3 = (EditText) findViewById(R.id.num3);
        String num3Str = num3.getText().toString();
        int cell3 = Integer.valueOf(num3Str);

        EditText num4 = (EditText) findViewById(R.id.num4);
        String num4Str = num4.getText().toString();
        int cell4 = Integer.valueOf(num4Str);

        TextView txtHasil1 = (TextView) findViewById(R.id.txt1);
        TextView txtHasil2 = (TextView) findViewById(R.id.txt2);
        TextView txtHasil3 = (TextView) findViewById(R.id.txt3);
        TextView txtHasil4 = (TextView) findViewById(R.id.txt4);

        switch (view.getId()) {
            case R.id.btn1:
                int hasil1 = Integer.valueOf(cell1+cell2);
                String hasil1Str = Integer.toString(hasil1);
                txtHasil1.setText(hasil1Str);
                break;

            case R.id.btn2:
                int hasil2 = Integer.valueOf(cell3+cell4);
                String hasil2Str = Integer.toString(hasil2);
                txtHasil2.setText(hasil2Str);
                break;

            case R.id.btn3:
                int hasil3 = Integer.valueOf(cell1+cell3);
                String hasil3Str = Integer.toString(hasil3);
                txtHasil3.setText(hasil3Str);
                break;

            case R.id.btn4:
                int hasil4 = Integer.valueOf(cell2+cell4);
                String hasil4Str = Integer.toString(hasil4);
                txtHasil4.setText(hasil4Str);
                break;
        }
    }
}
