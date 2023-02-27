package eva1_20_static_2;

/**
 *
 * @author armando
 */
public class FormulasGeometria {
    //CONSTANTE PI:
    public static final double PI = 3.14159; //FINAL declara una constante
    
    //areas
    public static double areaTriangulo(double base, double alt){
        return base*alt/2.0;
    }
    public static double areaCirculo(double radio){
        return PI*radio*radio;
    }
    
    //perimetros
    public static double perimetroCirculo(double radio){
        return PI*radio*2.0;
    }
    
    //volumen
    public static double volumenEsfera(double radio){
        return (4.0/3.0)*PI*radio*radio*radio;
    }
}
