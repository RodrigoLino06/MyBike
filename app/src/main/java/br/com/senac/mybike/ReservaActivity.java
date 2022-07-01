package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ReservaActivity extends AppCompatActivity {

    FloatingActionButton fabReservar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reserva_layout);

        fabReservar = findViewById(R.id.fabReservar);

        fabReservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Reserva realizada!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}