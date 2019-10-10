package mx.edu.tesoem.isc.remg.proyectoremg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mordekaiserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mordekaiser);
    }
    public void frm2Activity(View v)
    {
        Intent l = new Intent(this, frm2Activity.class);
        startActivity(l);
        finish();
    }
}
