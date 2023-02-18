package eva1_6_automovil;
/**
 * @author Armando Bueno
 */
public class EVA1_6_AUTOMOVIL {

    public static void main(String[] args) {
        //OBJETO 1 USANDO CONSTR DEFAULT
        Automovil auto1 = new Automovil();
        auto1.setBrand("Volskwagen");
        auto1.setModel("Passat");
        auto1.setPlates("7AAA351");
        auto1.setYear(1996);
        auto1.setOwner("Ricardo Contreras");
        auto1.makeDebit();
        auto1.printData();
        
        //OBJETO 2 USANDO CONSTR CON ARGUMENTOS
        Automovil auto2 = new Automovil("Gmc", "Terrain Sle", "DJN7003", 2016, "Juan Jano");
        auto2.makeDebit();
        auto2.printData();
    }
}
