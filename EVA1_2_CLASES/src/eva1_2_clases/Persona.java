package eva_2_clases;

/**
 *
 * @author Armando Sebastián Bueno Núñez. 22550336
 */
public class Persona {
    //attributes
    private String name="Armando", lastName;
    private int age;
    private boolean isMarried;
    
    //get methods
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean getIsMarried(){
        return isMarried;
    }
    
    //set methods
    public void setName(String pass){
        name = pass;
    }
    public void setLastName(String pass){
        lastName = pass;
    }
    public void setAge(int pass){
        age = pass;
    }
    public void setIsMarried(boolean pass){
       isMarried = pass;
    }
    
    //print data method
    public void printData(){
        System.out.println("\nDatos almacenados:");
        System.out.println("Nombre completo: "+name+" "+lastName);
        System.out.println("Edad: "+age);
        System.out.print("Estado Civil: ");
        if(isMarried) System.out.println("Casado");
        else System.out.println("Soltero");
    }
}
