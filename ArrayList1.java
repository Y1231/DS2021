package java2021;

import java.util.ArrayList;

//boolean add(e) 相当于尾插，一定会返回true
//void add(index,e) 插入e到index位置，index取值范围为：【0，size】，取size为尾插
/*ArrayList为泛型类
ArrayList<Integer>
ArrayList<String> a=new ArrayList<>();


*/
public class ArrayList1 {
    public static void main(String[] args) {

        //线性表添加数据
        ArrayList<String> list = new ArrayList<>();
        /*
        $1$ add

        list.add("y");
        list.add("y");
        list.add("d");
        list.add("s");
        System.out.println(list);

        //不需要考虑容量，只需要考虑元素个数
        list.add(0,"Y");
        System.out.println(list);
        */

        /*
        $2$ remove

        list.add("y");
        list.add("y");
        list.add("d");
        list.add("s");
        list.remove("y");
        list.remove(1);
        /*boolean remove()
                1.元素在顺序表中，并且只有一个，删除，size-1
                2.元素在顺序表中,有多个，删除第一个
                3.元素不在，返回false


        boolean e=list.remove("s");
        System.out.println(list);
         */



        /*
        $3$

       /* //元素类型 get(int index);
        //元素类型set(int index, 元素类型e);
        list.add("y");
        list.add("y");
        list.add("d");
        list.add("s");
      // String a=list.get(0);
        System.out.println(list.get(0));
        System.out.println(list.set(1,"Y"));
        System.out.println(list);*/



        /*
        $4$


        查找：
        boolean contains() 判断有无，返回true false
        下标 indexOf()  返回首次遇到下标，未找到返回-1
         下标 lastIndexOf() 从后往前

        list.add("y");
        list.add("y");
        list.add("d");
        list.add("s");
        System.out.println(list.contains("y"));
        System.out.println(list.indexOf("d"));
        System.out.println(list.lastIndexOf("s"));
        */


        /*
        $5$

        void clear()   清空顺序表
        元素个数 size()  返回已有元素个数
        boolean isEmpty() 是否为空
                 */
        list.add("y");
        list.add("y");
        list.add("d");
        list.add("s");
        list.clear();
        //System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());


    }
}
