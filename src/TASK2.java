import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
    System.out.println("Enter the any word or number: ");
    Scanner str = new Scanner(System.in);
    StringBuffer buffer = new StringBuffer(str.nextLine());
    buffer.reverse();
    System.out.println("Reverse word (number) : " +  buffer);
  }
}
