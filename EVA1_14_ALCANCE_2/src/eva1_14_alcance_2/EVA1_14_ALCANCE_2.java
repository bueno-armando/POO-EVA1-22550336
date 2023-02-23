package eva1_14_alcance_2;

public class EVA1_14_ALCANCE_2 {

    public static void main(String[] args) {
        int x = 100;
        for(int i=0 ; i<10 ; i++){
            int x = 100; //x ya se había declarado, no se puede redefinir
            int y = 100;
        }
        int y = 100; //se puede redefinir, su alcance previo terminó con el for
    }
    
}
