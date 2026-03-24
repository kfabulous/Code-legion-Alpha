import java.util.Scanner;
public class Operations{
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    
    int firstNumber = 10;
    double secondNumber = 60.59;
    // Performing mathematical calculations
    double addition = firstNumber + secondNumber;
    double subtruction = secondNumber - firstNumber;
    double multiplication = firstNumber * secondNumber;
    double division = secondNumber / firstNumber;
    //Displaying results
    System.out.println("Addition: " + firstNumber +" + " + secondNumber + " = " + addition);
    System.out.println("Subtruction: " + secondNumber +" - " + firstNumber + " = " + subtruction);
    System.out.println("Multiplication: " + firstNumber +" * " + secondNumber + " = " + multiplication);
    System.out.println("Division: " + secondNumber +" / " + firstNumber + " = " + division);
    //Bonus layer
    System.out.println("Calculating the area o a rectangle");
    //Reading inputs from user
    System.out.println("Enter the lenght(in cm): ");
    double lenght = scanner.nextDouble();
    System.out.println("Enter the bredth(in cm): ");
    double bredth = scanner.nextDouble();
    //Performing calculations
    double area = lenght * bredth;
    //Displaying results
    System.out.println("Area of the rectangle is :" + " " + area + "cm");


  }
}