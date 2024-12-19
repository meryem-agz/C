package exercice1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonnageTest {
    @Test
    void tourner_0(){
        Personnage p=new Personnage();
        String nb=Personnage.tourner(0);
        assertEquals("nord",nb,"we expect "+"  "+nb+"but we found "+nb) ;
    }
    @Test
    void tourner_1(){
        Personnage p=new Personnage();
        String nb=Personnage.tourner(1);
        assertEquals("EST",nb,"we expect "+"  "+nb+"but we found "+nb) ;
    }
    @Test
    void tourner_2(){
        Personnage p=new Personnage();
        String nb=Personnage.tourner(2);
        assertEquals("SUD",nb,"we expect "+"  "+nb+"but we found "+nb) ;
    }
    @Test
    void tourner_3(){
        Personnage p=new Personnage();
        String nb=p.tourner(3);
        assertEquals("WEST",nb,"we expect "+"  "+nb+"but we found "+nb) ;
    }
    @Test
    void tourner_14(){
        Personnage p=new Personnage();
        String nb=Personnage.tourner(14);
        assertEquals("SUD",nb,"we expect "+"SUD"+"but we found "+nb) ;
    }
}
