package com.example.imc.Controller;

import com.example.imc.Model.M_IMC;
import com.example.imc.Service.S_Calculo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_IMC {
    @GetMapping("/")
    public String getIMC(){
        return "index";
    }

    @PostMapping("/")
    public String postIMC(@RequestParam("qtd_altura") double qtd_altura,
                            @RequestParam("qtd_peso") double qtd_peso,
                            Model model) {

        M_IMC imc = S_Calculo.calculoIMC(qtd_altura,qtd_peso);

        model.addAttribute("imc", imc.getImc());
        model.addAttribute("categoria", imc.getCategoria());
        return "index";
    }
}
