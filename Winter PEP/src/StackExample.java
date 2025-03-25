public class StackExample {
    private int arr[];
    private int top;
    private int capacity;
    StackExample(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack Overflow!! Cannot push "+value);
            return;
        }
        arr[++top]=value;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!!");
            return -1;
        }
        return arr[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty: No top Element");
        }
        return arr[top];
    }
    public boolean isFull(){
        return top==-1;
    }
    public boolean isEmpty(){
//        return top==capacity-1;
        return false;
    }
}
