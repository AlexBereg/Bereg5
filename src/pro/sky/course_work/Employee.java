package pro.sky.course_work;
    public class Employee {
        private String name;
        private double salary;
        private int department;

        private int id;
        private static int counter;

        public Employee(String name, int salary, int department) {
            counter++;
            this.name = name;
            this.salary = salary;
            this.department = department;
            this.id = counter;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public int getDepartment() {
            return department;
        }

        public int getId() {
            return id;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void setDepartment(int department) {
            this.department = department;
        }

        @Override
        public String toString() {
            return
                    "name='" + name + '\'' +
                            ", salary=" + salary +
                            ", department=" + department +
                            ", id=" + id ;
        }
    }
