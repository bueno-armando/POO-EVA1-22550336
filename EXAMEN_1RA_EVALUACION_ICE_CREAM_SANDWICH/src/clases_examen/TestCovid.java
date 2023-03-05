package clases_examen;

public class TestCovid {
    private int age;
    private boolean chronicIll;
    private double weightKg, heightMts;
    
    //set
    public void setAge(int val){
        age = val;
    }
    public void setChronicIll(boolean val){
        chronicIll = val;
    }
    public void setWeightKg(double val){
        weightKg = val;
    }
    public void setHeightMts(double val){
        heightMts = val;
    }
    //get
    public int getAge(){
        return age;
    }
    public boolean getChronicIll(){
        return chronicIll;
    }
    public double getWeightKg(){
        return weightKg;
    }
    public double getHeightMts(){
        return heightMts;
    }
    
    public String calcularPersonaRiesgo(){
        if(age>=65 || chronicIll==true || calcularIMC()>30) return "PERSONA DE RIESGO";
        return "PERSONA SIN RIESGO";
    }
    
    /*se creó calcularIMC como método dentro de esta clase, 
    ya que no se puede usar un método privado en otra clase
    como se pedía*/
    private double calcularIMC(){
        return (weightKg*heightMts)/2;
    }
}