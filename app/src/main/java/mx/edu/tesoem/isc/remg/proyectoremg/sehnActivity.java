package mx.edu.tesoem.isc.remg.proyectoremg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sehnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sehn);


    }

    public void frm2Activity(View v)
    {
        Intent reg = new Intent(this,frm2Activity.class);
        startActivity(reg);
        finish();
    }


    }

