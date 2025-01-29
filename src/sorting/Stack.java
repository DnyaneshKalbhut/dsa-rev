package sorting;

public class Stack {

		int [] arr ;
		 int top;
		 
		public Stack(){
			 top=-1;
			 arr=new int[5];
		 }
		
		public Stack(int size){
			 top=-1;
			 arr=new int[size];
		 }
	
		
		public void push(int val) {
			if(isFull()) {
				System.out.println("stack is Empty");
			}else {
				top++;
				arr[top]=val;
			}
		}
		
		public int pop() {
			if(isEmpty()) {
				System.out.println("stack is Empty");
			}else {
				int n = arr[top];
				top--;
				
				System.out.println(n);
				return n;
				
			}
			return -1;
		}
		
		
		
		
		public boolean isFull() {
			return top== arr.length-1;
		}
		public boolean isEmpty() {
			return top==-1;
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack(5);
		st.push(5);
		st.push(4);
		st.push(3);		
		st.push(2);
		st.push(1);
		
		while(!st.isEmpty())
		{
			st.pop();
		}
	}

}
