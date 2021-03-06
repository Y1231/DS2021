package java2021.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;


/*
可以被迭代的

interface Iterbale<T>{

Iterator<T> iterator();
//通过iterator方法，返回迭代器（iterator)
}


迭代器
interface Iterator<E>{

boolean
}




 */
public class Iterabledemo {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("y");
        list.add("y");
        list.add("d");
        list.add("s");

        Iterable<String> r1=list;

        //r1 iterable对象,进行iterator方法
//1.
       /* Iterator<String> it=r1.iterator();

        System.out.println(it.hasNext());//true
        String s1=it.next();
        System.out.println(s1);*/


//2.
        Iterator<String> it=r1.iterator();
        while(it.hasNext()){
            System.out.println();
            String s=it.next();
            System.out.println(s);
        }

/*
for(String:r1){
System.out.println(s);
}
 */



    }
}
