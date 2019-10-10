package mx.edu.tesoem.isc.remg.proyectoremg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class frm2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
    }

    public void sehnActivity (View v)
    {
        Intent shen = new Intent(this, sehnActivity.class);
        startActivity(shen);
        finish();
    }

    public void sionActivity (View v)
    {
        Intent sion = new Intent(this, sionActivity.class);
        startActivity(sion);
        finish();
    }

    public void hecaActivity(View v)
    {
        Intent hecar = new Intent(this, hecaActivity.class);
        startActivity(hecar);
        finish();
    }

    public void fioraActivity(View v)
    {
        Intent fio = new Intent(this, fioraActivity.class);
        startActivity(fio);
        finish();
    }
    public void maokaiActivity(View v)
    {
        Intent mao = new Intent(this, maokaiActivity.class);
        startActivity(mao);
        finish();
    }
    public void mordekaiserActivity(View v)
    {
        Intent ma = new Intent(this, mordekaiserActivity.class);
        startActivity(ma);
        finish();
    }

    public void keldActivity(View v)
    {
        Intent kled = new Intent(this, keldActivity.class);
        startActivity(kled);
        finish();
    }
    public void kennenActivity(View v)
    {
        Intent kenn = new Intent(this, kennenActivity.class);
        startActivity(kenn);
        finish();
    }

    public void acercadeActivity(View v)
    {
        Intent acer = new Intent(this, acercadeActivity.class);
        startActivity(acer);
        finish();
    }




}
