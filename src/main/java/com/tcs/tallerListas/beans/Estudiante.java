package com.tcs.tallerListas.beans;

public class Estudiante {

    private String identificacion;
    private String nombre;
    private int edad;
    private String grado;
    private String Rgrado;


/*    public Estudiante(int identificacion, String nombre, int edad, String grado, String apellido) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
        this.apellido = apellido;
    }*/

    public Estudiante() {

    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGrado() {
        return grado;
    }

    public String getRgrado() {
        return Rgrado;
    }

    public void setRgrado(String rgrado) {
        Rgrado = rgrado;
    }


}
