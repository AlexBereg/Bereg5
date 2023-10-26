public class HW_8 {
    public static void main(String[] args) {
        task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
//            arr[i] = random.nextInt(50_000) + 10_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr1 = generateRandomArray();
        System.out.println("Задача 1");

        int summa = 0;
        for (int d : arr1) {
            summa += d;
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");

        System.out.println();
        System.out.println("Задача 2");
        int sumMin = arr1[0];
        int sumMax = arr1[0];
        for (int element : arr1) {
            if (element < sumMin) {
                sumMin = element;
            }
            if (element > sumMax) {
                sumMax = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + sumMin + " рублей. Максимальная сумма трат за день составила " + sumMax + " рублей");
        System.out.println();
        System.out.println("Задача 3");

        double averVal = summa / 30.00;
        System.out.println("Средняя сумма трат за месяц составила " + averVal + " рублей");

        System.out.println();
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
