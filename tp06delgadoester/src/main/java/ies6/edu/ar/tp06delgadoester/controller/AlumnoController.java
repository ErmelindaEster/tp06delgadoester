package ies6.edu.ar.tp06delgadoester.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlumnoController {


@GetMapping("/alumno")
public String getAlumno(){
    // codigo
    return "alumno";
}

}
