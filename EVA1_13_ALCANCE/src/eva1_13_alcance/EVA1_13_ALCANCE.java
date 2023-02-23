package eva1_13_alcance;

/**
 * @author jaime
 */
public class EVA1_13_ALCANCE {
   
    public static void main(String[] args) {
        System.out.println("i = "+i);
        System.out.println("j = "+j); //aún no son visibles
        int x = 100; //visible para todo lo que esté dentro del main
        for(int i=0 ; i<10 ; i++){
            System.out.println("x = "+x);
            System.out.println("i = "+i);
            System.out.println("j = "+j); //aún no existe j
            int j = 100;//a partir de aqui es visible j
            {
                int z = 100;
                System.out.println("z = "+z); 
            }
            System.out.println("z = "+z); //z está fuera de alcance
            System.out.println("j = "+j);
        }//termina bloque for
        System.out.println("i = "+i);
        System.out.println("j = "+j);//ya no son visibles
    }
    
    public static void algo(){
        System.out.println("x = "+x); fuera de alcance (scope)
    }
   
}
