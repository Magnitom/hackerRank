import java.util.*;

class Students2 {
    private final int id;
    private final String name;
    private final double cgpa;

    public Students2(int id, String name, double cgpa) {
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
}

class Priorities2 implements Comparator<Students2> {

    @Override
    public int compare(Students2 o1, Students2 o2) {
        int result;
        result = Double.compare(o2.getCgpa(), o1.getCgpa());
        if (result != 0) {
            return result;
        }
        result = o1.getName().compareTo(o2.getName());
        if (result != 0) {
            return result;
        }
        result = Integer.compare(o1.getId(), o2.getId());
        return result;
    }
}

public class PriorHack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int numEvents = sc.nextInt();
        sc.nextLine();
        Priorities2 comp = new Priorities2();
        PriorityQueue<Students2> queue = new PriorityQueue<>(numEvents, comp);
        List<String> events = new ArrayList<>();
        for (int i = 0; i < numEvents; i++) {
            events.add(sc.next());
            if (events.get(i).equals("ENTER")) {
                String nameSc = sc.next();
                double cgpaSc = sc.nextDouble();
                int idSc = sc.nextInt();
                sc.nextLine();
                queue.offer(new Students2(idSc, nameSc, cgpaSc));

            } else {
                queue.poll();
            }
        }
        if (queue.size() == 0) {
            System.out.println("EMPTY");
        } else {
            while (queue.size() != 0) {
                System.out.println(queue.poll());
            }
        }
    }
}