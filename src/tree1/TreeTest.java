package tree1; 

import static org.junit.Assert.*;
import org.junit.Test;


public class TreeTest {

	@Test
    public void testAdd() throws Exception {

		Tree<String> tree = new Tree<>(new Node<>("A"));
		
		assertFalse(tree.empty());
		Node<String> B = new Node<>("B");
		Node<String> C = new Node<>("C");
		Node<String> D = new Node<>("D");
		Node<String> E = new Node<>("E");
		Node<String> F = new Node<>("F");
		Node<String> G = new Node<>("G");
		Node<String> H = new Node<>("H");
		Node<String> I = new Node<>("I");
		Node<String> J = new Node<>("J");
		tree.head.setLeft(B);
		tree.head.setRight(C);
		B.setLeft(D);
		B.setRight(E);
		C.setLeft(F);
		C.setRight(G);
		D.setLeft(H);
		D.setRight(I);
		E.setLeft(J);
		
		assertEquals("J",E.getLeft().getData());
		assertFalse(E.hasRight());
		//assertEquals(5, tree.getSize());
		
		
		assertEquals("ABDHIEJCFG", tree.deepDown());
		
    }
	
	@Test 
	public void testCount() throws Exception{
		
		Tree<String> tree = new Tree<>(new Node<>("A"));
		
		assertFalse(tree.empty());
		Node<String> B = new Node<>("B");
		Node<String> C = new Node<>("C");
		Node<String> D = new Node<>("D");
		Node<String> E = new Node<>("E");
		Node<String> F = new Node<>("F");
		Node<String> G = new Node<>("G");
		Node<String> H = new Node<>("H");
		Node<String> I = new Node<>("I");
		Node<String> J = new Node<>("J");
		tree.head.setLeft(C);
		tree.head.setRight(B);
		B.setLeft(D);
		B.setRight(E);
		C.setLeft(F);
		C.setRight(G);
		D.setLeft(H);
		D.setRight(I);
		E.setLeft(J);
		
		assertEquals(10,tree.count(tree.head));
	}
	
	@Test 
	public void testIterator() throws Exception{
		
		Tree<String> tree = new Tree<>(new Node<>("A"));
		
		assertFalse(tree.empty());
		Node<String> B = new Node<>("B");
		Node<String> C = new Node<>("C");
		Node<String> D = new Node<>("D");
		Node<String> E = new Node<>("E");
		Node<String> F = new Node<>("F");
		Node<String> G = new Node<>("G");
		Node<String> H = new Node<>("H");
		Node<String> I = new Node<>("I");
		Node<String> J = new Node<>("J");
		tree.head.setLeft(C);
		tree.head.setRight(B);
		B.setLeft(D);
		B.setRight(E);
		C.setLeft(F);
		C.setRight(G);
		D.setLeft(H);
		D.setRight(I);
		E.setLeft(J);
		for(String str : tree){
			System.out.println(str);
		}
	}
	
	
	
}
