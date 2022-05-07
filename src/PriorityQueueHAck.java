import java.util.*;

class Students {
    private final int id;
    private final String name;
    private final double cgpa;

    public Students(int id, String name, double cgpa) {
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

class Priorities implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {

//        System.out.println("///////////////    COMPARATOR    \\\\\\\\\\\\\\\\");
        int result;
        result = Double.compare(o2.getCgpa(), o1.getCgpa());
        if (result != 0) {
            /*if (result > 0) {
//                System.out.println(o2.getName() + " (" + o2.getCgpa() + ") > " + o1.getName() + " (" + o1.getCgpa() + ")");
            } else
//                System.out.println(o2.getName() + " (" + o2.getCgpa() + ") < " + o1.getName() + " (" + o1.getCgpa() + ")");*/
            return result;
        }
        result = o1.getName().compareTo(o2.getName());
        if (result != 0) {
            /*if (result > 0) {
//                System.out.println(o2.getName() + " > " + o1.getName());
            } else
//                System.out.println(o2.getName() + " < " + o1.getName());;*/
            return result;
        }
        result = Integer.compare(o1.getId(), o2.getId());
        /*if (result > 0) {
//            System.out.println(o2.getName() + " ( " + o2.getCgpa() + " / id=" + o2.getId() + " ) > " + o1.getName() + " ( " + o1.getCgpa() + " / id=" + o1.getId() + " )");
        } else
//            System.out.println(o2.getName() + " ( " + o2.getCgpa() + " / id=" + o2.getId() + " ) < " + o1.getName() + " ( " + o1.getCgpa() + " / id=" + o1.getId() + " )");
        */
        return result;
    }
}

public class PriorityQueueHAck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int numEvents = sc.nextInt();
        sc.nextLine();
        Priorities comp = new Priorities();
        PriorityQueue<Students> queue = new PriorityQueue<>(numEvents, comp);
        List<String> events = new ArrayList<>();
        for (int i = 0; i < numEvents; i++) {
            events.add(sc.next());
            if (events.get(i).equals("ENTER")) {
//                System.out.println("Процесс добавления очереди");
                String nameSc = sc.next();
                double cgpaSc = sc.nextDouble();
                int idSc = sc.nextInt();
                sc.nextLine();
//                System.out.println("Добавляем: " + nameSc);
                queue.offer(new Students(idSc, nameSc, cgpaSc));
//                System.out.println("Список: " + queue + "\n");

            } else {
//                System.out.println("Процесс удаления очереди");
                Students poll = queue.poll();
//                System.out.println("Удаляем:  " + poll);
//                System.out.println("Список: " + queue + "\n");
            }
        }
//        Students st = queue.peek();
//        System.out.println(queue);
//        System.out.println();
        if (queue.size() == 0) {
            System.out.println("EMPTY");
        } else {
            while (queue.size() != 0) {
                System.out.println(queue.poll());
            }
        }
    }
}