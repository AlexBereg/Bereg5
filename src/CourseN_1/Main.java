package CourseN_1;
public class Main {
    public static float summaAr(Employee[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getSalary();
        }
        return sum;
    }
    public static Employee minSalAr(Employee[] arr) {
        Employee minSal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minSal.getSalary() > arr[i].getSalary()) {
                minSal = arr[i];
            }
        }
        return minSal;
    }

    public static Employee maxSalAr(Employee[] arr) {
        Employee maxSal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxSal.getSalary() < arr[i].getSalary()) {
                maxSal = arr[i];
            }
        }
        return maxSal;
    }
    ////// Повышенная сложность методы//////
    //#1
    public static Employee[] indexingSalar (Employee[] arr,float index) {
        for (int i = 0; i < arr.length; i++) {
            float currentSal = arr[i].getSalary();
            float newSal = currentSal * (1 + (index / 100));
            arr[i].setSalary(newSal);
        }
        return arr;
    }
    //#2-1
    public static Employee minSalArDep (Employee[] arr, int departmentNumber) {
        Employee minSalDep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getDepartment() == departmentNumber) {
                minSalDep = arr[i];
                break;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getDepartment() == departmentNumber && arr[i].getSalary() < minSalDep.getSalary()) {
                minSalDep = arr[i];
            }
        }
        return minSalDep;
    }
    //#2-2
    public static Employee maxSalArDep (Employee[] arr, int departmentNumber) {
        Employee maxSalDep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getDepartment() == departmentNumber) {
                maxSalDep = arr[i];
                break;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getDepartment() == departmentNumber && arr[i].getSalary() > maxSalDep.getSalary()) {
                maxSalDep = arr[i];
            }
        }
        return maxSalDep;
    }
    //#2-3
    public static float sumSalDep (Employee[] arr, int departmentNumber) {
        float sumSalDep =0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getDepartment() == departmentNumber) {
                sumSalDep = sumSalDep + arr[i].getSalary();
            }
        }
        return sumSalDep;
    }
    //#2-4
    public static float averageSalDep (Employee[] arr, int departmentNumber) {
        float avSalDep;
        int n = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getDepartment() == departmentNumber) {
                n = n + 1;
            }
        }
        return sumSalDep(arr,departmentNumber) / n;
    }
    //#2-5
    public static Employee[] indexingSalarDep (Employee[] arr, int departmentNumber, float index) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartment() == departmentNumber) {
                float newSal = arr[i].getSalary() * (1 + (index / 100));
                arr[i].setSalary(newSal);
            }
        }
        return arr;
    }
    //#2-6
    public static void printEmpDep (Employee[] arr, int departmentNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartment() == departmentNumber) {
                System.out.println("*id= " +arr[i].getId() + " *" + arr[i].getName() +  " *Зарплата " + arr[i].getSalary());
            }
        }
    }

    //#3-1
    public static void printEmpSalLess (Employee[] arr, float salary) {
        System.out.println("Список сотрудников, у которых зарпалата меньше " + salary + " тугриков:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() < salary) {
                System.out.println("*id= " +arr[i].getId() + " *" + arr[i].getName() +  " *Зарплата " + arr[i].getSalary());
            }
        }
    }
    public static void printEmpSalMore (Employee[] arr, float salary) {
        System.out.println("Список сотрудников, у которых зарплата больше или равна " + salary + " тугриков:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() >= salary) {
                System.out.println("*id= " +arr[i].getId() + " *" + arr[i].getName() +  " *Зарплата " + arr[i].getSalary());
            }
        }
    }

    ////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println("Привет, Курсовик! :)");
//////////////////////
        Employee[] employee = new Employee[10];
        Employee emp1 = new Employee("Иванов Иван Иванович", 150000, 1);
        Employee emp2 = new Employee("Иванова Марина Ивановна", 140000, 1);
        Employee emp3 = new Employee("Петров Петр Петрович", 90000, 2);
        Employee emp4 = new Employee("Сидоров Александр Иванович", 85000, 2);
        Employee emp5 = new Employee("Сиразов Азат Тильгитович", 83000, 2);
        Employee emp6 = new Employee("Николаенко Иван Владимирович", 75000, 3);
        Employee emp7 = new Employee("Боженов Иван Федорович", 80000, 4);
        Employee emp8 = new Employee("Груняхина Наталья Владимировна", 79500, 4);
        Employee emp9 = new Employee("Александров Александр Александрович", 80000, 5);
        Employee emp10 = new Employee("Сорвировска Лина Юрьевна", 95000, 3);

        employee[0] = emp1;
        employee[1] = emp2;
        employee[2] = emp3;
        employee[3] = emp4;
        employee[4] = emp5;
        employee[5] = emp6;
        employee[6] = emp7;
        employee[7] = emp8;
        employee[8] = emp9;
        employee[9] = emp10;

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
        ////
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц : " + summaAr(employee));
        System.out.println();
        System.out.println("Cотрудник с минимальной зарплатой : " + minSalAr(employee));
        System.out.println();
        System.out.println("Cотрудник с максимальной зарплатой : " + maxSalAr(employee));
        System.out.println();
        System.out.println("Cреднее значение зарплат : " + summaAr(employee) / employee.length);

        ////// Повышенная сложность //////

        System.out.println();
        System.out.println("Курсовая 1 / Повышенная сложность");
        System.out.println();
        // Задача 1
        float indexSal = 10;
        indexingSalar(employee, indexSal);
        System.out.println("Проиндексировали зарплату на " + indexSal + " процентов:");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
        System.out.println();

        // Задача 2-а
        int departmentNumber = 2;
        System.out.println("Сотрудник с минимальной зарплатой отдела № " + departmentNumber + " " + minSalArDep(employee, departmentNumber));
        System.out.println();

        // Задача 2-в
        System.out.println("Сотрудник с максимальной зарплатой отдела № " + departmentNumber + " " + maxSalArDep(employee, departmentNumber));
        System.out.println();

        // Задача 2-с
        System.out.println("Сумма затрат на зарплату по отделу № " + departmentNumber + " составляет ИТОГО " + sumSalDep(employee, departmentNumber));
        System.out.println();

        // Задача 2-d
        System.out.println("Средняя зарплата по отделу № " + departmentNumber + " составляет " + averageSalDep(employee, departmentNumber) + " тугриков");
        System.out.println();

        // Задача 2-e
        float indexSalDep = 5;
        indexingSalarDep(employee, departmentNumber, indexSalDep);

        // Задача 2-f
        System.out.println("Список сотрудников отдела № " + departmentNumber + " после индексации ЗП на " + indexSalDep + " процентов");
        printEmpDep (employee, departmentNumber);
        System.out.println();

        // Задача 3-1
        float salary = 90000;
        printEmpSalLess(employee, salary);
        System.out.println();

        // Задача 3-2
        printEmpSalMore(employee, salary);
    }
    }
