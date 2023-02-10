package eva1_3_constructores;
/**
 *
 * @author Armando Bueno
 */
public class EVA1_3_CONSTRUCTORES {
    
    public static void main(String[] args) {
        CuentaBancaria acc1 = new CuentaBancaria("00012312", 45521499999.56, "Jeff Bezos");
        CuentaBancaria acc2 = new CuentaBancaria("019231055", 500, "Juan Jano");
        CuentaBancaria acc3 = new CuentaBancaria();
        /*
        acc1.setAccNum("001039058");
        acc1.setBalance(2222.2022);
        acc1.setName("Armando Bueno");*/
        
        System.out.print("*** INFO. DE CLIENTE 1 ***\n");
        System.out.println(acc1.getAccNum());
        System.out.println(acc1.getBalance());
        System.out.println(acc1.getName());
        
        System.out.print("\n*** INFO. DE CLIENTE 2 ***\n");
        System.out.println(acc2.getAccNum());
        System.out.println(acc2.getBalance());
        System.out.println(acc2.getName());
        
        System.out.print("\n*** INFO. DE CLIENTE 3 ***\n");
        System.out.println(acc3.getAccNum());
        System.out.println(acc3.getBalance());
        System.out.println(acc3.getName());
       
    }
    
}
