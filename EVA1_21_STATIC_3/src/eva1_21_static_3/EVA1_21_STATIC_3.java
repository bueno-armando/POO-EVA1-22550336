package eva1_21_static_3;

/**
 *
 * @author Armando
 */
public class EVA1_21_STATIC_3 {
    public static void main(String[] args) {
        System.out.println("Valor estático: "+Prueba.valor);
        //SE ESTÁ MODIFICANDO UNA VARIABLE ÚNICA
        Prueba.valor++;
        System.out.println("Valor estático (+1): "+Prueba.valor);
        
        PruebaObjetos myObj = new PruebaObjetos();
        myObj.valor++;
        System.out.println("Valor objeto (+1): "+myObj.valor);
        
        PruebaObjetos myObj2 = new PruebaObjetos();
        System.out.println("Valor objeto 2: "+myObj2.valor);
        //PARA LOS DOS OBJETOS SE CREARON 2 VALORES
        //INDEPENDIENTES DE LA VARIABLE
        
    }
}

class Prueba{
    public static int valor = 100;
}

class PruebaObjetos{
    public int valor = 100;
}
