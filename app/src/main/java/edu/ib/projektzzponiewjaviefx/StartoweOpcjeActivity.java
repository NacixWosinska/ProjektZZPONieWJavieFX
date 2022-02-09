package edu.ib.projektzzponiewjaviefx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartoweOpcjeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startowe_opcje);
    }

    public void btnOpcja1Click(View view) {
        Intent intent = new Intent(this, SledzenieLotuActivity.class);
        startActivity(intent);
    }
}