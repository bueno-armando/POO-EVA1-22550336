package eva1_3_constructores;

/**
 *
 * @author Armando Bueno
 */
public class CuentaBancaria {
    private String accNum, name;
    private double balance;
    
    //cdefault onstructor
    public CuentaBancaria(){
        accNum="NA";
        balance=-1;
        name="NA";
    }
    
    //constuctor with arguments
    public CuentaBancaria(String _accNum, double _balance, String _name){
        accNum = _accNum;
        balance = _balance;
        name = _name;
    }
    
    //set methods
    public void setAccNum(String pass){
        accNum = pass;
    }
    public void setBalance(double pass){
        balance = pass;
    }
    public void setName(String pass){
        name = pass;
    }
    
    
    //get methods
    public String getAccNum(){
        return accNum;
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
}
