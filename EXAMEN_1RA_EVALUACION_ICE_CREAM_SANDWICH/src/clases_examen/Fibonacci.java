package clases_examen;
/**
 *
 * @author Rodrigo Levi García Garay
 */
public class Fibonacci {
    private long a1,a2,n;
    //set y get
    public void setA1(long num1){
        a1=num1;
    }
    public void setA2(long num2){
        a2=num2;
    }
    public void setN(long posicion){
        n=posicion;
    }
    public long getA1(){
        return a1;
    }
    public long getA2(){
        return a2;
    }
    public long getN(){
        return n;
    }
    
    public long calcularFibo(){
        long fibo=(a1+a2),pos=3;
        if(n==1){//si es la n igual a 1, es el mismo valor de primer valor "a1"
            return a1;
        }
        if(n==2){//si la n es igual a 2, es el mismo valor de segundo valor "a2"
            return a2;
        }
        while (n!=pos){//susituye los valores del anteriores hasta otrogar el valor deseado 
            a1 = a2;
            a2 = fibo;
            fibo = a1+a2;
            pos++;
        }
        return fibo;
    }
    public void imprimirFibo(){
        System.out.println(calcularFibo());
    }
}
