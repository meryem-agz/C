package controle.tdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FuzzBuzzTest {
        @Test
        void fizzbuzz() {
            FuzzBuzz F=new FuzzBuzz();
            String resulta=F.de(1);
            assertEquals("1",resulta);
        }
        @Test
        void fizzbuzz1() {
            FuzzBuzz F=new FuzzBuzz();
            String resulta=F.de(3);
            assertEquals("Fizz",resulta);
        }
        @Test
        void fizzbuzz2(){
            FuzzBuzz F=new FuzzBuzz();
            String resulta=F.de(5);
            assertEquals("Buzz",resulta);
        }
        @Test
        void fizzbuzz3(){
            FuzzBuzz F=new FuzzBuzz();
            String resulta=F.de(15);
            assertEquals("FizzBuzz",resulta);
        }
    }

