package controle.tdd;

public class FuzzBuzz {
        public static String de(int nbr) {
            String chaine=" " ;
            if(nbr%3==0) {
                if (nbr % 5 == 0) {
                    chaine = "FizzBuzz";
                } else chaine = "Fizz";
            }
            else if(nbr%5==0)
                chaine="Buzz";
            else chaine= String.valueOf(nbr) ;
            return chaine;
}
    }










