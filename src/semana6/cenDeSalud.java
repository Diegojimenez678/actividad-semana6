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
public final class cenDeSalud extends semana6{
    private int fecha;

    public cenDeSalud(int fecha, String lugar) {
        super(lugar);
        this.fecha = fecha;
    }
    public final void mostrar3() {
        System.out.println("\nCentro de salud\nLugar: "+getLugar()+"\nFecha: "+fecha);
        
    }
    
}
