package eva1_19_static;

/**
 * @author Armando Bueno
 */
public class EVA1_19_STATIC {

    public static void main(String[] args) {
        System.out.println("PI: "+Math.PI);
        System.out.println("Número Random: "+Math.random());
        
        Utilerias utileria = new Utilerias();
        utileria.Saludo(); //uso a través de objeto (normal)
        Utilerias.otroSaludo(); //uso a través de clase (static)
        Saludo2(); //SI NO ES ESTÁTICO, Y NO SE HA CREADO UN
                    //OBJETO, EL MÉTODO NO EXISTE
  
    }
    
    //no static, se tiene que crear objeto para usarse
    public void Saludo2(){
        System.out.println("HOLA");
    }
}

//modificador default
//si ya hay otra clase, no puede tener otro modificador
class Utilerias{
    //Este método existe hasta que se crea un objeto de la clase
    //Solo se usa a través de un objeto
    public void Saludo(){
        System.out.println("Hola (public void)");
    }
    //Saludo2(): Este método existe en el momento que el programa 
    //inicia su ejecución. No necesita que se cree un objeto de
    //la clase para poder usarlo. SE USA A TRAVÉS DE LA CLASE
    public static void otroSaludo(){
        System.out.println("Saludo de nuevo (public STATIC void)");
    }
}

