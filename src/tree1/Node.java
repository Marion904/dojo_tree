package tree1;

public class Node<T> {
	
	private T data;
	private Node<T> right;
	private Node<T> left;
	
	public Node(){
	}
	
	public Node(T data){
		this.data = data;
		this.right = null;
		this.left = null;
	}
	
	public Node(T data, Node<T> right, Node<T> left){
		this.data = data;
		this.right = right;
		this.left = left;
	}
	
	public Node(T data, T right, T left){
		this.data = data;
		this.right = new Node<T>(right);
		this.left = new Node<T>(left);
	}
	
	public Node<T> getRight(){
		return this.right;
	}
	
	public Node<T> getLeft (){
		return this.left;
	}
	
	public T getData(){
		return this.data;
	}
	
	public void setData(T data){
		this.data = data;
	}
	
	public void setRight(Node<T> right){
		this.right = right;
	}
	
	public void setLeft(Node<T> left){
		this.left = left;
	}
	
	public void setRight(T data){
		this.right = new Node<T>(data);
	}
	
	public void setLeft(T data){
		this.left = new Node<T>(data);
	}
	
	
	public boolean hasRight(){
		return this.right != null;
	}
	
	public boolean hasLeft(){
		return this.left!=null;
	}
	
	
}
