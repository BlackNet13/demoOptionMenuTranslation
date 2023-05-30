package sg.rp.edu.rp.c346.id22038845.demooptionmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;
    TextView tvTranslatedText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText=findViewById(R.id.textViewTranslatedText);
        tvTranslatedText2=findViewById(R.id.textViewTranslatedText2);

        registerForContextMenu(tvTranslatedText);
        registerForContextMenu(tvTranslatedText2);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvTranslatedText.setText(getResources().getString(R.string.hello));
            tvTranslatedText2.setText(getResources().getString(R.string.bye));
            return true;
        } else if (id == R.id.italianSelection) {
            tvTranslatedText.setText(getResources().getString(R.string.helloI));
            tvTranslatedText2.setText(getResources().getString(R.string.byeI));
            return true;
        } else {
            tvTranslatedText.setText(getResources().getString(R.string.error));
        }

        return super.onOptionsItemSelected(item);
    }

}