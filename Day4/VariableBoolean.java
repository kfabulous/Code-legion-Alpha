public class VariableBoolean{
  public static void main(String arg[]){
    //initializing variables
    int health = 30;
    int glooWall = 1;
    int damage = 300;
    //Making comparisons
    boolean healthIsLow = health < 50;
    boolean healthIsFull = health == 200;
    boolean hasGlooWall = glooWall > 0;
    boolean knockdown = damage >= 200;
    //Displaying results
    System.out.println("Health is full: " + healthIsFull);
    System.out.println("Critical state: " + healthIsLow);
    System.out.println("Have enough gloo walls: " + hasGlooWall);
    System.out.println("Did knockdown an enemy: " + knockdown);
    //Bonus layer
    if (healthIsLow  && hasGlooWall )
      System.out.println("Warning!, set a gloo wall.");
    else if (healthIsLow && !hasGlooWall)
      System.out.println("Warning!, take cover.");
    else 
    System.out.println("You can still rush in.");
  }
   
}