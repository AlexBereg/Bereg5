public class HW_4 {

    public static void main(String[] args) {

        System.out.printf("Домашка 4");
        System.out.println();


//        Задача 1
        int age = 20;
        System.out.println("Если возраст человека равен " + age + " лет, то:");
        if (age <= 18) {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("он совершеннолетний");
        }
        System.out.println();

//        Задача 2
        int temp = 45;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, " + "нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, " + "можно идти без шапки");
        }
        System.out.println();

//        Задача 3
        int speed = 60;
        System.out.println("Если скорость " + speed + " км/ч, то:");
        if (speed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
        System.out.println();

//        Задача 4

        int age2 = 20;
        System.out.println("Если возраст человека равен " + age2 + " лет,");
        if (age2 >= 4 && age2 <= 6) {
            System.out.println("то ему нужно ходить в детский сад");
        } else {
            if (age2 >= 7 && age2 <= 17) {
                System.out.println("то ему нужно ходить в школу");
            } else {
                if (age2 >= 18 && age2 <= 24) {
                    System.out.println("то его место в университете");
                } else {
                    if (age2 > 24) {
                        System.out.println("то ему пора ходить на работу");
                    }
                }
            }
        }
        System.out.println();

//        Задача 5

        int ageKid = 15;
        System.out.println("Если возраст ребенка равен " + ageKid + " лет,");
        if (ageKid < 5) {
            System.out.println("то ему нельзя кататься на аттракционе");
        } else {
            if (ageKid >= 5 && ageKid < 14) {
                System.out.println("то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                if (ageKid >= 14) {
                    System.out.println("то ему можно кататься на аттракционе без сопровождения взрослого");
                }
            }
        }
        System.out.println();


//        Задача 6

        int pass = 70;

        int allPlace = 102;
        int allStandingPlace = 62;
        System.out.println("Если в вагоне уже набилось " + pass + " пассажиров то :");
        if (pass < 60) {
            System.out.println("осталось " + (60 - pass) + " сидячих и " + allStandingPlace + " стоячих места");
        } else {
            if (pass >= 60 && pass < allPlace) {
                System.out.println("осталось " + (allPlace - pass) + " стоячих мест");
            } else {
                System.out.println("Мест в вагоне нет!! Все забито(");
            }
        }
        System.out.println();
        //Задача 7


        int one = 2;
        int two = 10;
        int three = 25;
        int maxNum = 0;
        if (one > two && one > three) {
            maxNum = one;
        } else {
            if (two > one && two > three) {
                maxNum = two;
            } else {
                maxNum = three;
            }
        }
        System.out.println("Самое бОльшее из трех чисел - " + maxNum);

    }
}
