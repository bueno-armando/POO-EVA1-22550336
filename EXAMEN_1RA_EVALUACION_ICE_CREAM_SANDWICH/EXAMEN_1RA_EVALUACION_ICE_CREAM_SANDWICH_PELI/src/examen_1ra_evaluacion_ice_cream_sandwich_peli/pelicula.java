/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_1ra_evaluacion_ice_cream_sandwich_peli;

/**
 *
 * @author galle
 */
public class pelicula {
    public String titulo;
    public String estudio;
    public String rating;
    public int edad;
    
    
   //get
    public String getTitulo (){
        return titulo;
    }
    
    public String getEstudio(){
        return estudio;
    }
    public String getRating (){
        return rating;
    }
    public int getEdad(){
        return edad;
    }
    
    // set
    public void setTitulo(String valor){
        titulo = valor;
    } 
    public void setEstudio(String valor){
        estudio = valor;
    } 
    public void setRating(String valor){
        rating = valor;
    } 
    public void setEdad (int valor){
        edad = valor;
    }
    
    public void evaluarEdad (){
        if(edad>=18){
          System.out.println("puede ver la pelicula");
      }
      else{
          System.out.println("no puede ver la pelicula");
      }
    }
    // print
     public void imprimirDatos (){
   System.out.println("---DATOS PELICULA---");                                           
   System.out.println("Titulo Pelicula: "+titulo);                                           
   System.out.println("Estudio: "+estudio);                                           
   System.out.println("Rating: "+rating);                                           
}
}
