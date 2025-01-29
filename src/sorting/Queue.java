package sorting;

public class Queue {

	int [] arr;
	int front;
	int rear;
	
	public Queue() {
		front = 0;
		rear = 0;
		arr = new int[10];
	}
	public Queue(int size) {
		front = 0;
		rear = 0;
		arr = new int[size];
	}
	
	public void Enqueue(int val) {
		if(isFull()) {
			System.out.println("queue is full");
		}else {
			
			arr[rear]=val;
			rear++;
		}
	}
	public int Dequeue()
	{
		if(isEmpty()) {
			System.out.println("queue is empty");
		}else{
		
			int n = arr[front];
			front++;
			System.out.println(n);
			
		}
		return -1;
	}
	
	
	private boolean isFull() {
		return rear==arr.length;
	}
	
	private boolean isEmpty() {
		return front==rear;
	}
	
	public static void main(String[] args) {
	
           Queue que = new Queue(5);
           que.Enqueue(10);
           que.Enqueue(20);
           que.Enqueue(30);
           que.Enqueue(40);
           que.Enqueue(50);
           
           while(!que.isEmpty()) {
        	   que.Dequeue();
           }
	}

}
