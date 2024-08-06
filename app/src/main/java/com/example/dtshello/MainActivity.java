package com.example.dtshello;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bproses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bproses = (Button) findViewById(R.id.btnOK);

        bproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bproses.setBackgroundColor(Color.CYAN);
                Toast.makeText(MainActivity.this, "Tombol Jadi Merah", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }
}