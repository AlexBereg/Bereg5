import java.util.Arrays;

public class HW_7 {

    public static final String FORMAT = "";

    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] mass1 = new int[3];
        mass1[0] = 1;
        mass1[1] = 2;
        mass1[2] = 3;

        double[] mass2 = {1.57, 7.654, 9.986};

        boolean[] mass3 = {true, true, false};

        System.out.println("Задача 2");

        for (int i = 0; i < mass1.length; i++) {
            System.out.print(mass1[i]);
            if (i < mass1.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.println();
        System.out.println("========================");
        for (int i = 0; i < mass2.length; i++) {
            System.out.print(mass2[i]);
            if (i < mass2.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.println();
        System.out.println("========================");
        for (int i = 0; i < mass3.length; i++) {
            System.out.print(mass3[i]);
            if (i < mass3.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.println();
        System.out.println("========================");

        System.out.println("Задача 3");

        for (int i = mass1.length - 1; i >= 0; i--) {
            System.out.print(mass1[i]);
            if (i > 0) {
                System.out.print(" ,");
            }
        }
        System.out.println();
        System.out.println("========================");
        for (int i = mass2.length - 1; i >= 0; i--) {
            System.out.print(mass2[i]);
            if (i > 0) {
                System.out.print(" ,");
            }
        }
        System.out.println();
        System.out.println("========================");
        for (int i = mass3.length - 1; i >= 0; i--) {
            System.out.print(mass3[i]);
            if (i > 0) {
                System.out.print(" ,");
            }
        }
        System.out.println();
        System.out.println("========================");

        System.out.println("Задача 4");

        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] % 2 > 0) {
                mass1[i] = mass1[i] + 1;
            }
        }
        System.out.println(Arrays.toString(mass1));
    }
}


