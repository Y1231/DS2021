package java2021.MyRealLinkedList;

public class myLinkedList {
    /**
     * 如何保证代码一致性即正确性
     * head一定指向链表的头
     * last一定指向链表的尾
     * size一定为链表长度
     */

    myLinkedList list=new myLinkedList();
    public Node head;
    public Node last;
    int size;

    public myLinkedList(){
        head=null;
        last=null;
    }

    public boolean add(String e) {
        Node node=new Node(e);

        if(head==null){
            head=node;
            last=node;
        }else{
            node.prev=last;
            last.next=null;
            last=node;
        }
        return true;
    }


    public void add(int index, String e) {
        Node node=new Node(e);


        if(index<0||index>size){
            throw new ArrayIndexOutOfBoundsException("不对劲！");
        }

        if(index==0){
            if(head==null){
                head=node;
                last=node;
            }else{
                node.next=head;
                head.prev=node;
                head=node;
            }
            return;
        }

        if(index==size){
            add(e);
            return;
        }

        Node prev=head;
        for(int i=0;i<index-1;i++){
            prev=prev.next;
        }

        Node next=prev.next;

        node.prev=prev;
        node.next=next;
        prev.next=node;
        next.prev=node;

    }

    public String remove(int index) {
        Node Del=head;
        if(index<0||index>size){
            throw new ArrayIndexOutOfBoundsException("不对劲！");
        }

        if(index==0){
            String e=head.val;
            head=head.next;
            head.prev=null;
            return e;
        }else if(size==1){
            String e=head.val;
            head=null;
            last=null;
            return e;
        }else if(index==size-1){
            String e=head.val;
            last=last.prev;
            last.next=null;
            return e;
        }else{
            String e=head.val;
            for(int i=0;i<index-1;i++){
                Del=Del.next;
            }
            Node prev=Del.prev;
            Node next=Del.next;

            prev.next=next;
            next.prev=prev;

            return e;
        }

    }


    /*public boolean remove(String e) {

    }*/

    public String get(int index) {
        if(index<0||index>size){
            throw new ArrayIndexOutOfBoundsException("不对劲！");
        }

        Node cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.val;

    }

    public String set(int index, String e) {
        if(index<0||index>size){
            throw new ArrayIndexOutOfBoundsException("不对劲！");
        }
        Node cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        String oldE=cur.val;
        cur.val=e;

        return e;
    }

   /* public int indexOf(String e) {

        Node cur=head;


    }
*/

    public int size(){
        int size=0;
        Node cur=head;
        while(cur!=null){
            cur=cur.next;
            size++;
        }
        return size;

    }

}
