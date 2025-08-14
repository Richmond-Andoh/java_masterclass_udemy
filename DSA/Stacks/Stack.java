package DSA.Stacks;

public class Stack {
    int[] stackArr;
    int top;

    // create stack with array of fixed size
    public Stack(int size){
        stackArr = new int[size];
        top = -1;
        System.out.print("The stack is created with a size of " + size);
    }


    // check if our stack is empty // space complexity is 0(1)
    public boolean isEmpty() {
        if(top == -1){    // 0(1)
            return true;  // 0(1)
        } else {
            return false; // 0(1)
        }
    }

    // check if the stack is full
    public boolean isFull() {
        if(top == stackArr.length - 1){    // 0(1)
            System.out.print("The Stack is Full" + "\n");
            return true;  // 0(1)
        } else {
            return false; // 0(1)
        }
    }

    // push element into the stack
    public void push(int value){
        if(isFull()){
            System.out.println("Stack Overflow");
        } else {
            top++;
            stackArr[top] = value;
            System.out.println("Element " + value + " is pushed into the stack");
        }
    }

    // pop element from the stack
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // Meaningful value indicating stack is empty
        } else {
            int poppedValue = stackArr[top];
            top--;
            System.out.println("Element " + poppedValue + " is popped from the stack");
            return poppedValue;
        }
    }

    // get the peek element from the stack
    public int peek() {
        if(isEmpty()){
            System.out.print("The Stack is Empty");
            return -1; // Meaningful value indicating stack is empty
        } else {
            return stackArr[top];
        }
    }
}
