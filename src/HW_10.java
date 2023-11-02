import java.time.LocalDate;

public class HW_10 {

    public static void printLeapYear(int year) {
        if ((year >= 1584 && year % 4 == 0 && year % 100 != 0) || (year >= 1584 && year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else if (year >= 1584) {
            System.out.println(year + " год — невисокосный год");
        } else {
            System.out.println("В " + year + " году еще не ведали о високосных годах!!");
        }
    }

    public static void installVersion(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную  версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите  версию приложения для Android по ссылке");
        }
    }

    public static int calculateDays(int deliveryDistance) {
        int time = -1;
        if (deliveryDistance < 20) {
            time = 1;
        } else if (deliveryDistance < 60) {
            time = 2;
        } else if (deliveryDistance < 100) {
            time = 3;
        }
        return time;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задача 1");
        int y = 1000;
        printLeapYear(y);

        System.out.println();
        System.out.println("Задача 2");
        int cd = 2000;
        int co = 1;
        installVersion(cd, co);

        System.out.println();
        System.out.println("Задача 3");
        int dD = 99;
        if (dD <= 100) {
            System.out.println("Если до клиента " + dD + " км" + " то для доставки карты потребуется " + calculateDays(dD) + " дн.");
        } else {
            System.out.println("Вам придется забрать самим(. Доставки свыше 100 км нет");
        }
    }
}
