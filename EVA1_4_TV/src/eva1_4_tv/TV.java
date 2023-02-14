package eva1_4_tv;

/**
 *
 * @author Armando Bueno
 */
public class TV {
    private short vol, channel;
    private boolean powerOn;
    
    //constructor
    TV(){
        vol = 0;
        channel = 0;
        powerOn = false;
    }
    
    //USER METHODS 
    //switch tv power
    public void powerSwitch(){
        powerOn = !powerOn;
        if(powerOn) System.out.println("TV Encendida");
        else System.out.println("TV Apagada");
    }
    //change volume
    public void volUp(){
        if(powerOn){
            if(vol == 100) System.out.println("MAX. VOL");
            else{
                vol++;
                System.out.println("VOL: "+vol);
            }
        }
    }
    public void volDown(){
        if(powerOn){
            if(vol == 0) System.out.println("MIN. VOL");
            else{
                vol--;
                System.out.println("VOL: "+vol);
            }
        }
    }
    //change channel
    public void channelUp(){
        if(powerOn){
            if(channel == 100) channel = 0;
            channel++;
            System.out.println("CH "+channel);
        }
        
        
    }
    public void channelDown(){
        if(powerOn){
            if(channel == 0) channel = 100;
            channel--;
            System.out.println("CH "+channel);
        }
    }
    //set methods
}
