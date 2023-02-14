package eva1_4_tv;

/**
 *
 * @author Armando Bueno
 */

public class EVA1_4_TV {
    public static void main(String[] args) {
        TV myTV = new TV();
        
        myTV.powerSwitch();
        for(int i=0 ; i<100 ; i++) myTV.channelUp();
        for(int i=0 ; i<100 ; i++) myTV.channelDown();
    }
}
