package course_2.course_23;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);
        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);

        bicycle.check();
        System.out.println();
        bicycle2.check();
        System.out.println();
        car.check();
        System.out.println();
        car2.check();
        System.out.println();
        truck.check();
        System.out.println();
        truck2.check();
    }
}
