import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        while (true) {
            System.out.println("""

                    Щоб завершити виконання введіть "0"
                    Введіть номер задачі:""");
            int start = i.nextInt();
            switch (start) {
                case 0 -> {}
                case 1 -> exercise9(i);
                case 2 -> exercise2(i);
                case 3 -> exercise4(i);
                default -> System.out.println("Такої дії не існує");
            }
            if(start == 0){
                break;
            }
        }
    }

    private static void exercise9(Scanner i) {
        System.out.println("Введіть значення n");
        int n = i.nextInt();
        double n1 = 0;
        for (int a = 1; a <= n; a++){
            n1 += 1/n;
        }
        System.out.println(n1);
    }
    private static void exercise2(Scanner i){
        System.out.println("Введіть значення n");
        int n = i.nextInt();
        if(n > 1 && n < 10) {
            for (int a = 1; a <= 9; a++) {
                int b = a * n;
                System.out.println(a + " x " + n + " = " + b);
            }
        }
        else
            System.out.println("n не відповідає діапазону");
    }
    private static void exercise4(Scanner i){
        System.out.println("Введіть натуральні числа");
        int x = i.nextInt();
        int y = i.nextInt();
        int xy = 0;
        for(int a = 1; a <= y; a++){
            xy += x;
        }
        System.out.println(xy);
    }
}
