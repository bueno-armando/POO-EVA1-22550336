package clases_examen;

/**
 *
 * @author jaime
 */
public class Main {
    public static void main(String[] args){
        DatosIntegrantes.imprimirDatosEquipo();
        DatosIntegrantes.imprimirProblemasResueltos();
        
      /* Password user_1 = new Password();
         user_1.setUser("Prueba");
         user_1.setPassword("prueba_2017");
         System.out.println(user_1.verificarAcceso(true));
         */
         Empleado Prueba_1  = new Empleado();
         Prueba_1.setName("Cesar");
         Prueba_1.setLastName("Urias");
         Prueba_1.setAddress("Colegio de fide #1824");
         Prueba_1.setYear(2013);
         Prueba_1.setSalary(2500);
         
         Prueba_1.imprimirDatos();
         
        
         
   /* int year=2013;
    int antiguedad= 2023-year;
    int añoAdicional=2;
    int cada5años=2;
    int vacaciones=6;
    for(int i=0;i<antiguedad;i++){
       System.out.println(i);
       vacaciones=añoAdicional+vacaciones;
       if(i%5==0){
       vacaciones= vacaciones+añoAdicional+cada5años;
       }
    }
     */
    }
}
