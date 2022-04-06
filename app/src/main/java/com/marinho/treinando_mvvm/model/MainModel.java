package com.marinho.treinando_mvvm.model;

public class MainModel {

    private final int numeroDigitado = 2;
    private int resultado;
    private int valor_digitado;

    public int getNumeroDigitado() {
        return numeroDigitado;
    }

    public int getResultado() {
        resultado = this.valor_digitado + this.numeroDigitado;
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getValor_digitado() {
        return valor_digitado;
    }

    public void setValor_digitado(int valor_digitado) {
        this.valor_digitado = valor_digitado;
    }
}
