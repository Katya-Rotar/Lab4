import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        while (true) {
            System.out.println("""

                    Щоб завершити виконання введіть "0"
                    Введіть номер задачі:""");
            int start = i.nextInt();
            switch (start) {
                case 0 -> {}
                case 1 -> Lab5.exercise9(i);
                case 2 -> exercise1(i);
                case 3 -> exercise3(i);
                case 4 -> exercise5(i);
                default -> System.out.println("Такої дії не існує");
            }
            if(start == 0){
                break;
            }
        }
    }
    private static void exercise1(Scanner i){
        System.out.println("Введіть число а");
        int a = i.nextInt();
        int max = 0;
        for(int n = 1; n < 5000; n++){
            if( n % a == 0){
                max = n;
            }
        }
        System.out.println(max);
    }
    private static void exercise3(Scanner i){
        System.out.println("""
                Введіть n цілих чисел
                Щоб завершити введіть 0
                """);
        int exid = 1;
        int sum = 0;
        while (exid != 0){
            int n = i.nextInt();
            sum += n;
            if (n == 0){
                exid--;
            }
        }
        System.out.println(sum);
    }
    private static void exercise5(Scanner i){
        System.out.println("Введіть максимальне можливе значення");
        int n = i.nextInt();
        System.out.println("Введіть послідовність цілих чисел");
        int exid = 0;
        int sum = 0;
        int N = 0;
        while (exid != n) {
            int n1 = i.nextInt();
            if (n1 >= 0) {
                if (n1 == n) {
                    exid = n;
                } else {
                    sum += n1;
                    N++;
                }
            }
        }
        int number = sum / N;
        System.out.println(number);
    }
}
