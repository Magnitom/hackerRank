import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */

class Students3 implements Comparable {
    private final int id;
    private final String name;
    private final double cgpa;

    public Students3(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(Object o) {
        Students3 st = (Students3) o;
        int result;
        result = Double.compare(st.getCgpa(), this.getCgpa());
        if (result != 0) {
            return result;
        }
        result = this.getName().compareTo(st.getName());
        if (result != 0) {
            return result;
        }
        result = Integer.compare(this.getId(), st.getId());
        return result;
    }
}

class Priorities3 {

    public List<Students3> getStudents(List<String> ev) {
        PriorityQueue<Students3> prQue = new PriorityQueue<Students3>();
        List<Students3> outStud = new ArrayList<>();
        String[] arrEvents;
        for (String i :
                ev) {
            arrEvents = i.split("\\s");
            if (arrEvents.length != 1) {
                int idSt3 = Integer.parseInt(arrEvents[3]);
                double cgpaSt3 = Double.parseDouble(arrEvents[2]);
                prQue.add(new Students3(idSt3, arrEvents[1], cgpaSt3));
            } else prQue.poll();
        }
        while (prQue.size() != 0) {
            outStud.add(prQue.poll());
        }
        return outStud;
    }
}


public class PriorHack3 {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities3 priorities = new Priorities3();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Students3> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Students3 st : students) {
                System.out.println(st.getName());
            }
        }
    }
}