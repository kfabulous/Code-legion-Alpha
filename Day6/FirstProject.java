import java.util.ArrayList;
import java.util.Scanner;

public class FirstProject{
  public static void main(String arg[]){
    
    ArrayList<String> items = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    System.out.println(" Adding three Items Manually; ");
    System.out.println("Enter the first item: ");
    items.add(input.nextLine());
     System.out.println("Enter the second item: ");
    items.add(input.nextLine());
     System.out.println("Enter the third item: ");
    items.add(input.nextLine());
    //View phase
    System.out.println(" Your current list: " + items);
    System.out.println("Total items: " + items.size());
    //Removal phase
    System.out.println("Type the item you want to remove: ");
      String itemRemover = input.nextLine();

      if (items.contains(itemRemover)){
        items.remove(itemRemover);
        System.out.println("Successfully Removed " + itemRemover);
      }else{
        System.out.println("Item not found.");}
     
    //final output
    System.out.println("Final list = " + items);
  }
}
