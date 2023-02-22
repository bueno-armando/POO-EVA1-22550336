package eva1_11_return;

/**
 * @author Armando Bueno
 */
public class EVA1_11_RETURN {

    public static void main(String[] args) {
        int ans = square(10); //invocación o llamada a función
        System.out.println("Resultado: "+ans);
        
    }
    
    public static int square(int num){
        return num*num;
    }
    
}
