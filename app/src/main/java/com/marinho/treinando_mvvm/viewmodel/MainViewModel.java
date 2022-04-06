package com.marinho.treinando_mvvm.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.marinho.treinando_mvvm.model.MainModel;


public class MainViewModel extends ViewModel {

    MainModel model = new MainModel();

    private MutableLiveData<String> mutableResultado = new MutableLiveData<>();
    public LiveData<String> liveData = mutableResultado;

    private MutableLiveData<String> mutableDigitado = new MutableLiveData<>();
    public LiveData<String> liveDataDigitado = mutableDigitado;

    public void setMutableResultado(String mutableResultado){
        this.mutableDigitado.setValue(mutableResultado);

        model.setValor_digitado(Integer.parseInt(mutableResultado));

        this.mutableResultado.setValue(String.valueOf(model.getResultado()));
    }



}
