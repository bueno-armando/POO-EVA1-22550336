/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_1ra_evaluacion_ice_cream_sandwich_peli;

/**
 *
 * @author galle
 */
public class EXAMEN_1RA_EVALUACION_ICE_CREAM_SANDWICH_PELI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        pelicula peli1 = new pelicula();
        peli1.setEstudio("20th Century Studios");
        peli1.setRating("C");
        peli1.setEdad(19);
        peli1.setTitulo("Deadpool");
        peli1.imprimirDatos();
        peli1.evaluarEdad();
        
        System.out.println("..................");
        
        pelicula peli2 = new pelicula ();
        peli2.setEstudio("20th Century Studios");
        peli2.setRating("C");
        peli2.setEdad(15);
        peli2.setTitulo("Logan");
        peli2.imprimirDatos();
        peli2.evaluarEdad();
    }
    
}
