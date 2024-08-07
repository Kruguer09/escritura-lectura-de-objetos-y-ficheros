/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejsalvarfichero;

import java.io.Serializable;
import java.util.ArrayList;


public class Alumno implements Serializable {
    private String nombre;
    private String apellidos;
    private int edad;
    public static ArrayList<Alumno> listaContactos= new ArrayList<>();
    /**
     *
     */
    public Alumno() {
    }

    /**
     *
     * @param nombre
     * @param apellidos
     * @param edad
     */
    public Alumno(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     * @return
     */
    public Alumno setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    /**
     *
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

  
    public Alumno setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     * @return
     */
    public Alumno setEdad(int edad) {
        this.edad = edad;
        return this;
    }
    
     public void setAlumnos(ArrayList <Alumno> c){
        this.listaContactos=c;
    }
    
    public static ArrayList<Alumno> getAlumnos(){
        return listaContactos;
    }
    /**
     * Formatea los datos a CSV
     * @return
     */
    public String toCSV() {
        return nombre + "#" + apellidos + "#" + edad + '#';
    }
    
    @Override
    public String toString() {
        return "Usuario{ nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }
    
    
}
