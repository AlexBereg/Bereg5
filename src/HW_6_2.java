public class HW_6_2 {
    public static void main(String[] args) {
        System.out.println("Домашка 6/2 по теме 'Циклы. Урок 2'");
        System.out.println();
        {
            System.out.println("Задача 1");
            double deposit = 0;
            int m = 1;
            while (deposit <= 2_459_000)
            {
                deposit = deposit * 1.01 + 15000;
                System.out.println("Месяц " + m + ", сумма накоплений в банке равна " + deposit + " рублей");
                m++;
            }
            System.out.println();
        }
        {
            System.out.println("Задача 2");
            int q = 1;
            while (q <= 10) {
                System.out.print(q + " ");
                q++;
            };
            System.out.println();
            for (q = 10; q>=1; q--) {
                System.out.print(q + " ");
            }
            System.out.println();
            System.out.println();
        }
        {
            System.out.println("Задача 3");
            int totalPeople = 12000000;
            int growth1000 = 17;
            int mortality1000 = 8;
            int yar = 1;
            while (yar <= 10) {
                totalPeople = (totalPeople / 1000) * (growth1000 - mortality1000) + totalPeople;
                System.out.println("Год " + yar + ", численность населения составляет " + totalPeople + " человек");
                yar++;
            }
        }
        System.out.println();
        {
            System.out.println("Задача 4");
            double deposit = 15000;
            int m = 1;
            while (deposit <= 12_000_000) {
                deposit = deposit * 1.07;
                System.out.println("Месяц " + m + ", сумма накоплений Василия в банке равна " + deposit + " рублей");
                m++;
            }
            System.out.println();
            System.out.println();
        }
        {
            System.out.println("Задача 5");
            double deposit = 15000;
            int m = 1;
            while (deposit <= 12_000_000) {
                deposit = deposit * 1.07;
                if (m % 6 == 0) {
                    System.out.println("Месяц " + m + ", сумма накоплений Василия в банке равна " + deposit + " рублей");
                }
                m++;
            }
            System.out.println();
        }
        {
            System.out.println("Задача 6");
            double deposit = 15000;
            int m = 1;
            while (m  <= (12*9)) {
                deposit = deposit * 1.07;
                if (m % 6 == 0) {
                    System.out.println("Месяц " + m + ", сумма накоплений Василия в банке равна " + deposit + " рублей");
                }
                m++;
            }
            System.out.println();
        }
        {
            System.out.println("Задача 7");
        int day = 3;
            while (day <= 31) {
                System.out.println("Сегодня пятница, "+ day +"-е число. Необходимо подготовить отчет");
                day = day +7;
            }
        }
        System.out.println();
        {
            System.out.println("Задача 8");
          int currentYear = 2023;
          int bYear = currentYear - 200;
          int lastYear = currentYear + 100;
            while (bYear <= lastYear) {
                if (bYear % 79 == 0) {
                    System.out.println(bYear);
                }
                bYear++;
            }
        }
    }
}
