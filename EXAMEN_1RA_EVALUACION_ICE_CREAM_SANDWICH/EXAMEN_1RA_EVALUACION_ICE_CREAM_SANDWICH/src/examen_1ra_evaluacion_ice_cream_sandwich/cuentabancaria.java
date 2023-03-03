/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_1ra_evaluacion_ice_cream_sandwich;

/**
 *
 * @author galle
 */
public class cuentabancaria {
    public String numCuenta;
    public String nomClient;
    public double saldo;
   
    
     // constructor sin parametros       
     public cuentabancaria()
     {
      numCuenta= "";
      saldo = 0;
      nomClient=""; 
      }
     
     //con parametros
     public cuentabancaria(String nCuenta, double OtherSaldo, String nClient)
     {
       numCuenta = nCuenta;
       saldo = OtherSaldo;
       nomClient = nClient;
    }
     // set
      public void setNumCuenta(String valor){
        numCuenta = valor;
    }
       public void setNomCliente(String valor){
       nomClient = valor;
    }
     // get
    public String getNumCuenta(){
        return numCuenta;
    }
    
    public double getSaldo(){
        return saldo;
   }
    public String getNomClient(){
        return nomClient;
    }
    // métodos
   public void depositarEnCuenta (int m) {
        saldo =saldo+m;
    }
   
    public void retirarDeCuenta (int m){
  
      if ((saldo-m)<0){
          System.out.println("SALDO INSUFICIENTE, NO SE HARA EL RETIRO");
      }
      else{
          saldo =saldo-m;
      }            
    }

    public void imprimirDatos ()
    {
        System.out.println("---DATOS DEL CLIENTE---");
        System.out.println("Numero de cuenta: "+numCuenta);
        System.out.println("Nombre de cliente: "+nomClient);
        System.out.println("Saldo: "+saldo);
    }    
}    


