package com.example.testeseekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBarProgresso;
    TextView textResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBarProgresso = findViewById(R.id.seekBarProgressso);
        textResultado = findViewById(R.id.textResultado);


        seekBarProgresso.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                //textResultado.setText("Progresso: " + progress + " de " + seekBarProgresso.getMax());

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                //textResultado.setText("onStartTrackingTouch");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                //textResultado.setText("onStopTrackingTouch");

            }
        });
    }

    public void progresso(View view) {

        textResultado.setText("Progresso: " + seekBarProgresso.getProgress() + " de " + seekBarProgresso.getMax());

    }
}