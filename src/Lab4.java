
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        while (true) {
            System.out.println("""

                    Щоб завершити виконання введіть "0"
                    Введіть номер задачі:""");
            int start = i.nextInt();
            switch (start) {
                case 0 -> {}
                case 1 -> exercise6(i);
                case 2 -> exercise3(i);
                case 3 -> exercise4();
                default -> System.out.println("Такої дії не існує");
            }
            if(start == 0){
                break;
            }
        }
    }

private static void exercise6(Scanner i){
    System.out.print("""
                Арифметичні дії:
                1 – додавання
                2 – віднімання
                3 - множення
                4 – ділення
                Введіть номер арифметичної дії
                """);
    int number = i.nextInt();
    System.out.println("Введіть два дійсні числа");
    int A = i.nextInt();
    int B = i.nextInt();
    switch (number){
        case 1 -> {
            int action1 = A + B;
            System.out.println(action1);
        }
        case 2 -> {
            int action2 = A - B;
            System.out.println(action2);
        }
        case 3 -> {
            int action3 = A * B;
            System.out.println(action3);
        }
        case 4 -> {
            if (B == 0){
                System.out.println("На 0 ділити не можна");
            }
            else {
                int action4 = A / B;
                System.out.println(action4);
            }
        }
        default -> System.out.println("Такої дії не існує");
    }
}
    /*private static void exercise1(Scanner i) {
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
        if(people1[0] == people2[0]){
            if(people1[1] < people2[1]){
                senior = Arrays.copyOf(people1,3);
                less = Arrays.copyOf(people2,3);
            }
            else {
                senior = Arrays.copyOf(people2,3);
                less = Arrays.copyOf(people1,3);
            }
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

     */

    private static void exercise3(Scanner i) {
        int[] n = new int[]{3,7,9};
        for (int b = 0; b < 3; b++) {
            int number = i.nextInt();
            for (int j : n) {
                if (j == number) {
                    System.out.println("Ця цифра входить в це число");
                }
            }
        }
    }

    private static void exercise4() {
        int x1 = 2;
        int x2 = 4;
        int x3 = 9;
        int y1 = 3;
        int y2 = 6;
        int y3 = 1;
        double AB = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double AC = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        double CB = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        if (AB + AC > CB || AB + CB > AC || AC + CB > AB){
            System.out.print("З чих відрізків можна побудувати трикутник і він ");
            double action1 = Math.pow(AC,2) + Math.pow(CB,2);
            double action2 = Math.pow(AB,2) + Math.pow(CB,2);
            double action3 = Math.pow(AC,2) + Math.pow(AB,2);
            if( AB * AB == action1 || AC * AC == action2 || CB * CB == action3){
                System.out.println("прямокутний");
            } else if ( AB * AB > action1 || AC * AC > action2 || CB * CB > action3){
                System.out.println("тупокутній");
            }
            else{
                System.out.println("гострокутній");
            }
        }
    }
}