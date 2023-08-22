package com.example.imc.Service;

import com.example.imc.Model.M_IMC;
import org.springframework.stereotype.Service;

@Service
public class S_Calculo {

    public static M_IMC calculoIMC(double altura,double peso) {
        altura = altura / 100;
        double imc = peso / (altura * altura);
        String categoria;

        if (imc < 18.5) {
            categoria = "Sua Classificação é de Magreza";
        }
        else if (imc < 24.9) {
            categoria = "Sua Classificação Está Dentro do Normal";
        }
        else if (imc < 29.9) {
            categoria = "Sua Classificação é de Sobrepeso I";
        }
        else if (imc < 39.9) {
            categoria = "Sua Classificação é Obesidade II (severa)";
        }
        else{
            categoria = "Sua Classificação é Obesidade Grave III (Mordbida)";
        }

        M_IMC m_imc = new M_IMC(imc, categoria);
        return m_imc;
    }

}
