import java.util.ArrayList;
import java.util.Random;

public class Arrays{
  public static void main(String args[]){
    //Initialyzing an array
    String names[] = {"Alpha" , "Phantom" , "Beast" , "Queen" , "Pearl"};
   
    //Using for loop to display items in the entire array
    for (int i = 0; i < names.length; i++ ){
    System.out.println("Name: " + names[i]);}
    //Displaying first and last item
    System.out.println("First Name: " + names[0]);
    System.out.println("Second Name: " + names[names.length-1]);
    //Modifying and Displaying an item in the array
    names[0] = "NoobGod";
    for (int i = 0; i < names.length; i++ ){
    System.out.println("Modified Name: " + names[i]);}
    //Bonus Layer
    ArrayList<String> name = new ArrayList<>();
    name.add("Farida");
    name.add("Andrea");
    name.add("Lamar");
    name.add("Salma");
    //Generating a random name from the list
    Random rand = new Random();
    int randomIndex = rand.nextInt(name.size());
    String chosenOne = name.get(randomIndex);
    //Displaying the random name
    System.out.println("Your girlfriend is: " + chosenOne);

  }
}