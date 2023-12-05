package course_2.course_22;

public class Hw_22 {
    public static class Student1 extends Faculty1 {
        final String name;

        public Student1(int property1Force, int property2Force, int property1Force_1, int property2Force_1, int property3Force_1, String name) {
            super(property1Force, property2Force, property1Force_1, property2Force_1, property3Force_1);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Студент ='" + name + '\'' + " Факультет - " + this.getName1()
                    + "/ " + this.getProperty1() + " = " + this.getProperty1Force()
                    + "/ " + this.getProperty2() + " = " + this.getProperty2Force()
                    + "/ " + this.getProperty1_1() + " = " + this.getProperty1Force_1()
                    + "/ " + this.getProperty2_1() + " = " + this.getProperty2Force_1()
                    + "/ " + this.getProperty3_1() + " = " + this.getProperty3Force_1();
        }
    }

    public static class Student2 extends Faculty2 {
        final String name;

        public Student2(int property1Force, int property2Force, int property1Force_2, int property2Force_2, int property3Force_2, String name) {
            super(property1Force, property2Force, property1Force_2, property2Force_2, property3Force_2);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Студент ='" + name + '\'' + " Факультет - " + this.getName()
                    + "/ " + this.getProperty1() + " = " + this.getProperty1Force()
                    + "/ " + this.getProperty2() + " = " + this.getProperty2Force()
                    + "/ " + this.getProperty1_2() + " = " + this.getProperty1Force_2()
                    + "/ " + this.getProperty2_2() + " = " + this.getProperty2Force_2()
                    + "/ " + this.getProperty3_2() + " = " + this.getProperty3Force_2();
        }
    }

    public static class Student3 extends Faculty3 {
        final String name;

        public Student3(int property1Force, int property2Force, int property1Force_3, int property2Force_3, int property3Force_3, int property4Force_3, String name) {
            super(property1Force, property2Force, property1Force_3, property2Force_3, property3Force_3, property4Force_3);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Студент ='" + name + '\'' + " Факультет - " + this.getName()
                    + "/ " + this.getProperty1() + " = " + this.getProperty1Force()
                    + "/ " + this.getProperty2() + " = " + this.getProperty2Force()
                    + "/ " + this.getProperty1_3() + " = " + this.getProperty1Force_3()
                    + "/ " + this.getProperty2_3() + " = " + this.getProperty2Force_3()
                    + "/ " + this.getProperty3_3() + " = " + this.getProperty3Force_3()
                    + "/ " + this.getProperty4_3() + " = " + this.getProperty4Force_3();
        }
    }

    public static class Student4 extends Faculty4 {
        final String name;

        public String getName() {
            return name;
        }

        public Student4(int property1Force, int property2Force, int property1Force_4, int property2Force_4, int property3Force_4, int property4Force_4, int property5Force_4, String name) {
            super(property1Force, property2Force, property1Force_4, property2Force_4, property3Force_4, property4Force_4, property5Force_4);
            this.name = name;
        }

        @Override
        public String toString() {
            return "Студент ='" + name + '\'' + " Факультет - " + this.getName()
                    + "/ " + this.getProperty1() + " = " + this.getProperty1Force()
                    + "/ " + this.getProperty2() + " = " + this.getProperty2Force()
                    + "/ " + this.getProperty1_4() + " = " + this.getProperty1Force_4()
                    + "/ " + this.getProperty2_4() + " = " + this.getProperty2Force_4()
                    + "/ " + this.getProperty3_4() + " = " + this.getProperty3Force_4()
                    + "/ " + this.getProperty4_4() + " = " + this.getProperty4Force_4()
                    + "/ " + this.getProperty5_4() + " = " + this.getProperty5Force_4();
        }
    }

    public static void CompareFaculty1(Student1 st1, Student1 st2) {
        int sumPoperties1 = st1.getProperty1Force_1() + st1.getProperty2Force_1() + st1.getProperty3Force_1();
        int sumPoperties2 = st2.getProperty1Force_1() + st2.getProperty2Force_1() + st2.getProperty3Force_1();
        String best;
        String worst;
        if (sumPoperties1 > sumPoperties2) {
            best = st1.getName();
            worst = st2.getName();
        } else {
            best = st2.getName();
            worst = st1.getName();
        }
        System.out.println(best + " лучший Гриффиндорец, чем " + worst);
    }

    public static void CompareFaculty2(Student2 st1, Student2 st2) {
        int sumPoperties1 = st1.getProperty1Force_2() + st1.getProperty2Force_2() + st1.getProperty3Force_2();
        int sumPoperties2 = st2.getProperty1Force_2() + st2.getProperty2Force_2() + st2.getProperty3Force_2();
        String best;
        String worst;
        if (sumPoperties1 > sumPoperties2) {
            best = st1.getName();
            worst = st2.getName();
        } else {
            best = st2.getName();
            worst = st1.getName();
        }
        System.out.println(best + " лучший Пуффендуец :), чем " + worst);
    }

    public static void CompareFaculty3(Student3 st1, Student3 st2) {
        int sumPoperties1 = st1.getProperty1Force_3() + st1.getProperty2Force_3() + st1.getProperty3Force_3() + st1.getProperty4Force_3();
        int sumPoperties2 = st2.getProperty1Force_3() + st2.getProperty2Force_3() + st2.getProperty3Force_3() + st2.getProperty4Force_3();
        String best;
        String worst;
        if (sumPoperties1 > sumPoperties2) {
            best = st1.getName();
            worst = st2.getName();
        } else {
            best = st2.getName();
            worst = st1.getName();
        }
        System.out.println(best + " лучший Когтевранец, чем " + worst);
    }

    public static void CompareFaculty4(Student4 st1, Student4 st2) {
        int sumPoperties1 = st1.getProperty1Force_4() + st1.getProperty2Force_4() + st1.getProperty3Force_4() + st1.getProperty4Force_4() + st1.getProperty5Force_4();
        int sumPoperties2 = st2.getProperty1Force_4() + st2.getProperty2Force_4() + st2.getProperty3Force_4() + st2.getProperty4Force_4() + st2.getProperty5Force_4();
        String best;
        String worst;
        if (sumPoperties1 > sumPoperties2) {
            best = st1.getName();
            worst = st2.getName();
        } else {
            best = st2.getName();
            worst = st1.getName();
        }
        System.out.println(best + " лучший Слизеринин , чем " + worst);
    }

    public static void CompareSudent(Hogwarts[] stud, String[] studName) {
        int i = 0;
        int difference = (stud[0].getProperty1Force() + stud[0].getProperty2Force()) - (stud[1].getProperty1Force() + stud[1].getProperty2Force());
        if (difference == 0) {

            System.out.println("Мощности обоих сущностей," + studName[0] + " и " + studName[1] + " равны");
            return;
        } else if (difference < 0) {
            i = 1;
        }
        System.out.println(studName[i] + " обладает бОльшей мощностью магии, чем " + studName[Math.abs(1 - i)]);
    }


    public static void main(String[] args) {
        System.out.println("Домашка 22");
        System.out.println("****************************** ");
        Student1 student1 = new Student1(5, 4, 3, 5, 4, "Гарри Поттер");
        Student1 student2 = new Student1(4, 3, 5, 4, 5, "Гермиона Грейнджер");
        Student1 student3 = new Student1(3, 5, 4, 3, 6, "Рон Уизли");
        Student2 student4 = new Student2(4, 5, 4, 3, 4, "Драко Малфой");
        Student2 student5 = new Student2(5, 3, 5, 2, 1, "Грэхэм Монтегю");
        Student2 student6 = new Student2(4, 5, 4, 3, 6, "Грегори Гойл");
        Student3 student7 = new Student3(5, 3, 2, 5, 8, 3, "Захария Смит");
        Student3 student8 = new Student3(3, 6, 3, 5, 7, 5, "Седрик Диггори");
        Student3 student9 = new Student3(4, 5, 5, 4, 2, 4, "Джастин Финч-Флетчли");
        Student4 student10 = new Student4(5, 4, 5, 4, 3, 5, 7, "Чжоу Чанг");
        Student4 student11 = new Student4(4, 5, 3, 7, 5, 2, 4, "Падма Патил");
        Student4 student12 = new Student4(3, 6, 5, 4, 4, 4, 5, "Маркус Белби");

        student1.setProperty1Force(4);
        student10.setProperty2Force(3);

//        Сделайте метод, который выводит на экран описание студента. В описание надо включать качества, которые присущи всем студентам,
//                плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student10);
        System.out.println("****************************** ");

//        Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух учеников одного факультета по свойствам.

        CompareFaculty1(student1, student2);
        CompareFaculty2(student5, student6);
        CompareFaculty3(student7, student9);
        CompareFaculty4(student10, student11);

        System.out.println("****************************** ");

//        Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии

        var st1 = student1;
        var st2 = student10;

        Hogwarts[] students = new Hogwarts[]{st1, st2};
        String[] studName = new String[]{st1.getName(), st2.getName()};
        CompareSudent(students, studName);
    }
}