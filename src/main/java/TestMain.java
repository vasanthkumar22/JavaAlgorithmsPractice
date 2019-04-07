import java.util.*;

public class TestMain {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        Queue queue = new LinkedList();
        ArrayList<String> a = new ArrayList<String>();
        a.add("a");
        a.add("b");
        for(Iterator<String> itr = a.iterator(); itr.hasNext(); ){
            System.out.println(itr.next());
        }

        for(Iterator<String> itr = a.listIterator(a.size()); ((ListIterator<String>) itr).hasPrevious(); ){
            System.out.println(((ListIterator<String>) itr).previous());
        }



        a.stream().map(ele->ele+"t").filter(b->b.contains("a")).forEach(System.out::println);
    }

}
