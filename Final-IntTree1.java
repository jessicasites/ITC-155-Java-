import java.util.TreeSet;

//Final Problem 3
//Jessica Sites 
//6/12/20
//Write a method isFull that returns whether or not a binary tree is full
//(true, if it is, false if otherwise). //A full binary tree is one in which every 
//node has 0 or 2 children. 

public class IntTree1 {

	private IntTreeNode overallRoot;

	public IntTree1() {
		overallRoot = null;
	}

	private IntTreeNode buildTree(int n, int max) {
		if (n > max) {
			return null;
		} else {
			return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2 * n + 1, max));
		}
	}

	public boolean isFull() {
		if (overallRoot == null)
			return true;

		return _isFull(overallRoot);
	}

	public boolean _isFull(IntTreeNode node) {
		if (node == null)
			return true;
		if ((node.left == null && node.right == null) || (node.left != null && node.right != null)) {
			return _isFull(node.left) && _isFull(node.right);
		}
		return false;
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
