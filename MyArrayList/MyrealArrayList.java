package java2021.MyArrayList;

import java.util.Arrays;

public class  MyrealArrayList implements MyList {

    private Integer[] array;
    private int size;

    public MyrealArrayList(){
        array=new Integer[16];
        size=0;
    }


    @Override
    public boolean add(Integer e) {
        //尾插
        array[size]=e;
        size++;

        return true;
    }

    @Override
    public void add(int index, Integer e) {

        //1.判断下标是否合法
        if(index<0||index>=size){
            throw new ArrayIndexOutOfBoundsException("Index:"+index+"Size:"+size);
        }

        for(int before=size-1;before>=index;before--) {
            int after = before + 1;
            array[after] = array[before];
        }
            array[index]=e;
            size++;
        }



    @Override
    public Integer remove(int index) {
        //1.判断下标是否合法
        if(index<0||index>=size){
            throw new ArrayIndexOutOfBoundsException("Index:"+index+"Size:"+size);
        }
        Integer e = array[index];
        for(int before=index+1;before<size;before++){
            int after=before-1;
            array[after]=array[before];
        }
        array[size - 1] = null;
        size--;

        return e;

    }

    @Override
    public boolean remove(Integer e) {
        int i = indexOf(e);
        if (i < 0) {
            return false;
        }

        remove(i);
        return true;
    }

    @Override
    public Integer get(int index) {
        // 1. 先考虑 index 是否合法
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    @Override
    public Integer set(int index, Integer e) {
        // 1. 先考虑 index 是否合法
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Integer olde = array[index];
        array[index] = e;
        return olde;
    }

    @Override
    public boolean contains(Integer e) {

            return indexOf(e) >= 0;
    }

    @Override
    public int indexOf(Integer e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(array[i])) {   // 使用的是 equals 进行比较
                return i;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Integer e) {
        for (int i = size - 1; i >= 0; i--) {
            if (e.equals(array[i])) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public void clear() {

        Arrays.fill(array, null);
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {

            return size == 0;
    }


    public String toString(){
        Integer[] toshow= Arrays.copyOf(array,size);
        return Arrays.toString(toshow);
    }
}
