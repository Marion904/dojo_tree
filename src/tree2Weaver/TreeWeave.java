package tree2Weaver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import tree1.Node;

public class TreeWeave<T> implements Iterable<T> {
	
		
	public Node<T> current = null;
	Node<T> left = new Node<T>();
	Node<T> right = new Node<T>();
	Node<T> head = null;
	int given = 0;
    
	public TreeWeave(Node<T> root){
		this.head = root;
	}
	
	public int count (Node<T> item){
			
			if(item==null) return 0;
			
			int result = 1;
			
			if(item.hasLeft()){
				result += count(item.getLeft());
			}
			if(item.hasRight()){
				result += count(item.getRight());
			}
					
			return result;
		}
	
	public String deepDown(){
		
		Node<T> item = null;
		Node<T> left = null;
		Node<T> right = null;
		
		if(this.empty())throw new NoSuchElementException();
		
		StringBuilder sb =new StringBuilder();
		
		item = this.head;
		sb.append(item.getData());
		
		left = item.getLeft();
		right = item.getRight();
		
		if(left != null){
			sb.append(iterate(left));
		}
		
		if(right != null){
			sb.append(iterate(right));
		}
		
		return sb.toString();
	}	



	public boolean empty(){
		return this.head ==null;
	}
	
	
	
	@Override
	public Iterator<T> iterator() {
		ArrayList<Node<T>> queuing = new ArrayList<Node<T>>();
		queuing.add(this.head);
		given = 0;
		int max = count(this.head);
		
		return new Iterator<T>(){
			
			@Override
			public boolean hasNext() {
		    	return (given<max);
			}

			@Override
			public T next() {
				current = queuing.remove(0);
				if(current.hasLeft()) queuing.add(current.getLeft());
				if(current.hasRight())queuing.add(current.getRight());
				given++;
		        return current.getData();	
			}
		};
			
	}
	
	
	public String iterate (Node<T> item){
		StringBuilder sb = new StringBuilder();
		if(item==null) return "";
		
		sb.append(item.getData());
		if(item.hasLeft()){
			sb.append(iterate(item.getLeft()));
		}
		if(item.hasRight()){
			sb.append(iterate(item.getRight()));
		}
				
		return sb.toString();
	}
	
	public String weaving (Node<T> item){
		StringBuilder sb = new StringBuilder();
		
		if(item==null) return "";
		ArrayList<Node<T>> queuing = new ArrayList<Node<T>>();
		queuing.add(item);
		
		while(!queuing.isEmpty()){
			Node<T> node = queuing.remove(0);
			sb.append(node.getData());
			if(node.hasLeft()) queuing.add(node.getLeft());
			if(node.hasRight()) queuing.add(node.getRight());
		}
		
		return sb.toString();
	}


}
