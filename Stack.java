public class Stack {
	private int size;
	private int[] arr;
	private int top = -1;

	public Stack(int size) {
		this.size = size;
		arr = new int[size];
	}

	public void push(int num){
			arr[top] = num;
			top++;
	}

	public int pop(){
			int result =  arr[top] ;
			top--;
			return result;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isFull() {
		return (top == size-1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}


}





