/*) Suppose that you are given the In-Order traversal of the Binary Search Tree in the 
form of ArrayList or Array. Now your task is that you have create a new ArrayList or 
Array for the In-Order traversal of Binary Search Tree where all duplicates are 
removed.*/

package CollectionAndAssignment;

class Node
{
	int key;
	Node left,right;
	public Node(int item)
	{
		key=item;
		left=right=null;
	}
}

public class C10 {
	
	Node root;
		C10() 
		{
			root=null;
		}
		void printInorder(Node node)
		{
			if(node==null)
				return;
			printInorder(node.left);
			System.out.print(node.key + " ");

			printInorder(node.right);
		}
		void printInorder() { printInorder(root); }

		public static void main(String[] args)
		{
			C10 c10 = new C10();
			c10.root = new Node(1);
			c10.root.left = new Node(2);
			c10.root.right = new Node(3);
			c10.root.left.left = new Node(4);
			c10.root.left.right = new Node(5);

			System.out.println("\nInorder traversal of binary tree is ");
			c10.printInorder();
		}

}