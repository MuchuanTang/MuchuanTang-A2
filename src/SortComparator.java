import java.util.Comparator;

public class SortComparator implements Comparator<Visitor> {


    @Override
    public int compare(Visitor o1, Visitor o2) {
        if (o1.getHeight() > o2.getHeight()) {
            return 1;
        } else if (o1.getHeight() < o2.getHeight()) {
            return -1;
        } else {
            if (o1.getSex().equals("boy")) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
