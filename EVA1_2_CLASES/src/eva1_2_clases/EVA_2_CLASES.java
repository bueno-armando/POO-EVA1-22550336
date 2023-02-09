package eva_2_clases;
/**
 *
 * @author Armando Sebastián Bueno Núñez. 22550336
 */
public class EVA_2_CLASES {
    public static void main(String[] args) {
        //Person 1
        Persona myPerson = new Persona();
        myPerson.setName("Armando");
        myPerson.setLastName("Bueno");
        myPerson.setAge(18);
        myPerson.setIsMarried(false);
        myPerson.printData();
        
        //Person 2
        Persona myPerson2 = new Persona();
        myPerson2.setName("Persona");
        myPerson2.setLastName("Casada");
        myPerson2.setAge(50);
        myPerson2.setIsMarried(true);
        myPerson2.printData();
    }
    
}
