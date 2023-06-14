import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> prio=new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        prio.add("a");
        prio.add("e");
        prio.add("c");
        prio.add("d");
        prio.add("b");
        Iterator<String> itr=prio.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
