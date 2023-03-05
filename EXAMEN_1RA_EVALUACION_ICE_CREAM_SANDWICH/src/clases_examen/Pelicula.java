package clases_examen;

/**
 * @author Paola Gallegos
 */
public class Pelicula {
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
          System.out.println("Puedes ver la película");
      }
      else{
          System.out.println("No puedes ver la película");
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
