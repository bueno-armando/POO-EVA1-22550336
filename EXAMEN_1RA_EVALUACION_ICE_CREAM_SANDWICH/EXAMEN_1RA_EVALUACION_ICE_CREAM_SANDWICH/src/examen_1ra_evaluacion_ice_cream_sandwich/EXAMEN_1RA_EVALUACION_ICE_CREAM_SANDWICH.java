/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_1ra_evaluacion_ice_cream_sandwich;

/**
 *
 * @author galle
 */
public class EXAMEN_1RA_EVALUACION_ICE_CREAM_SANDWICH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println(".........................................");
      cuentabancaria client1 = new cuentabancaria ();
       client1.setNomCliente("Mike");
        client1.setNumCuenta("854316");
        System.out.println(client1.getSaldo());
        client1.depositarEnCuenta(800);
        client1.retirarDeCuenta(200);
        client1.imprimirDatos();
        
     System.out.println(".........................................");
         cuentabancaria client2 = new cuentabancaria ("855124", 2500, "Joel");
         client2.depositarEnCuenta(500);
         client2.imprimirDatos();
         
    System.out.println(".........................................");
         cuentabancaria client3 = new cuentabancaria ("250879", 1500, "Harvey");
         client3.imprimirDatos();  
         client3.retirarDeCuenta(2000);
    
    }
    
}
