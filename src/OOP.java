public class OOP {
        public static void main(String[] args) {

            // Object = An entity that holds data (attributes)
            //                and can perform actions (methods)
            //                It is a reference data type

            car car = new car();

            System.out.println(car.make);
            System.out.println(car.model);
            System.out.println(car.year);
            System.out.println(car.price);
            System.out.println(car.isRunning);

            car.drive();
            car.brake();
        }
    }

