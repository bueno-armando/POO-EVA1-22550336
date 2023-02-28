package Paquete1;

import Paquete2.ClaseE;

/**
 * @author armando
 */
public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        ClaseA objA = new ClaseA();
        //objA.defaultA; atributos visibles
        //objA.publicA;
        
        ClaseB objB = new ClaseB();
        //objB.defaultB; atributos visibles
        //objB.publicB; 
        
        ClaseD objD = new ClaseD();
        //objD.defaultD; atributos visibles
        //objD.publicD;
        
        ClaseE objE = new ClaseE();
        //objE.publicE; solo es visible lo publico

    }
}

class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
}
