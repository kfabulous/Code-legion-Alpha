import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    //initializing array
    String choice[] = {"Rock", "Paper", "Scissors"}; 
    //Reading inputs from user
    System.out.println("Enter 0 for rock, 1 for paper or 2 for scissors: ");
    while (true) {
      System.out.println("Enter your choice: ");
      int userChoice = input.nextInt();
      //validating user input
      if (userChoice < 0 || userChoice > 2){
        System.out.println("Invalid choice. Try again!");
        continue;
      }
      int computerChoice = random.nextInt(3);
      //Displaying both choices
      System.out.println("Computer's choice is: " + choice[computerChoice]);
      System.out.println("Your choice was: " + choice[userChoice]);
      //Determine the winner
      if(userChoice == computerChoice){
        System.out.println("It's a tie ");
      }else if ((userChoice == 0 && computerChoice == 2) ||
               (userChoice == 1 && computerChoice == 0) ||
               (userChoice == 2 && computerChoice == 1)){
                System.out.println("You won!");
      }else{
                System.out.println("Computer wins!");
               }
      //Checking if the user wants to continue playing
      System.out.println("Play again? (y/n) ");
      char playAgain = input.next().toLowerCase().charAt(0);
      if(playAgain != 'y'){
        break;
      }
    }
    System.out.println("Thanks for playing!");
  }
  
}
