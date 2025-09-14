package ies6.edu.ar.tp06delgadoester.model;

import java.time.LocalDate;

public class Alumno {

    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;  
    private String condicion; 


   // constructor por defecto
   public Alumno(){
}
// Constructor parametrizado
public Alumno(int dni, String nombre,String apellido, LocalDate fechaNacimiento, String condicion) {
    this.dni = dni;
    this.nombre = nombre; 
    this.apellido = apellido; 
    this.fechaNacimiento = fechaNacimiento;
    this.condicion = condicion;
    
}

 // Constructor parcial 
 public Alumno(int dni, String nombre, String apellido,  LocalDate fechaNacimiento){
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.condicion = "regular"; 
    
 }
 // Getters y Setters
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

 public LocalDate getFechaNacimiento(){
    return fechaNacimiento;
 }

 public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
 }

 public String getCondicion(){
    return condicion;

 }

 public void setCondicion(String condicion){
 this.condicion = condicion;  

}




}
