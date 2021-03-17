package java2021.LinkedList;

//双向链表
public class MyLinkedList implements MyList {

    public MyListNode head;
    public MyListNode last;

    public MyLinkedList() {
        head = null;
        last = null;
    }
    @Override
    public boolean add(String e) {
// 1. 把 e 装入结点中
        MyListNode node = new MyListNode(e);

        if(head == null) {
            head = node;
            last = node;
        } else {
            node.prev = last;
            last.next = node;
            last = node;
        }
        return true;
    }

    @Override
    public void add(int index, String e) {
    /*    MyListNode node=new MyListNode(e);

        MyListNode prev=head;

        if (index == 0) {
            if(head!=null) {
                node.next = head;
                head.prev = node;
                head = node;
            }else{
                head=node;
                last=node;
            }
            return;
        }

        if(index==size()){
            add(e);
            return;

        }

        for(int i=0;i<index-1;i++){
            prev=prev.next;
        }

        MyListNode next=prev.next;

        node.prev=prev;
        node.next=next;
        prev.next=node;
        next.prev=node;
*/
        MyListNode node=new MyListNode(e);


        MyListNode prev=head;

        if(index==0){
            if(head!=null){
                node.next=head;
                head.prev=node;
                head=node;
            }else{
                head=node;
                last=node;
            }
            return;
        }

        if(index==size()){
            add(e);
            return;

        }

        for(int i=0;i<index-1;i++){
            prev=prev.next;

        }
        MyListNode next=prev.next;

        node.prev=prev;
        node.next=next;
        prev.next=node;
        next.prev=node;

    }

    @Override
    public String remove(int index) {
        MyListNode toDe=head;


        if(index<0||index>=size()){
            throw new ArrayIndexOutOfBoundsException("下标异常");
        }

        if(size()==1){
            String e=head.val;
            head=null;
            last=null;
            return e;
        }else if(index==0){
            String e=head.val;
            head=head.next;
            head.prev=null;
            return e;
        }else if(index==size()-1){
            String e=last.val;
            last=last.prev;
            last.next=null;
            return e;
        }else{
            for(int i=0;i<index-1;i++){
                toDe=toDe.next;
            }
            MyListNode prev=toDe.prev;
            MyListNode next=toDe.next;

            String e=toDe.val;

            next.prev=prev;
            prev.next=next;

            return e;

        }

    }

    @Override
    public boolean remove(String e) {

        return false;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public String set(int index, String e) {
        return null;
    }

    @Override
    public boolean contains(String e) {
        return false;
    }

    @Override
    public int indexOf(String e) {
        return 0;
    }

    @Override
    public int lastIndexOf(String e) {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        int count=0;
        MyListNode cur=head;
        while(cur!=null) {
            cur=cur.next;
            count++;
        }


        return count;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");

        MyListNode cur = head;
        while (cur != null) {

            sb.append(cur.val);
            sb.append(",");
            cur = cur.next;
        }
        sb.append("]");

        return sb.toString();
    }
}
