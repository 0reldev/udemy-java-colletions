package lpa.dev;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Collection<String> list = new HashSet<>();
        String[] names = {"Anna", "Bob", "Carol", "David", "Edna"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);
//        [Anna, Bob, Carol, David, Edna]

        list.add("Fred");
        list.addAll(Arrays.asList("Georges", "Gary", "Grace"));
        System.out.println(list);
//        [Anna, Bob, Carol, David, Edna, Fred, Georges, Gary, Grace]
        System.out.println("Gary is in the list? " + list.contains("Gary"));
//        Gary is in the list? true

        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list);
//        [Anna, Bob, Carol, David, Edna, Fred]
        System.out.println("Gary is in the list? " +  list.contains("Gary"));
//        Gary is in the list? false

//        list.sort();  // Doesn't exist in the Collection interface.
    }
}