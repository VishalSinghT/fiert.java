import java.util.*;
public class LL {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<String>();
        list.add("is");
        list.add("a");
        list.add("linked");
        list.addFirst("This");
        list.addLast("List");
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(4);
        System.out.println(list);
    }
}
