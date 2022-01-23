package DifferentTraversals;

import java.util.Stack;

import BinaryTreeTraversal.TreeNode;

public class TraversalUtil {
	/**
	 * PreOrder Traversal - 
	 * Root, Left, Right
	 */
	public void preOrderRecursive( TreeNode root ) {
		if(root == null)
			return;
		else {
			System.out.print( (root.getData()) + " ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}
	/**
	 * Using Stack preOrder Traversal - 
	 * Root, Left, Right
	 */
	public void preOrder( TreeNode root ) {
		if(root == null )
			return;
		else{
			Stack<TreeNode> stack = new Stack<TreeNode>();
			TreeNode node = root;
			stack.push(node);
			while( !stack.isEmpty() ) {
				node = stack.pop();
				System.out.print( ( node.getData() ) + " ");
				if(node.getRight() != null )
					stack.push(node.getRight());
				if(node.getLeft() != null)
					stack.push(node.getLeft());				
			}
		}
	}
	/**
	 * Using Stack InOrder Traversal - 
	 * Left, Root, Right
	 */
	public void inOrder( TreeNode root ) {
		if(root == null )
			return;
		else{
			Stack<TreeNode> stack = new Stack<TreeNode>();
			TreeNode node = root;
			while(( node != null ) || !stack.isEmpty() ) {
				if(node != null ) {
					stack.push(node);
					node = node.getLeft();
				}
				else
				{
					node = stack.pop();
					System.out.print( ( node.getData() ) + " ");
					node = node.getRight();
				}			
			}
		}		
	}
		
	/**
	 * PostOrder Traversal - 
	 * Left, Right, Root
	 * PS: Algorithm used - https://www.geeksforgeeks.org/iterative-postorder-traversal-using-stack/
	 */	
	
	public void postOrder( TreeNode root ) {
		if(root == null)
			return;
		else {
			Stack<TreeNode> stack = new Stack<TreeNode>();
			TreeNode node = root;
			
			do {
				while( node != null  ) {									
					if(node.getRight() != null)
						stack.push(node.getRight()); 						
					stack.push(node);					
					node = node.getLeft();
					}
					node = stack.pop();
					/* Additinal Check - !stack.isEmpty()
					** Because code Throws while peek,
					** After popping last element */
					if(node.getRight() != null &&  !stack.isEmpty() && stack.peek() == node.getRight()) {
						stack.pop(); 
						stack.push(node);
						node = node.getRight();
					 }
					else {						
						System.out.print( ( node.getData() ) + " ");
						node = null;
					}
				}while(  !stack.isEmpty() );
			}
		}
}
