package java2021;
import java.util.Scanner;
import java.util.Collections;
/*
public class DS0302 {


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            while(sc.hasNextInt()){
                int c=sc.nextInt();
                for(;c>0;c--)
                    System.out.print("*");
                System.out.println("");

            }
        }
    }
*/
import java.util.Scanner;

//public class DS0302{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNextInt()){
//            int a=sc.nextInt();
//            for(int i=1;i<=a;i++){
//                System.out.println(String.join("",Collections.nCopies(i,"* ")));
//            }
//        }
//    }
//}

/*
public class DS0302{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int a=sc.nextInt();
            for(int i=1;i<=a;i++){
                System.out.println(String.join("",Collections.nCopies(a-i,"  "))+String.join("",Collections.nCopies(i,"* ")));
            }
        }
    }
}
*/

/*public class DS0302{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int a=sc.nextInt();
            for(int i=0;i<=a;i++){
                System.out.println(String.join("",Collections.nCopies(a-i,"* "))+String.join("",Collections.nCopies(i,"  ")));
            }
        }
    }
}*/


/*
public class DS0302{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();


            for(int i=1;i<=n;i++){
                System.out.println(String.join("",Collections.nCopies(n+1-i," "))+String.join("",Collections.nCopies(i,"* ")));
            }
            for (int i = n+1; i >0; i--) {
                System.out.println(String.join("", Collections.nCopies(n+1-i, " "))+
                        String.join(" ", Collections.nCopies(i, "*"))+" ");
            }
        }
    }
}
*/
/*
public class DS0302{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();

            for (int i = n+1; i >0; i--) {
                System.out.println( String.join("", Collections.nCopies(i, "* "))+String.join("", Collections.nCopies(n+2-i, " ")));
            }
            for(int i=2;i<=n+1;i++){
                System.out.println(String.join("",Collections.nCopies(i,"* "))+String.join("",Collections.nCopies(n+2-i," ")));
            }

        }
    }
}*/


/*
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class DS0302{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<Integer,String> map=new HashMap<>(16);
        map.put(200,"OK");
        map.put(202,"Accepted");
        map.put(400,"Bad Request");
        map.put(403,"Forbidden");
        map.put(404,"Not Found");
        map.put(500,"Internal Server Error");
        map.put(502,"Bad Gateway");
        while(sc.hasNext()){
            int state=sc.nextInt();
            System.out.println(map.get(state));
        }
    }
}

*/

import java.util.Collections;
/*
public class DS0302{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            for(int i=0;i<=a;i++)
                System.out.println(String.join(" ",Collections.nCopies(i,"i")));
        }
    }
}
*/

import java.util.Arrays;
public class DS0302{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = 0;
        while (sc.hasNext()){
            //得到字符数组
            String st=sc.nextLine();
            String[] str=st.split(" ");
            //创建整数组
            int[] score=new int[str.length];
            //放进数组
            for(int i=0;i<str.length;i++) {
                score[i]=Integer.parseInt(str[i]);}
            //先排序，再截取，不用截取，遍历的时候不找他们就行了
            Arrays.sort(score);
            for(int i=1;i<score.length-1;i++) {
                num+=score[i];}
            System.out.printf("%.2f",num/(score.length-2));
        }
    }
}