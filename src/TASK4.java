import java.util.Scanner;

public class TASK4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первой целое число: ");
         int a = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе целое числа: ");
         int b = scanner2.nextInt();
         int sum =a+b;
        System.out.println("Произведение  чисел =  " + sum);
    }
}

