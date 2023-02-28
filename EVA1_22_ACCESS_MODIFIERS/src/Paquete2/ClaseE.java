package Paquete2;

import Paquete1.ClaseA;
import Paquete1.ClaseC;

/**
 * @author armando
 */
public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
    
    public void prueba(){
        ClaseF objF = new ClaseF();
        //objF.defaultF; atributos visibles
        //objF.publicF;
        
        ClaseA objA = new ClaseA();
        //objA.publicA; unico atributo visible
        
        //DEFAULT: SOLO VISIBLE EN SU PAQUETE
        //ClaseB objB = new ClaseB(); 
        
        ClaseC objC = new ClaseC();
        //objC.publicC; unico atributo visible
        
        //DEFAULT: SOLO VISIBLE EN SU PAQUETE
        //ClaseD objD = new ClaseD(); 
    }
}

class ClaseF{
    public int publicF;
    int defaultF;
    private int privateF;
}
