
public class Main{
    public static void main(String[] args) {
        Stack theStack = new Stack(3);

        // push
        if(!theStack.isFull())
            theStack.push(1);
        if(!theStack.isFull())
            theStack.push(2);
        if(!theStack.isFull())
            theStack.push(3);
        if(!theStack.isFull())
            theStack.push(4);
        else
            System.out.println("Stack is full, cannot push element");

        // pop
        if(!theStack.isEmpty())
            theStack.pop();
        if(!theStack.isEmpty())
            theStack.pop();
        if(!theStack.isEmpty())
            theStack.pop();
        if(!theStack.isEmpty())
            theStack.pop();
        else
            System.out.println("Stack is empty, cannot pop element");

        //peek
        if(!theStack.isFull())
            theStack.push(10);

        // peek couple of times
        theStack.peek();
        theStack.peek();

    }
}




