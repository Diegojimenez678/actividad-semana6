/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6;

/**
 *
 * @author usuario
 */
public class semana6 {
    private String nombre;
    private String apellido;
    private String Sexo;
    private String direccion;
    private String nomMedico;
    private String motivoConsul;
    private String lugar;

    public semana6(String nombre, String apellido, String Sexo, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Sexo = Sexo;
        this.direccion = direccion;
    }

    public semana6(String nomMedico, String motivoConsul) {
        this.nomMedico = nomMedico;
        this.motivoConsul = motivoConsul;
    }

    public semana6(String lugar) {
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNomMedico() {
        return nomMedico;
    }

    public String getMotivoConsul() {
        return motivoConsul;
    }

    public String getLugar() {
        return lugar;
    }
    
    


    

  

}
