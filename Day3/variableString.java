public class variableString{
  
  public static void main(String[] args) {
    //variable declaration
    String name = "Alpha";
    String lowerCase = name.toLowerCase();
    String upperCase = name.toUpperCase();
    int length = name.length();
    //Displaying results
    System.out.println("Name(In lowercase): " + lowerCase);
    System.out.println("Name(In uppercase): " + upperCase);
    System.out.println("Length of the entire word: " + length);
    //Displaying index '0' and '2' of the word
    System.out.println("Index'0': " + name.charAt( 0));
    System.out.println("Index'2': " + name.charAt( 2));
     //Bonus layer(Display first and last 3 letters of the word)
    System.out.println("First 3 letters: " + name.substring(0,3));
    System.out.println("Last 3 letters: " + name.substring(name.length() - 3));

  }
}