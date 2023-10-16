public class HW_6 {
    public static void main(String[] args) {
        System.out.println("ДОМАШКА 6");
        System.out.println();
        {
            System.out.println("Задача 1");
            for (int a = 1; a <= 10; a++) {
                System.out.println(a);
            }
        }
        System.out.println();
        {
            System.out.println("Задача 2");
            for (int a = 10; a > 0; a--) {
                System.out.println(a);
            }
        }
        System.out.println();
        {
            System.out.println("Задача 3");
            for (int a = 2; a < 17; a = a + 2) {
                System.out.println(a);
            }
        }
        System.out.println();
        {
            System.out.println("Задача 4");
            for (int a = 10; a >= -10; a--) {
                System.out.println(a);
            }
        }
        System.out.println();
        {
            System.out.println("Задача 5");
            for (int a = 1904; a <= 2096; a = a + 4) {
                System.out.println(a + " год является високосным");
            }
            System.out.println();
            {
                System.out.println("Задача 6");
                for (int a = 7; a <= 98; a = a + 7) {
                    System.out.println(a);
                }
                System.out.println();
            }
            {
                System.out.println("Задача 7");
                for (int a = 1; a <= 512; a = a * 2) {
                    System.out.println(a);
                }
                System.out.println();
            }
            {
                System.out.println("Задача 8");
                int sumBanka = 0;
                for (int m = 1; m <= 12; m++) {
                    sumBanka = sumBanka + 29000;
                    System.out.println("Месяц " + m + ", сумма накоплений равна " + sumBanka + " рублей");
                }
                System.out.println();
            }
            {
                System.out.println("Задача 9");
                double deposit = 0;
                for (int m = 1; m <= 12; m++) {
                    deposit = deposit * 1.01 + 29000;
                    System.out.println("Месяц " + m + ", сумма накоплений в банке равна " + deposit + " рублей");
                }
                System.out.println();
            }
            System.out.println("Задача 10");
            for (int a = 1; a <= 10; a++) {
                System.out.println("2 * " + a + " = " + 2 * a);
            }
        }
    }
}
