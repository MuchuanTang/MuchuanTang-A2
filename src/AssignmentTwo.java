/**
 * AssignmentTwo.java
 */
public class AssignmentTwo {

    public static void main(String[] args) {

        partThree();

        partFourA();

        partFourB();

        partFive();

        partSix();

        partSeven();
    }

    public static void partThree() {
        System.out.println("============================partThree===============================");
        Ride ride = new Ride(new Employee("kobe", "boy", "6341423", "199323232939123", "manager"),
                "The Flash: Speed Force", "no restrictions");
        // add visitors to queue
        Visitor visitor1 = new Visitor("John", "boy", "123456789", 22, Boolean.FALSE);
        Visitor visitor2 = new Visitor("Jane", "boy", "987654321", 37, Boolean.FALSE);
        Visitor visitor3 = new Visitor("Bob", "boy", "456789123", 16, Boolean.FALSE);
        Visitor visitor4 = new Visitor("Alice", "girl", "321654987", 15, Boolean.TRUE);
        Visitor visitor5 = new Visitor("Tom", "boy", "789123456", 14, Boolean.FALSE);
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        // removeVisitorFromQueue
        ride.removeVisitorFromQueue(visitor4);

        // print queue
        ride.printQueue();

        System.out.println("============================partThree===============================");
        System.out.println();
    }

    public static void partFourA() {
        System.out.println("==============================partFourA=============================");
        Ride ride = new Ride(new Employee("kobe", "boy", "6341423", "199323232939123", "manager"),
                "The Flash: Speed Force", "no restrictions");
        Visitor visitor1 = new Visitor("John", "boy", "123456789", 22, Boolean.FALSE);
        Visitor visitor2 = new Visitor("Jane", "boy", "987654321", 37, Boolean.FALSE);
        Visitor visitor3 = new Visitor("Bob", "boy", "456789123", 16, Boolean.FALSE);
        Visitor visitor4 = new Visitor("Alice", "girl", "321654987", 15, Boolean.TRUE);
        Visitor visitor5 = new Visitor("Tom", "boy", "789123456", 14, Boolean.FALSE);
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        ride.checkVisitorFromHistory(visitor1);

        ride.numberOfVisitors();

        ride.printRideHistory();
        System.out.println("==============================partFourA=============================");
        System.out.println();
    }

    public static void partFourB() {
        System.out.println("============================partFourB===============================");
        Ride ride = new Ride(new Employee("kobe", "boy", "6341423", "199323232939123", "manager"),
                "The Flash: Speed Force", "no restrictions");
        Visitor visitor1 = new Visitor("John", "boy", "123456789", 22, Boolean.FALSE);
        Visitor visitor2 = new Visitor("Jane", "boy", "987654321", 37, Boolean.FALSE);
        Visitor visitor3 = new Visitor("Bob", "boy", "456789123", 16, Boolean.FALSE);
        Visitor visitor4 = new Visitor("Alice", "girl", "321654987", 15, Boolean.TRUE);
        Visitor visitor5 = new Visitor("Tom", "boy", "789123456", 14, Boolean.FALSE);
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        ride.printRideHistory();

        ride.sort();

        ride.printRideHistory();

        System.out.println("============================partFourB===============================");
        System.out.println();
    }

    public static void partFive() {
        System.out.println("==========================partFive=================================");
        Ride ride = new Ride(new Employee("kobe", "boy", "6341423", "199323232939123", "manager"),
                "The Flash: Speed Force", "no restrictions");
        ride.setMaxRider(5);

        Visitor visitor1 = new Visitor("John", "boy", "123456789", 22, Boolean.FALSE);
        Visitor visitor2 = new Visitor("Jane", "boy", "987654321", 37, Boolean.FALSE);
        Visitor visitor3 = new Visitor("Bob", "boy", "456789123", 16, Boolean.FALSE);
        Visitor visitor4 = new Visitor("Alice", "girl", "321654987", 15, Boolean.TRUE);
        Visitor visitor5 = new Visitor("Tom", "boy", "789123456", 14, Boolean.FALSE);
        Visitor visitor6 = new Visitor("jack", "boy", "7891273456", 14, Boolean.FALSE);
        Visitor visitor7 = new Visitor("alla", "girl", "289123456", 32, Boolean.FALSE);
        Visitor visitor8 = new Visitor("james", "boy", "78941234456", 12, Boolean.FALSE);
        Visitor visitor9 = new Visitor("Dken", "boy", "74891263456", 45, Boolean.FALSE);
        Visitor visitor10 = new Visitor("Erli", "girl", "689123456", 18, Boolean.FALSE);
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);
        ride.addVisitorToQueue(visitor6);
        ride.addVisitorToQueue(visitor7);
        ride.addVisitorToQueue(visitor8);
        ride.addVisitorToQueue(visitor9);
        ride.addVisitorToQueue(visitor10);

        ride.printQueue();

        ride.runOneCycle();

        ride.printQueue();

        ride.printRideHistory();
        System.out.println("==========================partFive=================================");
        System.out.println();
    }

    public static void partSix() {
        System.out.println("==============================partSix=============================");
        Ride ride = new Ride(new Employee("kobe", "boy", "6341423", "199323232939123", "manager"),
                "The Flash: Speed Force", "no restrictions");
        Visitor visitor1 = new Visitor("John", "boy", "123456789", 22, Boolean.FALSE);
        Visitor visitor2 = new Visitor("Jane", "boy", "987654321", 37, Boolean.FALSE);
        Visitor visitor3 = new Visitor("Bob", "boy", "456789123", 16, Boolean.FALSE);
        Visitor visitor4 = new Visitor("Alice", "girl", "321654987", 15, Boolean.TRUE);
        Visitor visitor5 = new Visitor("Tom", "boy", "789123456", 14, Boolean.FALSE);
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        ride.exportRideHistory();
        System.out.println("==============================partSix=============================");
        System.out.println();
    }

    public static void partSeven() {
        System.out.println("==============================partSeven=============================");
        Ride ride = new Ride(new Employee("kobe", "boy", "6341423", "199323232939123", "manager"),
                "The Flash: Speed Force", "no restrictions");

        ride.importRideHistory();

        ride.numberOfVisitors();

        ride.printRideHistory();
        System.out.println("==============================partSeven=============================");
    }
}
