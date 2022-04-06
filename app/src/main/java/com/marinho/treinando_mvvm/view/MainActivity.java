package com.marinho.treinando_mvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.marinho.treinando_mvvm.R;
import com.marinho.treinando_mvvm.databinding.ActivityMainBinding;
import com.marinho.treinando_mvvm.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mainViewModel;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setViewModel(mainViewModel);

        mainViewModel.liveData.observe(this,resultado ->{
            binding.resultado.setText(resultado);
        });

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mainViewModel.setMutableResultado(binding.textNumero.getText().toString());

            }
        });

    }



}