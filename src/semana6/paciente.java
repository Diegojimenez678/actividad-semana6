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
public class paciente extends semana6{
    private final int codigo;

    public paciente(int codigo, String nombre, String apellido, String Sexo, String direccion) {
        super(nombre, apellido, Sexo, direccion);
        this.codigo = codigo;
    }
    
   public void mostrar(){
       System.out.println("datos del paciente\ncodigo: "+codigo+"\nNombre: "+getNombre()+"\nApellido: "+getApellido()+"\nSexo: "+getSexo()+"\nDireccion: "+getDireccion());
   }
    
}
