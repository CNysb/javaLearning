package basic.container.collection_demo.list_demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        Collection<String> d1 = new ArrayList<String>();
        Collections.addAll(d1, "aa-male-15", "bb-male-15", "cc-male-15", "dd-male-15");

        Map<String, String> res = d1.stream().collect(Collectors.toMap(
                s -> s.split("-")[0],
                s -> s.split("-")[2]
        ));
        res.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
