import java.util.Scanner;

public class NumberGuessing {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Guess a number between 0 and 10: ");    
    int number = (int)(Math.random() * 11);
    
    while(true) {
      int guess = input.nextInt();
      if(number == guess) {
        System.out.println("The number I was thinking was: " + number);
        System.out.println("Congratulations! You've guessed correctly!");      
      }
      else {
        System.out.println("Sorry, try again!");
        System.out.println("The number I was thinking was: " + number);
        number = (int)(Math.random() * 11);
      }
    }
  }
}