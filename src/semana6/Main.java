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
public class Main {
    public static void main(String[] args) {
        paciente pa= new paciente(1002,"Diego", "Sanchez", "masculino", "Cr3#15");
        Medico me=new Medico("Ramiro","Medicina General");
        cenDeSalud cDS= new cenDeSalud(05, "Clinica Santa Ana");
        pa.mostrar();
        me.mostrar2();
        cDS.mostrar3();
    
    }
    
}
