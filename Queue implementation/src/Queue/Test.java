package Queue;

public class Test { 
	public static void main(String[] args) {
	Queue q1 = new Queue();
	q1.Enqueue(10);
	q1.Enqueue(20);
	q1.Enqueue(30);
	q1.Enqueue(40);
	q1.Enqueue(50);
	q1.print();
	q1.Dequeue();
	q1.print();
	}
}
