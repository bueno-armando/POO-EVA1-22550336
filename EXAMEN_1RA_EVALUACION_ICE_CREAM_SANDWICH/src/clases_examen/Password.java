package clases_examen;
import java.util.Scanner;
/**
 *
 * @author César Alejadro Urías González
 */
public class Password {
    private String password;
    private String user;
    Scanner sc = new Scanner(System.in);
    //SET
    public void setPassword(String value){
    password = value;
    }
    public void setUser(String value){
    user= value;
    }
 
   //CONSTRUCTORES
    public Password(){
        password="-----";
        user="-----";
    }
    public Password(String infUser, String infPassword){
        password = infPassword;
        user = infUser;
    }
  /* public void generarUser( ){
    user =sc.nextLine();
    password =sc.nextLine();
    }*/
   public boolean verificarAcceso(boolean value){
        value=true;
       System.out.println("-- Iniciar Sesión");
       System.out.print("Usuario --> ");
       String usuario=sc.nextLine();
       System.out.print("Contaseña --> ");
       String contraseña= sc.nextLine();
        
       if (!usuario.equals(password)&&!contraseña.equals(password))
         value = false;
           
       return value;
   }
 }