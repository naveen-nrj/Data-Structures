package linkedlist;

public class SinglyLinkedList{
	public Node head;

	
	public SinglyLinkedList() {
		head = null;		
	}
	
	public void Insert_At_Head(int value) {
		Node newnode = new Node(value);
		if(head == null) {
			head = newnode;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
		
	}
	
	public void Insert_at_Tail(int value) {
		Node newnode = new Node(value);
		Node temp = head;
		if(head == null) {
			head = newnode;
		}
		else {
			while (temp.next != null) {
				temp = temp.next;
		}
			temp.next = newnode;			
		}
	
	}
	
	public void print( ) {
		Node temp = head;
		if (head == null) {
			System.out.println("Empty");
		}
		else { 
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	} 
	
	public void Insert_at_pos(int x, int k) {
		Node newnode = new Node(x);
		Node temp = head;
		if(head == null) {
			head = newnode;
		}
		else if(k == 1) {
			while(temp.next != null) {
				temp = temp.next;
			}
			head.next = temp.next;
			head = head.next;
			
		}
		else {
			int i = 1;
			while(i < k-1 ) {
				temp = temp.next;
				i = i+1;
			}
			newnode.next = temp.next;
			temp.next = newnode;
		}
	}
	public void Delete_A_Value(int k)
	{
		Node temp=head;
		if(k==1)
		{
			head=temp.next;
		}
		else 
		{	
			int i=0;
			while(i < k-1)
			{	
				i++;
				temp=temp.next;
			}
			Node temp2=temp.next;
			temp.next=temp2;
		}
	}
}
