package eva1_6_automovil;
/**
 * @author Armando Bueno
 */

public class Automovil {
    private String brand, model, plates, ownerName;
    private int year, adeudo;
    
    //constructor default
    Automovil(){
        brand = "NA";
        model = "NA";
        plates = "NA";
        year = -1;
        ownerName = "NA";
    }
    
    //constructor con argumentos
    Automovil(String _marca, String _modelo, String _placas, int _año, String _dueño){
        brand = _marca;
        model = _modelo;
        plates = _placas;
        year = _año;
        ownerName = _dueño;
    }
    
    //imprimir datos
    public void printData(){
        System.out.println("\nMARCA: "+brand);
        System.out.println("MODELO: "+model);
        System.out.println("PLACAS: "+plates);
        System.out.println("AÑO: "+year);
        System.out.println("NOMBRE DEL DUEÑO: "+ownerName);
        System.out.println("**** ADEUDO: "+adeudo+" ****");
    }
    
    //calcular adeudo
    public void makeDebit(){
        if(year <= 2000) adeudo = 1500;
        else if(year >= 2001 && year <= 2005) adeudo = 2000;
        else if(year >= 2006 && year <= 2010) adeudo = 2500;
        else if(year >= 2011 && year <= 2015) adeudo = 3000;
        else adeudo = 4000;
    }
    
    //set methods
    public void setBrand(String val){
        brand = val;
    }
    public void setModel(String val){
        model = val;
    }
    public void setPlates(String val){
        plates = val;
    }
    public void setYear(int val){
        year = val;
    }
    public void setOwner(String val){
        ownerName = val;
    }
    //get methods
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public String getPlates(){
        return plates;
    }
    public int getYear(){
        return year;
    }
    public String getOwner(){
        return ownerName;
    }
}
