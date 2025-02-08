import java.util.*;
public class ArrayListScratch {  //<T>
    private Object[] arr; //T[]
    private int capacity;
    private int size;

     ArrayListScratch(int capacity){
        arr=new Object[capacity]; //(T[])
        this.capacity=capacity;
        size=0;
    }

    public ArrayListScratch(){
        this(10);
        size=0;
        arr=new Object[capacity]; //(T[])
    }

    public void add(Object data){
        ensureCapacity();
        arr[size++]=data;
//        arr[size]=data;
//        size++
    }
    public void add(int index,Object data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        ensureCapacity();
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index++]=data;
//        arr[index] = data;
//        size++;
    }

    public Object get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        return arr[index];
    }

    public void set(int index, Object data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        arr[index] = data;
    }

    public boolean contains(Object data) {
        return indexOf(data) != -1;
    }

    public int indexOf(Object data) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    private void ensureCapacity() {
        if (size == capacity) {
            capacity *= 2; // Double the capacity
            Object[] newArr =  new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }

    public boolean removeValue(Object data) {
        int index = indexOf(data);
        if (index == -1) return false;
        removeValue(index);
        return true;
    }

    public Object removeIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        Object removedData = arr[index];
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
        size--;
        return removedData;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        arr = new Object[capacity];
        size = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        for (int i = 0; i < size; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static void main(String args[]){
        ArrayListScratch list=new ArrayListScratch();
        list.add(10);
        list.add("hello");
        list.add(4.3);
        System.out.println(list.get(2));
        System.out.println(list.contains(10));
        System.out.println(list.size());
        System.out.println();
    }
}