package eva1_17_areas;
import java.util.Scanner;

/***
 * @author jaime
 */
public class EVA1_17_AREAS {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radio del circulo => ");
        double radio = sc.nextDouble();
        System.out.println("Base del triangulo => ");
        double baseTri = sc.nextDouble();
        System.out.println("Altura del triangulo => ");
        double altTri = sc.nextDouble();
        System.out.println("Base Menor Trapecio => ");
        double baseMayTra = sc.nextDouble();
        System.out.println("Base Mayor Trapecio => ");
        double baseMenTra = sc.nextDouble();
        System.out.println("Altura trapecio");
        double altTra = sc.nextDouble();
        
        System.out.println("***********\nAREA DEL CIRCULO: "+area(radio));
        System.out.println("AREA DEL TRIANGULO: "+area(baseTri, altTri));
        System.out.println("AREA DEL TRAPECIO: "+area(baseMayTra, baseMenTra, altTra)+"\n*************");
    }
   
    //circulo
    public static double area(double radio){
       return Math.PI*radio*radio;
    }
    //triangulo
    public static double area(double base, double alt){
        return base*alt/2;
    }
    //trapecio
    public static double area(double baseMay, double baseMen, double alt){
        return (baseMay+baseMen)*alt/2;
    }
    
}
