/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.tcs.tallerListas;

import com.tcs.tallerListas.beans.Estudiante;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class IngresoEstudiantes {


    public static void main(String[] args) {

        ArrayList<Estudiante> arrayEstudiantes = new ArrayList<>();
        ArrayList<Estudiante> arrayGradoPrimero = new ArrayList<>();
        ArrayList<Estudiante> arrayGradoSegundo = new ArrayList<>();
        ArrayList<Estudiante> arrayGradoTercero = new ArrayList<>();
        ArrayList<Estudiante> arrayGradoCuarto = new ArrayList<>();
        ArrayList<Estudiante> arrayGradoQuinto = new ArrayList<>();
        int cont = 0;
        int contTotal = 0;


        System.out.println("################ Ingreso de Estudiantes ################");

        try {
            Scanner data = new Scanner(new File("src/main/resources/data.txt"));

            while (data.hasNextLine()) {

                String[] estData = data.nextLine().split(",");

                Estudiante estudiante = new Estudiante();

                estudiante.setIdentificacion(estData[0]);
                estudiante.setNombre(estData[1]);
                estudiante.setEdad(Integer.parseInt(estData[2]));
                estudiante.setRgrado(estData[3]);
                estudiante.setGrado(estData[4]);

                arrayEstudiantes.add(estudiante);

            }

            data.close();

        } catch (FileNotFoundException e) {

            System.out.println("El archivo no fue encontrado" + e.getMessage());

        }  catch (NumberFormatException e){

            System.out.println("Error en la transformación de String a entero" + e.getMessage());
        }



        for (int i = 0; i < arrayEstudiantes.size(); i++) {

            Estudiante auxEstudiantes = arrayEstudiantes.get(i);

            // System.out.println("Número Total de Estudiantes: " + "Identificación: " + auxEstudiantes.getIdentificacion() + ", Nombre: " + auxEstudiantes.getNombre() + ", Apellido: " + ", Edad: " + auxEstudiantes.getEdad() + ", Grado: " + auxEstudiantes.getGrado());
            contTotal++;

            if ((auxEstudiantes.getEdad() > 6) && (auxEstudiantes.getEdad() < 12)) {

                cont++;


            }

            if (auxEstudiantes.getGrado().contains("Primero")) {


                arrayGradoPrimero.add(arrayEstudiantes.get(i));

            }

            if (auxEstudiantes.getGrado().contains("Segundo")) {


                arrayGradoSegundo.add(arrayEstudiantes.get(i));

            }

			if (auxEstudiantes.getGrado().contains("Tercero")) {


				arrayGradoTercero.add(arrayEstudiantes.get(i));

			}

			if (auxEstudiantes.getGrado().contains("Cuarto")) {


				arrayGradoCuarto.add(arrayEstudiantes.get(i));

			}

			if (auxEstudiantes.getGrado().contains("Quinto")) {


				arrayGradoQuinto.add(arrayEstudiantes.get(i));

			}

			if (auxEstudiantes.getIdentificacion().contains("TI")) {


				System.out.println("*********** Edad y Grado de Estudiante con CC: TI / " + " La edad del Estudiante es: " + auxEstudiantes.getEdad() + " / " + "El grado del Estudiante es: " + auxEstudiantes.getGrado());

			}

			if (auxEstudiantes.getRgrado().contains("Si")) {


				System.out.println("*********** Estudiante que repetira el Grado: " + auxEstudiantes.getNombre());

			}




		}


        System.out.println("Número de estudiantes entre los 6 y los 10 años de edad: " + cont);

        System.out.println("Número Total de Estudiantes: " + contTotal);

        System.out.println("**********Los Estudiantes del primer grado Son: ");
        arrayGradoPrimero.forEach(e -> {
            System.out.println("Identificacion: " + e.getIdentificacion());
            System.out.println("Nombre y Apellido: " + e.getNombre());
            System.out.println("Edad: " + e.getEdad());
            System.out.println("Grado: " + e.getGrado());

        });

		System.out.println("**********Los Estudiantes del Segundo grado Son: ");
		arrayGradoSegundo.forEach(e -> {
			System.out.println("Identificacion: " + e.getIdentificacion());
			System.out.println("Nombre y Apellido: " + e.getNombre());
			System.out.println("Edad: " + e.getEdad());
			System.out.println("Grado: " + e.getGrado());

		});

		System.out.println("********Los Estudiantes del Tercer grado Son: ");
		arrayGradoTercero.forEach(e -> {
			System.out.println("Identificacion: " + e.getIdentificacion());
			System.out.println("Nombre y Apellido: " + e.getNombre());
			System.out.println("Edad: " + e.getEdad());
			System.out.println("Grado: " + e.getGrado());

		});

		System.out.println("**********Los Estudiantes del Cuarto grado Son: ");
		arrayGradoCuarto.forEach(e -> {
			System.out.println("Identificacion: " + e.getIdentificacion());
			System.out.println("Nombre y Apellido: " + e.getNombre());
			System.out.println("Edad: " + e.getEdad());
			System.out.println("Grado: " + e.getGrado());

		});

		System.out.println("**********Los Estudiantes del Quinto grado Son: ");
		arrayGradoQuinto.forEach(e -> {
			System.out.println("Identificacion: " + e.getIdentificacion());
			System.out.println("Nombre y Apellido: " + e.getNombre());
			System.out.println("Edad: " + e.getEdad());
			System.out.println("Grado: " + e.getGrado());

		});


    }
}
