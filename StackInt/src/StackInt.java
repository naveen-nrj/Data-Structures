
public class StackInt {
	int[] arr = new int[5]; 
	int top = -1;
	StackInt() { 
	    arr = new int[10]; 
	    top = -1; 
	}
    StackInt(int sz) { 
    	arr = new int[sz]; 
    	top = -1; 
   }public void print() { 
	   for (int i=0; i<=top; i++)
	   { System.out.println(arr[i]);}
   } 
   public void push(int item) {
	   if(top==-1)
	   {System.out.println("can't push");}
	   else {
	   top=top+1;
	   arr[top] = item;
	   }
   }
	public int getTop() {
		return top;
		}
	public int pop() {
		if( top==-1 ) {
			System.out.println("can't pop");
			return -1;
			}
			else {
			ret = arr[top];	
			top --;
			return top;
			}
		}
	public char pop1() {
		if( top==-1 ) {
				System.out.println("can't pop");
				return 'a';
			}
		else {
			ret1 = array[top];	
			top --;
			return ret1;
		}
	}
	public int peek() {
		if(top < 0 ) {
				System.out.println("Can't peek");
				return -1;
			}
			else {
				return arr[top];
			}
		}
	public boolean equals(StackInt s1) {
		if (s1.top != top) {
				return false;
			}
		else {
			int flag = 0;
			int i;
			for(i = 0; i < top; i++ ) {
				if (s1.arr[i] != arr[i] ) {
					flag = -1;
					break;
				}
			}
			if ( flag == 0 ) {
				return true;
			}
			else {
				return false;
			}
		}
	}
  }


