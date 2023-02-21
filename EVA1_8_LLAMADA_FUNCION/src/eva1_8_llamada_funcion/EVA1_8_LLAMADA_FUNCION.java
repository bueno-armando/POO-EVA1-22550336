package eva1_8_llamada_funcion;
/**
 * @author Armando Bueno
 */
public class EVA1_8_LLAMADA_FUNCION {
    public static void main(String[] args) {
        System.out.println("INICIA main()");
        A();
        System.out.println("TERMINA main()");
    }
    public static void A(){
        System.out.println("INICIA A()");
        B();
        System.out.println("TERMINA A()");
    }
    public static void B(){
        System.out.println("INICIA B()");
        System.out.println("TERMINA B()");
    }
    
}
