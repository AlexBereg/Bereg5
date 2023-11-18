package coursework1;
public class Main {
    private static Employee[] employee = new Employee[10];
    public static double summaSalary() {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        return sum;
    }
    public static Employee minSalary() {
        Employee minSalary = employee[0];
        for (int i = 1; i < employee.length; i++) {
            if (minSalary.getSalary() > employee[i].getSalary()) {
                minSalary = employee[i];
            }
        }
        return minSalary;
    }

    public static Employee maxSalary() {
        Employee maxSalary = employee[0];
        for (int i = 1; i < employee.length; i++) {
            if (maxSalary.getSalary() < employee[i].getSalary()) {
                maxSalary = employee[i];
            }
        }
        return maxSalary;
    }
    ////// Повышенная сложность методы//////
    //#1
    public static Employee[] indexingSalary (float index) {
        for (int i = 0; i < employee.length; i++) {
            double currentSal = employee[i].getSalary();
            double newSal = currentSal * (1 + (index / 100));
            employee[i].setSalary(newSal);
        }
        return employee;
    }
    //#2-1
    public static Employee minSalaryDepartment (int departmentNumber) {
        Employee minSalDep = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == departmentNumber) {
                if (minSalDep == null || employee[i].getSalary() < minSalDep.getSalary())
                minSalDep = employee[i];
            }
        }
        return minSalDep;
    }
    //#2-2
    public static Employee maxSalaryDepartment (int departmentNumber) {
        Employee maxSalDep = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == departmentNumber) {
                if (maxSalDep == null ||employee[i].getSalary() > maxSalDep.getSalary())
                maxSalDep = employee[i];
            }
        }
        return maxSalDep;
    }
    //#2-3
    public static double summaSalaryDepartment (int departmentNumber) {
        double summaSalaryDepartment =0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getDepartment() == departmentNumber) {
                summaSalaryDepartment = summaSalaryDepartment + employee[i].getSalary();
            }
        }
        return summaSalaryDepartment;
    }
    //#2-4
    public static double averageSalaryDepartment (int departmentNumber) {
        double averageSalaryDepartment;
        int n = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getDepartment() == departmentNumber) {
                n = n + 1;
            }
        }
        return summaSalaryDepartment(departmentNumber) / n;
    }
    //#2-5
    public static Employee[] indexingSalaryDepartment (int departmentNumber, int index) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == departmentNumber) {
                double newSal = employee[i].getSalary() * (1 + (index / 100));
                employee[i].setSalary(newSal);
            }
        }
        return employee;
    }
    //#2-6
    public static void printEmployeeDepartment (int departmentNumber) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == departmentNumber) {
                System.out.println("*id= " +employee[i].getId() + " *" + employee[i].getName() +  " *Зарплата " + employee[i].getSalary());
            }
        }
    }

    //#3-1
    public static void printEmployeeSalaryLess (double salary) {
        System.out.println("Список сотрудников, у которых зарпалата меньше " + salary + " тугриков:");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < salary) {
                System.out.println("*id= " +employee[i].getId() + " *" + employee[i].getName() +  " *Зарплата " + employee[i].getSalary());
            }
        }
    }
    public static void printEmployeeSalaryMore (double salary) {
        System.out.println("Список сотрудников, у которых зарплата больше или равна " + salary + " тугриков:");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() >= salary) {
                System.out.println("*id= " +employee[i].getId() + " *" + employee[i].getName() +  " *Зарплата " + employee[i].getSalary());
            }
        }
    }

    ////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println("Привет, Курсовик! :)");
//////////////////////
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
        System.out.println("Сумма затрат на зарплаты в месяц : " + summaSalary());
        System.out.println();
        System.out.println("Cотрудник с минимальной зарплатой : " + minSalary());
        System.out.println();
        System.out.println("Cотрудник с максимальной зарплатой : " + maxSalary());
        System.out.println();
        System.out.println("Cреднее значение зарплат : " + summaSalary()/ employee.length);

        ////// Повышенная сложность //////

        System.out.println();
        System.out.println("Курсовая 1 / Повышенная сложность");
        System.out.println();
        // Задача 1
        float indexSal = 10;
        indexingSalary(indexSal);
        System.out.println("Проиндексировали зарплату на " + indexSal + " процентов:");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
        System.out.println();

        // Задача 2-а
        int departmentNumber = 2;
        System.out.println("Сотрудник с минимальной зарплатой отдела № " + departmentNumber + " " + minSalaryDepartment(departmentNumber));
        System.out.println();

        // Задача 2-в
        System.out.println("Сотрудник с максимальной зарплатой отдела № " + departmentNumber + " " + maxSalaryDepartment(departmentNumber));
        System.out.println();

        // Задача 2-с
        System.out.println("Сумма затрат на зарплату по отделу № " + departmentNumber + " составляет ИТОГО " + summaSalaryDepartment(departmentNumber));
        System.out.println();

        // Задача 2-d
        System.out.println("Средняя зарплата по отделу № " + departmentNumber + " составляет " + averageSalaryDepartment(departmentNumber) + " тугриков");
        System.out.println();

        // Задача 2-e
        int indexSalDep = 5;
        indexingSalaryDepartment(departmentNumber, indexSalDep);

        // Задача 2-f
        System.out.println("Список сотрудников отдела № " + departmentNumber + " после индексации ЗП на " + indexSalDep + " процентов");
        printEmployeeDepartment (departmentNumber);
        System.out.println();

        // Задача 3-1
        float salary = 90000;
        printEmployeeSalaryLess(salary);
        System.out.println();

        // Задача 3-2
        printEmployeeSalaryMore(salary);
    }
    }
