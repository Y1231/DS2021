package java2021.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(4);
        set.add(3);
        set.add(6);
        set.add(7);

        TreeSet<Integer> treeSet = (TreeSet<Integer>) set;

        System.out.println(treeSet.first());    // 2
        System.out.println(treeSet.last()); //9









    }
}
