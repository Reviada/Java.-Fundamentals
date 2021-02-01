import java.util.Scanner;
public class TASK1 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner str = new Scanner(System.in);
        System.out.println("Hello, " + str.nextLine() + "!" );
    }
}