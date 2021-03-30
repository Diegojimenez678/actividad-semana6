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
public class Medico extends semana6{
    
    Medico(String nomMedico, String motivoConsul) {
        super(nomMedico, motivoConsul);
       
    }
    
public void mostrar2(){
    System.out.println("\nDatos del medico\nNombre: "+getNomMedico()+"\nMotivo de la consulta: "+getMotivoConsul());

}
   
    
}