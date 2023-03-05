package clases_examen;

/**
 *
 * @author César Alejadro Urías González
 */
public class Empleado {
    private String name;
    private String lastName;
    private String address;
    private int year;
    private double salary;
    
    //SET AND GET
    public void  setName(String infName){
     name=infName;
    }
    public void  setLastName(String infLastName){
     lastName=infLastName;
    }
    public void  setAddress(String infAddress){
     address=infAddress;
    }
    public void  setYear(int infYear){
     year=infYear;
    }
    public void  setSalary(double infSalary){
     salary=infSalary;
    }
   
    public String getName(){
     return name;
    }
    public String getLastName(){
     return lastName;
    }
    public String getAddress(){
     return address;
    }
    public int getYear(){
     return year;
    }
    public double getSalary(){
     return salary;
    }
    
    //Constructores
    //Deafault
    public Empleado(){
      name="-----";
      lastName="-----";
      address="-----";
      year=0000;
      salary= 0.0;
    }
    //Con argumentos
    public Empleado(String infName,String infLastName, String infAddress, int infYear, double infSalary ){
        name = infName;
        lastName = infLastName;
        address = infAddress;
        year = infYear;
        salary = infSalary;
    }
    
    //MÉTODOS CALCULAR VACACIONES E IMPRIMIR DATOS
    public int calcularVacaciones(){
    int antiguedad= 2023-year;
    int vacaciones=6;
    for(int i=1;i<antiguedad;i++){
       vacaciones +=2;
       if(i%5==0)
       vacaciones +=2;
    }  
    return vacaciones;
    }
 
    public void imprimirDatos(){
      System.out.println("Nombre: "+name+" "+lastName);
      System.out.println("Dierección: "+address);
      System.out.println("Año de ingreso: "+year);
      System.out.println("Salario: "+salary);
      System.out.println("Vacaciones: "+ calcularVacaciones());
  }
}
