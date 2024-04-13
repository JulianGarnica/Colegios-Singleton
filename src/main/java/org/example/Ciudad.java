package org.example;

import java.util.ArrayList;

public class Ciudad {
    private static Ciudad ciudad;
    private String nombre;
    private String departamento;
    private ArrayList<Escuela> escuelas = new ArrayList<>();
    private Ciudad(){}

    private Ciudad(String nombre, String departamento){

        setNombre(nombre);
        setDepartamento(departamento);
    }

    private Ciudad(String nombre, String departamento, ArrayList<Escuela> escuelas){
        setNombre(nombre);
        setDepartamento(departamento);
        setEscuelas(escuelas);
    }

    public static Ciudad getInstance(){
        if(ciudad == null){
            ciudad = new Ciudad();
        }
        return ciudad;
    }

    public static Ciudad getInstance(String nombre, String departamento){
        if(ciudad == null){
            ciudad = new Ciudad(nombre, departamento);
        }
        return ciudad;
    }

    public static Ciudad getInstance(String nombre, String departamento, ArrayList<Escuela> escuelas){
        if(ciudad == null){
            ciudad = new Ciudad(nombre, departamento, escuelas);
        }
        return ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Escuela> getEscuelas() {
        return escuelas;
    }

    public void setEscuelas(ArrayList<Escuela> escuelas) {
        this.escuelas = escuelas;
    }

    public void addEscuela(Escuela escuela){
        this.escuelas.add(escuela);
    }
}
