package eva1_16_sobrecarga_2;

/**
 * @author Armando Bueno
 */
public class EVA1_16_SOBRECARGA_2 {

    public static void main(String[] args) {
        System.out.println(suma(4,5));
        System.out.println(suma(3.1416, 34.5987));
        System.out.println(suma("Armando","Bueno"));
        suma();
    }
    
    //MÉTODOS SOBRECARGADOS
    //suma(int, int) solo puede usarse aqui
    public static int suma(int val1, int val2){
        return val1+val2;
    }
    
    //suma(double, double) cuenta como nueva firma
    public static double suma(double val1, double val2){
        return val1+val2;
    }
    
    //suma(String, String) nueva firma
    public static String suma(String cad1, String cad2){
        return cad1+" "+cad2;
    }
    
    //suma() sin argumentos
    public static void suma(){
        System.out.println("Metodo suma sin parametros");
    }
    
}
