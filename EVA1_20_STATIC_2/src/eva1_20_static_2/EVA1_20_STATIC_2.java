package eva1_20_static_2;

/**
 * @author Armando Bueno
 */
public class EVA1_20_STATIC_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*final int x;
        x = 100; //1era vez que se asigna (ok)
        x = 200; //2da vez que se asigna (NO SE PUEDE)*/
        
        //objeto
        FormulasGeometria formulas = new FormulasGeometria(); //no tiene métodos
        
        //Se están usando sin objetos
        System.out.println("Mi PI: "+FormulasGeometria.PI);
        System.out.println("Area Triangulo: "+FormulasGeometria.areaTriangulo(5.0, 7.2));
        System.out.println("Volúmen Esfera: "+FormulasGeometria.volumenEsfera(4.7));
    }
    
}
