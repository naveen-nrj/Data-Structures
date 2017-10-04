package Queue;

public class Queue {
	int size;
	int front=-1;  int rear=-1;
	int[] arr = new int[5];
	Queue() {
		arr = new int[5];
		size = 5;
		front = -1;
		rear = -1;
	}
	Queue(int sz) {
		arr = new int[sz];
		front = -1;
		rear = -1;
		
	} 
		
	 boolean Isempty() {
			if (front==-1 && rear==-1) {
				return true;
			}
			else {
				return false;
			}
		}
		 void Enqueue(int x) {
			if (rear==size-1) {
				System.out.println("overflow");
			}
			else if (Isempty()) {
				front=rear=0;
				arr[rear] = x;
			}
			else {
				rear++;
				arr[rear]=x;
			}
		}
		 void Dequeue() {
			if (Isempty()) {
				System.out.println("underflow");
			}
			else if(front==rear) {
				front = rear = -1;
			}
			else {
				front = front + 1;
			}
		}
		public void print() {
			int i;
			int n = arr.length;
			for( i = front; i < n ; i++ ) {
			System.out.println(arr[i]);
			}
		}

}
