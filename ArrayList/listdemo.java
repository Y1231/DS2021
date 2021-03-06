package java2021.ArrayList;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listdemo {

    private static class IntegerComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.intValue()-o1.intValue();
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);//【1】
        list.add(6);//【2】
        list.add(2);
        list.add(1);


        //1.
        System.out.println(list);
        list.sort(new IntegerComparator());
        System.out.println(list);



        //2.Collectin代表集合
       /* Collections.sort(list);
        System.out.println(list);
*/


        /*List<String> list1 = new ArrayList<>();
        list1.add("y");//【1】
        list1.add("y");//【2】
        list1.add("d");
        list1.add("s");
        List<String> strings=list1.subList(1,3);//包含【1】，不包含【3】
        System.out.println(strings);*/
    }
}
