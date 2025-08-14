package DSA.Stacks;

class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(5);

        // call the isEmpty method
        boolean results = newStack.isEmpty();
        System.out.println("\n" + "Is the stack empty? " + results);

        // call the isFull method
        boolean fullResults = newStack.isFull();
        System.out.println("\n" + "Is the stack full? " + fullResults);

        // call the push method
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);
        newStack.push(40);
        newStack.push(50);
        newStack.push(60); // stack Overflow

        // call the pop method
        newStack.pop();

        // call the peek method
        int peekResult = newStack.peek();
        System.out.println("\n" + "Peek result: " + peekResult);
    }
}
