//Assignment 9 
//Jessica Sites 
//6/11/20
//Write a method countEmpty that returns the number of empty branches in a tree.
//An empty tree is considered to have one empty branch (the tree itself). 
//For non-empty trees, your method(s) should count the total number of empty 
//branches among the nodes of the tree. A leaf node has two empty branches.
//A node with one non-empty child has one empty branch. A node with two non-empty
//children (a full branch) has no empty branches. 
//**********************************************************************************

public class IntTree {
	private IntTreeNode overallRoot;

	public IntTree() {
		overallRoot = null;
	}

	private IntTreeNode buildTree(int n, int max) {
		if (n > max) {
			return null;
		} else {
			return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2 * n + 1, max));
		}
	}

	public int countEmpty() {
		return countEmpty(overallRoot);
	}

	private int countEmpty(IntTreeNode root) {
		if (root == null)
			return 1;

		return countEmpty(root.left) + countEmpty(root.right);
	}

	public void printPreorder() {
		System.out.print("preorder:");
		printPreorder(overallRoot);
		System.out.println();
	}

	private void printPreorder(IntTreeNode root) {
		if (root != null) {
			System.out.print(" " + root.data);
			printPreorder(root.left);
			printPreorder(root.right);
		}
	}

	public void printInorder() {
		System.out.print("inorder:");
		printInorder(overallRoot);
		System.out.println();
	}

	private void printInorder(IntTreeNode root) {
		if (root != null) {
			printInorder(root.left);
			System.out.print(" " + root.data);
			printInorder(root.right);
		}
	}

	public void printPostorder() {
		System.out.print("postorder:");
		printPostorder(overallRoot);
		System.out.println();
	}

	private void printPostorder(IntTreeNode root) {
		if (root != null) {
			printPostorder(root.left);
			printPostorder(root.right);
			System.out.print(" " + root.data);
		}
	}

	public void printSideways() {
		printSideways(overallRoot, 0);
	}

	private void printSideways(IntTreeNode root, int level) {
		if (root != null) {
			printSideways(root.right, level + 1);
			for (int i = 0; i < level; i++) {
				System.out.print("    ");
			}
			System.out.println(root.data);
			printSideways(root.left, level + 1);
		}
	}
}