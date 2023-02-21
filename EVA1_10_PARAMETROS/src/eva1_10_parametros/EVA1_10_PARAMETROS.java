package eva1_10_parametros;

/**
 * @author Armando Bueno
 */
public class EVA1_10_PARAMETROS {
    public static void main(String[] args) {
        nPrintln("HOLA", 2);
        /* EXCEPCIONES
        nPrintln(2);
        nPrintln("HOLA");
        nPrintln(2, "HOLA"); */
    }
    
    public static void nPrintln(String msg, int n){
        for(int i=0 ; i<n ; i++) System.out.println(msg);
    }
}
