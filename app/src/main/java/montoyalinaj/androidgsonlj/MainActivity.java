package montoyalinaj.androidgsonlj;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    TextView lista;
    TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (TextView) findViewById(R.id.lista);
        salida = (TextView) findViewById(R.id.salida);

        Gson gson = new Gson();

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Lina");
        arrayList.add("Jose");
        arrayList.add("Viviana");
        arrayList.add("Daniel");
        arrayList.add("Vilma");
        arrayList.add("Ximena");


        String json = gson.toJson(arrayList);

        lista.setText(arrayList.toString());
        salida.setText(json);
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
