package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ciudad ciudadSeleccionada = Ciudad.getInstance("Zipaquirá", "Cundinamarca");
        Scanner input = new Scanner(System.in);
        while (true){
            String nombreEscuela = "";
            String nombreEstudiante = "";
            String descripcion = "";
            int opcionEscuela = 0;
            int capacidadEstudiantes = 0;



            input.reset();

            System.out.println("""
                    /////////////////////////////////////////////////////
                    ¡Bienvenido al sistema de administración de colegios!
                    ¿Qué le gustaría hacer?
                    1.  Crear colegio
                    2.  Agregar estudiante a colegio
                    3.  Consultar colegios
                    4.  Salir
                    /////////////////////////////////////////////////////
                    """);
            int opcionSeleccionada = Integer.valueOf(input.nextLine());

            if(opcionSeleccionada == 4){
                break;
            }

            switch (opcionSeleccionada){
                case 1:
                    System.out.println("Ingrese nombre de escuela: ");
                    nombreEscuela = input.nextLine();
                    System.out.println("Ingrese capacidad de estudiantes en la escuela: ");
                    capacidadEstudiantes = Integer.valueOf(input.nextLine());
                    System.out.println("Ingrese la descripción de la escuela: ");
                    descripcion = input.nextLine();

                    ciudadSeleccionada.addEscuela(new Escuela(nombreEscuela, capacidadEstudiantes, descripcion));
                    break;

                case 2:
                    int count = 1;
                    String msgEscuelas = "";
                    for (Escuela escuela: ciudadSeleccionada.getEscuelas()){
                        msgEscuelas += String.format("|%-6s|%-20s|\n", count, escuela.getNombre());
                        count++;
                    }
                    System.out.println(String.format("¿En qué escuela desea hacer la inscripción?\n%s",msgEscuelas));
                    opcionEscuela = Integer.valueOf(input.nextLine())-1;
                    Escuela escuelaSeleccionada = ciudadSeleccionada.getEscuelas().get(opcionEscuela);

                    System.out.println("Ingrese nombre del estudiante: ");
                    nombreEstudiante = input.nextLine();
                    System.out.println("Ingrese edad del estudiante: ");
                    int edadEstudiante = Integer.valueOf(input.nextLine());

                    escuelaSeleccionada.addEstudiante(new Estudiante(nombreEstudiante, edadEstudiante));

                    break;

                case 3:
                    int count2 = 1;
                    String msgEscuelas2 = "";
                    for (Escuela escuela: ciudadSeleccionada.getEscuelas()){
                        msgEscuelas2 += String.format("|%-6s|%-20s|\n", count2, escuela.getNombre());
                        count2++;
                    }
                    System.out.println(String.format("Ingrese el número de la escuela la cual desea consultar\n%s",msgEscuelas2));

                    int opcionEscuela2 = Integer.valueOf(input.nextLine())-1;
                    Escuela escuelaSeleccionada2 = ciudadSeleccionada.getEscuelas().get(opcionEscuela2);

                    int count3 = 1;
                    String msgEstudiantes = "";
                    for (Estudiante estudiante: escuelaSeleccionada2.getEstudiantes()){
                        msgEstudiantes += String.format("|%-6s|%-20s|\n", count3, estudiante.getNombre());
                        count3++;
                    }
                    System.out.println(msgEstudiantes);

                    break;
            }
        }
    }
}