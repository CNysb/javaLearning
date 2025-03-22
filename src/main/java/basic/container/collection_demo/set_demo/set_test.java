package basic.container.collection_demo.set_demo;

import java.util.HashSet;

public class set_test {
    public static void main(String[] args) {
        HashSet<Object> sets = new HashSet<>();
        Person a = Person.builder().age(11).name("a").build();
        Person c = Person.builder().age(11).name("a").build();
        Person b = Person.builder().age(11).name("b").build();
        sets.add(a);
        sets.add(b);
        sets.add(c);

        sets.forEach(System.out::println);

    }
}
