package ies6.edu.ar.tp06delgadoester.model;

import java.time.LocalDate;

public class Docente {

    private int dni;
    private String nombre;
    private String apellido;
    private int horasCatedras;
    private String legajo;

    
    // constructor por defecto
    public Docente(){
    }

        //Constructor parametrizado
    public Docente(int dni, String nombre, String apellido, int horasCatedras, String legajo){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasCatedras = horasCatedras;
        this.legajo = legajo;

    }

    // constructor parcial
    public Docente(int dni, String nombre, String apellido, int horasCatedras){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido; 
        this.horasCatedras = horasCatedras;
        this.legajo = "presentado";
    
}

//Getters Setters
public int getDni(){
    return dni;
}

public void setDni(int dni){
    this.dni = dni;
}

public String getNombre(){
    return nombre;
}

public void setNombre(String nombre){
    this.nombre = nombre;
}

public String getApellido(){
    return apellido;
}

public void setApellido(String apellido){
    this.apellido = apellido;
}

public int  getHorasCatedras(){
    return horasCatedras;
}

public void setHorasCatedras(int horasCatedras){
    this.horasCatedras = horasCatedras;
}

public String setLegajo(){
    return legajo;
}
public void getLegajo(String legajo){
    this.legajo = legajo;
}


}