package com.example.imc.Model;

public class M_IMC {


    private double imc;
    private String categoria;

    public M_IMC(double imc, String categoria) {
        this.imc = imc;
        this.categoria = categoria;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
