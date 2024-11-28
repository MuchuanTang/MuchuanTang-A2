import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Ride.java
 */
public class Ride implements RideInterface {

    private Employee employee;

    // playItem
    private String playItem;

    //riderRequirements
    private String riderRequirements;

    private Queue<Visitor> queue = new LinkedList<>();

    // rideHistory
    private LinkedList<Visitor> rideHistory = new LinkedList<>();

    // maxRider
    private int maxRider;

    // numOfCycles
    private int numOfCycles;

    private Lock lock;


    public Ride() {
        this.lock = new ReentrantLock();
    }

    public Ride(Employee employee, String playItem, String riderRequirements) {
        this.employee = employee;
        this.playItem = playItem;
        this.riderRequirements = riderRequirements;

        this.lock = new ReentrantLock();
    }

    /*
        get set methods
     */
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getPlayItem() {
        return playItem;
    }

    public void setPlayItem(String playItem) {
        this.playItem = playItem;
    }

    public String getRiderRequirements() {
        return riderRequirements;
    }

    public void setRiderRequirements(String riderRequirements) {
        this.riderRequirements = riderRequirements;
    }

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public void setNumOfCycles(int numOfCycles) {
        this.numOfCycles = numOfCycles;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        queue.offer(visitor);
        System.out.println("addVisitorToQueue success. visitor name = " + visitor.getName());
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        queue.remove(visitor);
        System.out.println("removeVisitorFromQueue success. visitor name = " + visitor.getName());
    }

    @Override
    public void printQueue() {
        System.out.println("------------printQueue------------");
        for (Visitor visitor : queue) {
            System.out.println(visitor);
        }
        System.out.println("-------------printQueue-----------");
    }

    @Override
    public void runOneCycle() {
        lock.lock();
        try {
            for (int i = 0; i < maxRider; i++) {
                Visitor visitor = queue.poll();
                if (visitor != null) {
                    addVisitorToHistory(visitor);
                }
            }

            numOfCycles++;
            System.out.println("runOneCycle success. numOfCycles = " + numOfCycles);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {

        rideHistory.add(visitor);
        System.out.println("addVisitorToHistory success. visitor name = " + visitor.getName());
    }

    @Override
    public void checkVisitorFromHistory(Visitor visitor) {

        if (rideHistory.contains(visitor)) {
            System.out.println("checkVisitorFromHistory success. visitor name = " + visitor.getName());
        } else {
            System.out.println("checkVisitorFromHistory fail. visitor name = " + visitor.getName());
        }
    }

    @Override
    public void numberOfVisitors() {

        System.out.println("numberOfVisitors. = " + rideHistory.size());
    }

    @Override
    public void printRideHistory() {

        System.out.println("------------printRideHistory------------");
        Iterator<Visitor> iterator = rideHistory.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("------------printRideHistory------------");
    }

    public void sort() {
        Collections.sort(rideHistory, new SortComparator());
        System.out.println("sort success.");
    }

    public void exportRideHistory() {

        try {
            FileWriter writer = new FileWriter("d:\\test.txt");
            for (Visitor visitor : rideHistory) {
                writer.write(visitor.toCSV() + "\n");
            }
            writer.close();
            System.out.println("exportRideHistory success.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("exportRideHistory fail.");
        }

    }

    public void importRideHistory() {

        try {
            FileReader reader = new FileReader("d:\\test.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                Visitor visitor = new Visitor(split[0],split[1],split[2],Integer.parseInt(split[3]),Boolean.parseBoolean(split[4]));
                rideHistory.add(visitor);
            }
            bufferedReader.close();
            System.out.println("importRideHistory success.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("importRideHistory fail.");
        }
    }

}

