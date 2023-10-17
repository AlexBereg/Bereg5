public class HW_6_14 {
    public static void main(String[] args) {
//# 1.4 Циклы
//### Повышенная сложность.
        System.out.println("1.4 Циклы // Повышенная сложность");
        System.out.println();
//        Необходимо пройти циклом по числам от 1 до 30 включительно и,
//        если число делится на 3 без остатка, вывести ping, а если число делится на 5 без остатка, вывести pong.
//
//                Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
        System.out.println("Задание 4");

//            Вариант 2
        for (int q = 1; q <= 30; q++) {
            String conclusion = "";
            if (q % 3 == 0) {
                conclusion = " ping";
            }
            if (q % 5 == 0) {
                conclusion = conclusion + " pong";
            }
            System.out.println(q + ": " + conclusion);
        }

        {
            System.out.println();
            System.out.println("Задание 5");
//            Вывести первые 10 чисел последовательности Фибоначчи.
            int a = 0;
            int b = 1;
            System.out.print(a + " " + b);
            for (int i = 3; i <= 10; i++) {
                int c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
        }
    }
}

