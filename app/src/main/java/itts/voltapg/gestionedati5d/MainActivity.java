package itts.voltapg.gestionedati5d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText  txtTitolo;
    gestioneBrani gb;
    Button  btninserisci;
    Spinner spgenere;
    String[] elencoGeneri= {"ciao","viola","rosso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitolo = (EditText) findViewById(R.id.txtTitolo);
        btninserisci = (Button) findViewById(R.id.btninserisci);

        spgenere = (Spinner) findViewById(R.id.spGeneri);
        ArrayAdapter<String> SpGen = new
                ArrayAdapter<String>(this,
                R.layout.);
        spgenere.setAdapter(SpGen);

        gb = new gestioneBrani();
        btninserisci.setOnClickListener(new View.OnClickListener());

        @Override
        public void onClick (View view){
           String testo=
            spgenere= getSelectedItem().toString();
            Toast.makeText(getApplicationContext(),
                    testo,Toast.LENGTH_LONG).show();
            gb.addBrano(txtTitolo.getTest().toString());
        }
    } );
}