package Paquete1;

import Paquete2.ClaseE;

/**
 * @author armando
 */
public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        ClaseB objB = new ClaseB();
        //objB.publicB; visble en todo el programa
        //objB.defaultB; visible a nivel de paquete
        ClaseC objC = new ClaseC();
        //objC.publicC; atributos visibles
        //objC.defaultC;
        
        //Clase D es default en otro archivo
        //pero visible en el mismo paquete
        ClaseD objD= new ClaseD(); 
        //objD.publicD; atributos visibles
        //objD.defaultD;
        
        //ClaseE está en OTRO PAQUETE y archivo
        //HAY QUE AGREGAR LA CLAUSULA "IMPORT"
        ClaseE objE = new ClaseE();
        //objE.publicE; solo el publico
        
        //ClaseF es default y solo es visible en su paquete
        //ClaseF objF = new ClaseF();
        
    }
}

class ClaseB{
    public int publicB;
    int defaultB;
    private int privateB;
}
