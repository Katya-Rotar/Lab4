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
}
