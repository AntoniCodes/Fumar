package com.example.fumar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.fumar.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private int Cigarros = 20;
    private int dinero = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.lblCigarros.setText(String.valueOf(Cigarros));
        binding.lblDinero.setText(String.valueOf(dinero));
        binding.btnCigarro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Cigarros>1){
                    Cigarros--;
                    binding.lblCigarros.setText(String.valueOf(Cigarros));

                }else{
                    dinero=dinero + 5;
                    Cigarros=20;
                    binding.lblCigarros.setText(String.valueOf(Cigarros));
                    binding.lblDinero.setText(String.valueOf(dinero));
                }
            }
        });
    }
}