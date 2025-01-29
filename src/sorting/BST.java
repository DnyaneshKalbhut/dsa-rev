package sorting;

public class BST {


	class Node{
		Node left;
		Node right;
		int data;
		
		public Node(int val) {
			this.left=null;
			this.right=null;
			data = val;
		}
		
	}
	Node root;
	
	public BST() {
		this.root=null;
	}
	
	public void insertval(int val) {
		root=insertData(root,val);
		
	}
	
	
	
	private Node insertData(Node root, int val) {
		
		
		Node newnode = new Node(val);
		if(root==null) {
			root = newnode;
			return root;
		}
		
		if(val<root.data) {
			root.left=insertData(root.left, val);
		}else {
			root.right=insertData(root.right, val);
		}
		return root;
	}
	public void inorder() {
		inorderTraversal(root);
		System.out.println("-----------------");
	}

	private void inorderTraversal(Node root) {
		if(root!=null) {
			inorderTraversal(root.left);
			System.out.println(root.data);
			inorderTraversal(root.right);
		}
	}

	public void preorder() {
		preorderTraversal(root);
		System.out.println("-----------------");
	}
	private void preorderTraversal(Node root) {
		if(root!=null) {
			System.out.println(root.data);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}

	public void postorder() {
		postorderTraversal(root);
		System.out.println("-----------------");
	}

	private void postorderTraversal(Node root) {
		if(root!=null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.println(root.data);
		}
	}

	public boolean binarysearchVal(int val) {
		return binarySearchData(root,val);
	}

	private boolean binarySearchData(Node root, int val) {
		
		if(root==null) {
			return false;
		}
		if(root.data==val) {
			return true;
		}else if(val<root.data) {
			return binarySearchData(root.left, val);
		}else {
			return binarySearchData(root.right, val);
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BST bt = new BST();
		
	bt.insertval(60);
	bt.insertval(35);
	bt.insertval(75);
	bt.insertval(20);
	bt.insertval(40);
	bt.insertval(70);
	bt.insertval(80);
	
	
	bt.inorder();
	bt.postorder();
	bt.preorder();
	
	if(bt.binarysearchVal(75)) {
		System.out.println("data found");
	}else {
		System.out.println("data not found");
	}
	
	
	
	
	
	
	}

}
