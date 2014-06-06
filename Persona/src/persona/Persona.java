/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persona;

/**
 *
 * @author aralvarezm
 */
public class Persona {
   static String nombres,apellidos, cedula, direccion, mail, sexo;
    static int edad, telefono;
    
   public Persona(String nom, String ape, String ced, String dir, String mail, String se, int edad, int telef) {

    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMail() {
        return mail;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

//public void setNombre(String nombre) {
//    nombres = nombre;
//}
//
//public String getNombres() {
//    return nombres;
//}
//public String setApellidos(){
//    
//}
//
//public int getEdad() {
//return edad;
//}

public static void main(String[] args) {
// Datos de la persona
Persona p = new Persona(nombres, apellidos, cedula, direccion, mail, cedula, edad, telefono);
System.out.println("Nombre de persona: " + p.getNombres());
p.setNombres("Maria");
System.out.println("Nombre de persona: " + p.getNombres());
System.out.println("Edad de persona: " + p.getEdad());
// al ser el campo nombre publico, tambien puedo
// cambiarlo y leerlo accediendo directamente
p.nombres = "Pepa";
System.out.println("Nombre de persona: " + p.nombres);
}
    
}
