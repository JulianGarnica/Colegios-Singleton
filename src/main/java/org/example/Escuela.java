package org.example;

import java.util.ArrayList;

public class Escuela {
    private static Escuela escuela;

    private String nombre;
    private int capacidadEstudiantes;
    private String descripcion;

    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public Escuela(){}

    public Escuela(String nombre, int capacidadEstudiantes, String descripcion){
        setNombre(nombre);
        setCapacidadEstudiantes(capacidadEstudiantes);
        setDescripcion(descripcion);
    }

    public Escuela(String nombre, int capacidadEstudiantes, String descripcion, ArrayList<Estudiante> estudiantes){
        setNombre(nombre);
        setCapacidadEstudiantes(capacidadEstudiantes);
        setDescripcion(descripcion);
        setEstudiantes(estudiantes);
    }


    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void addEstudiante(Estudiante estudiante){
        if(this.estudiantes.size() <= this.getCapacidadEstudiantes()) {
            this.estudiantes.add(estudiante);
        }else{
            System.out.println("Se ha llegado al límite de estudiantes en este colegio.");
        }
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadEstudiantes() {
        return capacidadEstudiantes;
    }

    public void setCapacidadEstudiantes(int capacidadEstudiantes) {
        this.capacidadEstudiantes = capacidadEstudiantes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
