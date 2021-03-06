package java2021.ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class Collectiondemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("y");
        list.add("y");
        list.add("d");
        list.add("s");


        /*
        interface Collection<E>{
        boolean add(E e);//在Collection语境下不能说是尾插
        Collection代表的不一定时线性表，没有头/尾概念
        }

List语境下，add一定返回true
Collection语境下，add可以返回false

         */


        Collection<String> collection=list;
        System.out.println(collection);//[y, y, d, s]

        for(String e:collection){
            System.out.println(e);
            //y
            //y
            //d
            //s
        }

        collection.add("ds");
        System.out.println(collection);//[y, y, d, s, ds]

        collection.remove("y");
        collection.isEmpty();
        collection.clear();
        collection.size();
        collection.contains("d");










    }
}
