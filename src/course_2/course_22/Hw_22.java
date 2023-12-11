package course_2.course_22;

public class Hw_22 {
    public static void main(String[] args) {
        System.out.println("Домашка 22");
        System.out.println("****************************** ");
        Gryffindor student1 = new Gryffindor("Гарри Поттер", 5, 4, 3, 5, 4);
        Gryffindor student2 = new Gryffindor("Гермиона Грейнджер", 4, 3, 5, 4, 5);
        Gryffindor student3 = new Gryffindor("Рон Уизли", 3, 5, 4, 3, 6);
        Slytherin student4 = new Slytherin("Драко Малфой", 4, 5, 4, 3, 4, 6, 4);
        Slytherin student5 = new Slytherin("Грэхэм Монтегю", 5, 3, 5, 2, 1, 5, 4);
        Slytherin student6 = new Slytherin("Грегори Гойл", 4, 5, 4, 3, 6, 7, 3);
        Puffeduy student7 = new Puffeduy("Захария Смит", 5, 3, 2, 5, 8);
        Puffeduy student8 = new Puffeduy("Седрик Диггори", 3, 6, 3, 5, 7);
        Puffeduy student9 = new Puffeduy("Джастин Финч-Флетчли", 4, 5, 5, 4, 2);
        Ravenclaw student10 = new Ravenclaw("Чжоу Чанг", 5, 4, 5, 4, 3, 5);
        Ravenclaw student11 = new Ravenclaw("Падма Патил", 4, 5, 3, 7, 5, 2);
        Ravenclaw student12 = new Ravenclaw("Маркус Белби", 3, 5, 5, 4, 4, 4);

        System.out.println("Поменяем качества учеников:");
        System.out.println("У " + student2.getStudentName() + " " + student2.getTransgressionDistance() + " было " + student2.getForceTransgressionDistance());
        student2.setForceTransgressionDistance(5);
        System.out.println("Стало: " + student2.getForceTransgressionDistance());
        System.out.println("У " + student11.getStudentName() + " " + student11.getCreativity() + " было " + student11.getForceCreativity());
        student11.setForceCreativity(6);
        System.out.println("Стало: " + student11.getForceCreativity());
        System.out.println("****************************** ");
        System.out.println();
//        Сделайте метод, который выводит на экран описание студента. В описание надо включать качества, которые присущи всем студентам,
//                плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student10);
        System.out.println("****************************** ");

//        Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух учеников одного факультета по свойствам.
        Gryffindor.CompareStudentsFaculty(student1, student3);
//        "Метод 2"
        System.out.println("Метод 2");
        student1.Compare(student3);
        Slytherin.CompareStudentsFaculty(student4, student5);
        Puffeduy.CompareStudentsFaculty(student7, student9);
        Ravenclaw.CompareStudentsFaculty(student10, student12);
        System.out.println("****************************** ");
        System.out.println();
//        Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии
        Hogwarts.CompareStudent(student1, student12);
        Hogwarts.CompareStudent(student6, student10);
    }
}
