import java.util.Scanner;

public class ReverseString{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String yourString = "";
    String yourOutput = "";

    System.out.print("Enter a string: ");
    yourString = input.nextLine();

    for(int i = 0; i < yourString.length(); i++){
      yourOutput = yourString.charAt(i) + yourOutput;
    }
    if(yourOutput.replaceAll(" ", "").equals(yourString.replaceAll(" ", ""))){
      System.out.println("Your have a palindrome!");
    }

    System.out.println(yourOutput);
  }
}
