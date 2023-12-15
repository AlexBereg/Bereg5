package course_2.course_23;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car("car1", 4);
//        Car car2 = new Car("car2", 4);
//        Truck truck = new Truck("truck1", 6);
//        Truck truck2 = new Truck("truck2", 8);
//        Bicycle bicycle = new Bicycle("bicycle1",2);
//        Bicycle bicycle2 = new Bicycle("bicycle2",2);

        Transport car = new Car("car1", 4);
        Transport car2 = new Car("car2", 4);
        Transport truck = new Truck("truck1", 6);
        Transport truck2 = new Truck("truck2", 8);
        Transport bicycle = new Bicycle("bicycle1", 2);
        Transport bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();

        Transport[] transports = {bicycle, bicycle2, car, car2, truck, truck2};
        for (int i = 0; i < transports.length; i++) {
            station.check(transports[i]);
            System.out.println();
        }
    }
}
