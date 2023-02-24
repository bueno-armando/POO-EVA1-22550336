package eva1_18_sobrecarga_rfc;

/**
 * @author Armando Bueno
 */
public class EVA1_18_SOBRECARGA_RFC {

    public static void main(String[] args) {
  
        System.out.println("RFC con todos los datos: "+generarRFC("ARMANDO","BUENO","NUÑEZ",2004,7,5));
        System.out.println("RFC sin apellido materno: "+generarRFC("ARMANDO", "BUENO", 2004, 7, 5));
        System.out.println("RFC sin apellido paterno: "+generarRFC("ARMANDO", "NUÑEZ", 2004, 7, 5));
        System.out.println("RFC sin ningun apellido: "+generarRFC("ARMANDO", 2004, 7, 5));
    }    
    public static String generarRFC(String nombre, String apePat, String apeMat, int año, int mes, int día){
        String inisPat1 = apePat.charAt(0)+"";
        String inisPat2 = apePat.charAt(1)+"";
        String iniMat = apeMat.charAt(0)+"";
        String iniNom = nombre.charAt(0)+"";
        String rfc = inisPat1+inisPat2+iniMat+iniNom+año+mes+día+"";
        return rfc;
    }
    //sin apellido paterno o materno
    public static String generarRFC(String nombre, String ap, int año, int mes, int día){
        String inis = ap.charAt(0)+"";
       
        String iniNom = nombre.charAt(0)+"";
        String rfc = inis+"X"+iniNom+año+mes+día;
        return rfc;
    }
    //sin ningún apellido
    public static String generarRFC(String nombre, int año, int mes, int día){
        String iniNom = nombre.charAt(0)+"";
        String rfc = "XX"+iniNom+año+mes+día;
        return rfc;
    }
    
}
