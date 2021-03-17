package java2021.LinkedList;

import java.util.LinkedList;

public class demo2 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        list.add("y");
        list.add("y");
        list.add("d");
        list.add("s");

        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        list.remove("s");
        System.out.println(list);
        list.get(1);
        list.set(2,"嘿嘿");
        System.out.println(list);
    }
}
