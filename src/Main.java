public class Main {
    public static void main(String[] args) {

        //задание 1 часть первая;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
        //задание 2
        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }
        //задание 3
        for (int b = 0; b <= 17; b++) {
            if (b % 2 == 0) {

                System.out.println(b);
            }
        }
        //задание 4
        for (int c = 10; c >= -10; c--) {
            System.out.println(c);
        }
        //задание 5
        for (int d = 1904; d <= 2096; d++) {
            if ((d % 400 == 0) ||
                    (d % 4 == 0 && d % 100 != 0)) {
                System.out.println("Этот год является високосным " + d);
            }
        }


        //задание 6
        for (int a = 1; a <= 100; a++) {
            if (a % 7 == 0) {

                System.out.println(a);
            }
        }
        // задание 7
        int result = 1;

        for (int g = 1; g < 10; g++) {
            if (result == 1) {
                System.out.print(result + " ");
            }
            result *= 2;
            System.out.print(result + " ");
        }
        // ЗАДАНИЕ 8
        // 12 месяцев
        int sum = 0;
        for (int r = 1; r < 13; r++) {
            sum = sum + 29000;
            System.out.println("Месяц " + r + " , сумма накоплений равна " + sum + " рублей");
        }
            //задание 9
        int sum2 = 0;
        double savings = 0;
        for (int r = 1; r < 13; r++) {
            sum2 = sum2 + 29000;
           savings = savings + sum2* 0.01;

         System.out.println("Месяц " + r + " , сумма накоплений равна " + savings + " рублей");
        }


    }
}
















