import java.util.Scanner;

public class TASK5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число равное месяцу от 1 до 12 : ");
        int numberMounth = scanner.nextInt();
        int[] mounth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String[] nameMounth = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        boolean canName = false;
        for (int i = 0; i < 12; i = i + 1)
            if (numberMounth == mounth[i]) {
                System.out.println("Месяц который соответствует введенной цифре - это  " + nameMounth[i]);
                canName = true;
            }
            if (!canName) {
                    System.out.println("Такого месяца нет, введите цифру от 1 до 12:  ");
                          }
            }
}

