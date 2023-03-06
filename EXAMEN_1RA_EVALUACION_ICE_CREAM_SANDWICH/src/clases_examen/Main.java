package clases_examen;

/**
 *
 * @author Equipo ICE CREAM SANDWICH
 */
public class Main {
    public static void main(String[] args){
        //DATOS DEL EQUIPO
        System.out.println("****** DATOS DEL EQUIPO *******");
        DatosIntegrantes.imprimirDatosEquipo();
        DatosIntegrantes.imprimirProblemasResueltos();
        
        //CONTRASEÑA
        System.out.println("\n****** CONTRASEÑA *******");
        System.out.println("REQUIERE ENTRADA DE TECLADO");
        Password user_1 = new Password();
        user_1.setUser("Prueba");
        user_1.setPassword("prueba_2017");
        System.out.println(user_1.verificarAcceso(true));
        
        //PELICULA
        System.out.println("\n****** PELÍCULA *******");
        Pelicula peli1 = new Pelicula();
        peli1.setEstudio("20th Century Studios");
        peli1.setRating("C");
        peli1.setEdad(19);
        peli1.setTitulo("Deadpool");
        peli1.imprimirDatos();
        peli1.evaluarEdad();
        System.out.println("..................");
        Pelicula peli2 = new Pelicula ();
        peli2.setEstudio("20th Century Studios");
        peli2.setRating("C");
        peli2.setEdad(15);
        peli2.setTitulo("Logan");
        peli2.imprimirDatos();
        peli2.evaluarEdad();
        
        //TEST COVID
        System.out.println("\n****** PRUEBA COVID *******");
        TestCovid pruebaCovid = new TestCovid();
        pruebaCovid.setAge(64);
        pruebaCovid.setChronicIll(false);
        pruebaCovid.setWeightKg(72.4);
        pruebaCovid.setHeightMts(1.68);
        System.out.println("DATOS: ");
        System.out.println("Edad: "+pruebaCovid.getAge());
        System.out.println("Peso: "+pruebaCovid.getWeightKg());
        System.out.println("Altura: "+pruebaCovid.getHeightMts());
        if(pruebaCovid.getChronicIll()) System.out.println("Enfermedad Crónica: SI");
        else System.out.println("Enfermedad Crónica: NO");
        System.out.println(pruebaCovid.calcularPersonaRiesgo());
        
        //CUENTA BANCARIA
        System.out.println("\n****** CUENTA BANCARIA *******");
        System.out.println(".........................................");
        CuentaBancaria client1 = new CuentaBancaria ();
        client1.setNomCliente("Mike");
        client1.setNumCuenta("854316");
        System.out.println(client1.getSaldo());
        client1.depositarEnCuenta(800);
        client1.retirarDeCuenta(200);
        client1.imprimirDatos();
        System.out.println(".........................................");
        CuentaBancaria client2 = new CuentaBancaria ("855124", 2500, "Joel");
        client2.depositarEnCuenta(500);
        client2.imprimirDatos();
        System.out.println(".........................................");
        CuentaBancaria client3 = new CuentaBancaria ("250879", 1500, "Harvey");
        client3.imprimirDatos();  
        client3.retirarDeCuenta(2000);
        
        //EMPLEADO
        System.out.println("\n****** EMPLEADO *******");
        Empleado Prueba_1  = new Empleado();
        Prueba_1.setName("Cesar");
        Prueba_1.setLastName("Urias");
        Prueba_1.setAddress("Colegio de fide #1824");
        Prueba_1.setYear(2013);
        Prueba_1.setSalary(2500);
        Prueba_1.imprimirDatos();
        
        //FIBONACCI
        System.out.println("\n****** FIBONACCI *******");
        Fibonacci fib1 = new Fibonacci();
        fib1.setA1(3); //primer valor 
        fib1.setA2(5); //segundo valor
        fib1.setN(6);//la posicion a conocer de nuestra secuencia
        System.out.println("Primer valor: "+fib1.getA1());
        System.out.println("Segundo valor: "+fib1.getA2());
        System.out.print("Número en la posición "+fib1.getN()+": ");
        fib1.imprimirFibo();//este metodo solo imprime el valor de la posicion "n"
        //hay un metodo ".calcularFibo" que devuelve el valor long
        //de Fibonacci
    }
}
