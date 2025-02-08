public class stackUsingArrayList {

    private int[] arr;
    private int top;
    private int capacity;

    public stackUsingArrayList(int size){
        this.capacity=size;
        this.arr= new int[size];
        this.top=-1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            resize();
        }
        arr[++top] = value;
    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack underflow");
        }
        return arr[top--];
    }
    public int peek(){
        if(top==-1){
            throw new RuntimeException("Stack underflow");
        }
        return arr[top];
    }

    public int size(){
        return top+1;
    }

    public static void main(String args[]){
        stackUsingArrayList stack=new stackUsingArrayList(2);
        stack.push(10);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.peek());
    }
}