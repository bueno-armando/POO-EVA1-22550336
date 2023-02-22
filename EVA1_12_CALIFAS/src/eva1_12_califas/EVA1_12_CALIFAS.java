package eva1_12_califas;

/**
 * @author Armando Bueno
 */
public class EVA1_12_CALIFAS {
    
    public static void main(String[] args) {
        char grade1 = makeGrade(89); //se almacena en una variable
        char grade2 = makeGrade(96.8);
        char grade3 = makeGrade(-1);
        System.out.println("Grade for 89: "+grade1);
        System.out.println("Grade for 96.8: "+grade2);
        System.out.println("Grade for -1: "+grade3);
        makeGrade(85); //se ignora el resultado
         
    }
    
    public static char makeGrade(double num){
        //return detiene a la función (no se necesita else)
        if(num >= 0 && num <= 70) return 'D';
        if(num >= 71 && num <= 80) return 'C';
        if(num >= 81 && num <= 90) return 'B';
        if(num >= 91 && num <= 100) return 'A';
        return '?'; //número fuera de rango
    }
}
