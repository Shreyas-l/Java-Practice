package binarySearchTree;


class Node{
	int data;
	Node left;
	Node right;
}

class BST{
	
	
	public Node createNewNode(int val) {
		
		Node a = new Node();
		
		a.data = val;
		a.left = null;
		a.right = null;
		
		return a;
		
	}
	public Node insert(Node node,int val) {
		
		if(node == null) {
			return createNewNode(val);
		}
		else if(val < node.data){
			node.left = insert(node.left,val);
		}
		else if(val > node.data) {
			node.right = insert(node.right,val);
		}
		
		return node;
	}
	
	
}

public class BSTApp {

	public static void main(String[] args) {
		

		BST  a = new BST();
		
		Node root = null;
		
		//8,3,6,10,4,7,1,14,13
		
		root = a.insert(root, 8);
		//root = a.insert(root, 3);

	}

}
