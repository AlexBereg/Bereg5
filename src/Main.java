// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("ДОМАШКА 5");
        System.out.println();

//        Задача 1


        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //    Задача 2
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную  версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите  версию приложения для Android по ссылке");
        }


//    Задача 3
        int year = 2100;
        boolean leapYear = false;
        boolean multiplicity4 = false;
        boolean multiplicity100 = false;
        boolean multiplicity400 = false;
        float remains = year % 4;
        if (remains == 0) {
            multiplicity4 = true;
        }
        remains = year % 100;
        if (remains == 0) {
            multiplicity100 = true;
        }
        remains = year % 400;
        if (remains == 0) {
            multiplicity400 = true;
        }
        if (multiplicity4) {
            if (multiplicity100 && multiplicity400 != true) {
                leapYear = false;
            } else {
                leapYear = true;
            }
        }
        if (year >= 1584) {
            if (leapYear) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год НЕ является високосным");
            }
        } else {
            System.out.println("Високосный год был еще не введен");
        }

//        Задача 4

        int deliveryDistance = 95;
        boolean delivery = true;
        int time = 0;
        String timeText =" дня";
        if (deliveryDistance < 20) {
            time = 1;
            timeText = " день";
        } else if (deliveryDistance < 60) {
            time = 2;
        } else if (deliveryDistance < 100) {
            time = 3;
        } else delivery = false;

        if (delivery) {
            System.out.println("На доставку карты на " + deliveryDistance + " км потребуется " + time + timeText);

        } else {
            System.out.println("Забирайте сами, так далеко не доставляем!!");
        }

//        Задача 5

        int monthNumber = 8;
        String season ="";

        switch (monthNumber) {
            case 1:
                season = "зима";
                break;
            case 2:
                season = "зима";
                break;
            case 3:
                season = "весна";
                break;
            case 4:
                season = "весна";
                break;
            case 5:
                season = "весна";
                break;
            case 6:
                season = "лето";
                break;
            case 7:
                season = "лето";
                break;
            case 8:
                season = "лето";
                break;
            case 9:
                season = "осень";
                break;
            case 10:
                season = "осень";
                break;
            case 11:
                season = "осень";
                break;
            case 12:
                season = "зима";
                break;

            default:
                System.out.println(monthNumber + "-го месяца не существует!!");
        }
        if (season != "") {
            System.out.println(monthNumber + "-й месяц принадлежит к сезону " +season);
        }
    }
}