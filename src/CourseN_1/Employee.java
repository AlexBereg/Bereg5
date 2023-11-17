package CourseN_1;
    public class Employee {
        private String name;
        private float salary;
        private int department;

        private int id;
        private static int id0;

        public Employee(String name, int salary, int department) {
            id0++;
            this.name = name;
            this.salary = salary;
            this.department = department;
            this.id = id0;
        }

        public String getName() {
            return name;
        }

        public float getSalary() {
            return salary;
        }

        public int getDepartment() {
            return department;
        }

        public int getId() {
            return id;
        }

        public void setSalary(float salary) {
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
