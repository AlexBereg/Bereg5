package course_2;

import java.sql.Array;

public class HW_1 {
//    ## Задание 5
//
//    Напишите метод, который изменяет значение переменной типа int. Объявите метод changeValue,
//    который принимает параметр типа int под названием value. Внутри метода с помощью оператора присваивания запишите в параметр значение 22.
//
//    В методе main объявите переменную типа int под названием value и запишите туда значение 33.
//    В следующей строке вызовите метод changeValue и передайте в него эту переменную.
//

    public static void changeValue(int value) {
        value = 22;
    }

    //## Задание 6
    public static void changeValue2(Integer value2) {
        value2 = 33;
    }

    //## Задание 7
    public static void changeValue3(Integer[] value3) {

//    for (int i = 0; i < value3.length; i++) {
//        value3[i] = i + 1;
//    }

        value3 = new Integer[]{1, 2};
    }
    //## Задание 8
    public static void changeValue4(Integer[] value3) {
        value3[0] = 99;
    }

    //## Задание 9

    public static void changePerson(Person person) {
        person = new Person("Ilya", "Lagutenko");
        System.out.println("person = " + person);

    }


    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println("value = " + value);

        Integer value2 = 22;

        changeValue2(value2);
        System.out.println("value2 = " + value2);

        Integer[] value3 = new Integer[]{3, 4};
        changeValue3(value3);
        for (int i = 0; i < value3.length; i++) {
            System.out.print(value3[i] + ", ");
        }
        System.out.println();
        changeValue4(value3);
        for (int i = 0; i < value3.length; i++) {
            System.out.print(value3[i] + ", ");
        }
        System.out.println();
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);

    }

}
