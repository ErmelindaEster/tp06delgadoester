package ies6.edu.ar.tp06delgadoester.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class indexController {

    @GetMapping("/index")
    public String getIndex() {
        //codigo
        return "index";
    }
    
    
}