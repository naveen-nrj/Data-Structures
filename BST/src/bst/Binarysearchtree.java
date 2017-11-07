package bst;

public class Binarysearchtree {
	public Node root;
	
	Binarysearchtree() {
		root = null;
	}
	public void insert(int data) {
		root = insert(root, data); 
	}
	
	public Node insert(Node root, int data) {
		if(root == null) {
			root = new Node(data);
		}
		else if(root.data > data) {
			root = insert(root.left, data);
		}
		else {
			root = insert(root.right, data);
	}
		return root;
	}
	public void search(int key) {
		Node n = search1(root, key);
		System.out.println(n);
	}
	public Node search1(Node root, int key) {
		if((root.data == key)||root == null) {
			return root;
		}
		else if(root.data>key) {
			return search1(root.left, key);
		}
		else {
			return search1(root.right, key);
		}
	}
	
	public void inorder(Node root) {
		if(root != null) {
			 inorder(root.left);
			 System.out.println(root.data);
			 inorder(root.right);
		}
	}
	
	public void preorder(Node root) {
		if(root !=null) {
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
			
		}
	}
	
	public Node delete(Node root, int key) {
		if(root == null) {
			return null;
		}
		else if(root.data>key) {
			root.left = delete(root.left, key);
		}
		else if(root.data<key) {
			root.right = delete(root.right, key);
		}
		else {
		if(root.right == null) {
			return root.left;
		}
		if(root.left == null) {
			return root.right;
		}
		
		root.data = minval(root.right);
		root.right = delete(root.right, key);
		}
		return root;		
	}
	public int minval(Node root) {
		int minv = root.data;
		while(root.left !=null) {
			minv = root.left.data;
			root  = root.left;
			
		}
		return minv;
	}
	
	

}
