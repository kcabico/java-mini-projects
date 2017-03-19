import java.util.Scanner;

public class PiCalc{
  public static void main(String[] args) {
    int yourInput = 0;
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter how many decimal places you want for Pi:");
    yourInput = input.nextInt();

    System.out.println("You chose the number : " + yourInput);
  }
}
