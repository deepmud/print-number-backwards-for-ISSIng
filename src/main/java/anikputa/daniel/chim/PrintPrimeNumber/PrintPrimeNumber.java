package anikputa.daniel.chim.PrintPrimeNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrintPrimeNumber {
    public PrintPrimeNumber(){}

    private int[] generatenumber1To100p() {
        int[] numbers = new int[100];
        int s = 1;
        for(int i = 0; i < 100; i++){
            numbers[i] = s++;
        }
        return numbers;
    }

    public int[] generatePrimeNumbers(int[] generated1To100) {
          System.out.println("Prime Number in 1 - 100");
          int i = 1;
          Stack<int[]> listOfPrimeNumbers= new Stack<>();
          for (int number: generated1To100) {
              if (number == 1 || number == 2 || number == 3 || number == 5 || number == 7
              || number == 11 || number == 13) {
                  if(number!=1) {
                      i++;
                      listOfPrimeNumbers.push(new int[]{number});
                  }
              }
              else if(number % (number / 2) != 0 &&
                      number % (number / 3) != 0 &&
                      number % (number / 5) != 0 &&
                      number % (number / 7) != 0 ){
                  i++;
                  listOfPrimeNumbers.push(new int[]{number});
              }
          }
          int s = i- 1;
          int[] primeNumbers = new int[s];
          for (int m = 0; m < s; m++){
              primeNumbers[m] = listOfPrimeNumbers.pop()[0];
              System.out.println(primeNumbers[m]);
          }
          return primeNumbers;
   }

    public static void main(String[] args){

        PrintPrimeNumber b= new PrintPrimeNumber();
       b.generatePrimeNumbers(b.generatenumber1To100p());


    }
}
