package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("world");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
