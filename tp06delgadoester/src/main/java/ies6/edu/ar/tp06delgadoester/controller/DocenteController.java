package ies6.edu.ar.tp06delgadoester.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DocenteController{
    @GetMapping("/ docente")
    public String getDocente() {
        // codigo
        return "docente";
    }
    
}

    
