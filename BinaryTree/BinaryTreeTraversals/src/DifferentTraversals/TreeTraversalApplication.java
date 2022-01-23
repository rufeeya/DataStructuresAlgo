package DifferentTraversals;

import BinaryTreeTraversal.TreeNode;

/****
 * 
 * @author rufeeya.t
 * Entry Point for binary Tree Traversals
 ****/

public class TreeTraversalApplication {
	public static void main( String[] args) {
		/**
		 * Create a sample binary tree
		 * As per the tree under "References"
		 * Image: "SampleBinaryTree.png"
		 */
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2));
		root.setRight(new TreeNode(3));
		
		root.getLeft().setLeft(new TreeNode(4));
		root.getLeft().setRight(new TreeNode(5));
		
		root.getLeft().getLeft().setLeft(new TreeNode(7));
		
		root.getRight().setRight(new TreeNode(6));
		root.getRight().getRight().setLeft(new TreeNode(8));
		
		/*
		 * Call Each type of traversal to print the result
		 * Results of each type of traversal is also available under "Reference"
		 * FileName: "SampleBonaryTreeResults.txt" 
		 */

		TraversalUtil traverse = new TraversalUtil();
		
		System.out.println("*** Printing the Binary Tree in preOrder Traversal Using recursion ***");
		traverse.preOrderRecursive(root);
		
		System.out.println("\n\n*** Printing the Binary Tree in preOrder Traversal ***");
		traverse.preOrder(root);
		
		System.out.println("\n\n*** Printing the Binary Tree in inOrder Traversal ***");
		traverse.inOrder(root);
		
		System.out.println("\n\n*** Printing the Binary Tree in postOrder Traversal ***");
		traverse.postOrder(root);
	}

}
