
import java.util.Arrays;
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
        int[] people1 = new int[3];
        int[] people2 = new int[3];
        for(int p1 = 0; p1 < people1.length; p1++){
            people1[p1] = i.nextInt();
        }
        System.out.println("Введіть рік, місяць та день народження другої людини");
        for(int p2 = 0; p2 < people2.length; p2++){
            people2[p2] = i.nextInt();
        }
        int[] senior;
        int[] less;
        int people = 0;
        if (people1[0] < people2[0]) {
             senior = Arrays.copyOf(people1,3);
             less = Arrays.copyOf(people2,3);
        }
        else {
            senior = Arrays.copyOf(people2,3);
            less = Arrays.copyOf(people1,3);
        }
            for ( int a = senior[0]; a <= less[0]; a++){
                if( a == senior[0]){
                    people += 12 - senior[1];
                }
                else if(a == less[0]){
                    people += less[1];
                }
                else {
                    people += 12;
                    if(senior[2] > less[2]){
                        people--;
                    }
                }
            }
            String s = Arrays.toString(senior);
        System.out.println("Старший той хто народився: "+ s +" на "+ people +" повних місяців");
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