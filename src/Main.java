
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        while (true) {
            System.out.println("""

                    Щоб завершити виконання введіть "0"
                    Введіть номер задачі:""");
            int start = i.nextInt();
            switch (start) {
                case 0 -> {}
                case 1 -> exercise1(i);
                case 2 -> exercise2(i);
                case 3 -> exercise3(i);
                case 4 -> exercise4(i);
                case 5 -> exercise5(i);
                default -> System.out.println("Такої дії не існує");
            }
            if(start == 0){
                break;
            }
        }
    }

    private static void exercise1(Scanner i) {
        System.out.println("Введіть рік, місяць та день народження першої людини");
        int year1 = i.nextInt();
        int month1 = i.nextInt();
        int day1 = i.nextInt();
        System.out.println("Введіть рік, місяць та день народження другої людини");
        int year2 = i.nextInt();
        int month2 = i.nextInt();
        int day2 = i.nextInt();
        int people = 0;
        int senior;
        int less;
        if (year1 < year2) {
            senior = year1;
            less = year2;
        }
        else {
            senior = year2;
            less = year1;
        }
            for ( int a = senior; a <= less; a++){
                if( a == senior){
                    people += 12 - month1;
                }
                else if(a == year2){
                    people += month2;
                }
                else {
                    people += 12;
                }
            }
        System.out.println(people);
    }

    private static void exercise2(Scanner i) {
        
    }

    private static void exercise3(Scanner i) {
        
    }

    private static void exercise4(Scanner i) {
        
    }

    private static void exercise5(Scanner i) {
    }
}