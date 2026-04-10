import java.util.Scanner;

public class Loops{
  public static void main(String[] arg){

    Scanner input = new Scanner(System.in);
    //Telling a user about how the program works
    System.out.println("A multiplication time table for any number entered by a user");
    System.out.println("Enter the number: ");
    int number = input.nextInt();
    //using for loop to generate and display numbers for multiplication
    for (int i=1; i<13; i++){
      int result = number*i;
      System.out.println(number + " x " + i + " = " + result);

    }
    input.close();
  }
}