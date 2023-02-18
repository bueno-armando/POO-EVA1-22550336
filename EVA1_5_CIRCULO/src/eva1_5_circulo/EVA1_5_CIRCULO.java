package eva1_5_circulo;

/**
 * @author Armando Bueno
 */
public class EVA1_5_CIRCULO {
    public static void main(String[] args) {
        
        //circle 1 (default constructor)
        Circle circle1 = new Circle();
        circle1.setRatio(2.15);
        circle1.calcPerim();
        circle1.calcArea();
        
        //circle 2 (constructor with arguments)
        Circle circle2 = new Circle(3.46);
        circle2.calcPerim();
        circle2.calcArea();
        
        //printing values
        System.out.println("CIRCLE 1 DATA");
        System.out.println("Ratio: "+circle1.getRatio());
        System.out.println("Perimeter: "+circle1.getPerim());
        System.out.println("Area: "+circle1.getArea());
        
        System.out.println("\nCIRCLE 2 DATA");
        System.out.println("Ratio: "+circle2.getRatio());
        System.out.println("Perimeter: "+circle2.getPerim());
        System.out.println("Area: "+circle2.getArea());
    }
    
}
