package anikputa.daniel.chim.PrintPrimeNumber;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrintPrimeNumberTests {

    @Test
    void shouldSeiveOutPrimeNumbers(){
        PrintPrimeNumber printPrimeNumber= new PrintPrimeNumber();
        int[] number1To100 = generatenumber1To100();
        Assertions.assertEquals(25,printPrimeNumber.generatePrimeNumbers
                (generatenumber1To100()).length,
                "the shouldSeiveOutPrimeNumbers was not returned");

    }
    public int[] generatenumber1To100() {
        int[] numbers = new int[100];
        int s = 1;
        for(int i = 0; i < 100; i++){

            numbers[i] = s++;
        }
        return numbers;
    }

}
