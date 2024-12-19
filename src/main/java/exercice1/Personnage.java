package exercice1;

public class Personnage {
    public static String tourner(int  fois ){
        String orio="nord";
        if(fois%4==1) orio="EST" ;
        if (fois%4==2)orio="SUD";
        if(fois%4==3)orio="WEST";
        return orio;
    }
}
