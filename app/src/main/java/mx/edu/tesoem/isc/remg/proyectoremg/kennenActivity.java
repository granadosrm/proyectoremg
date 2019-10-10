package mx.edu.tesoem.isc.remg.proyectoremg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class kennenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kennen);
    }

    public void frm2Activity(View v)
    {
        Intent ma = new Intent(this, frm2Activity.class);
        startActivity(ma);
        finish();
    }
}
