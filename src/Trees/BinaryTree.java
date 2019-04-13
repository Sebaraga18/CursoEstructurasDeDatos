package Trees;


public class BinaryTree {
	
	BinaryTreeNode root = null; //
	 
	/**
	 * 
	 */
	public BinaryTree() {}
	
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return root == null ? true : false;
	}
	
	
	/**
	 * 
	 * @param value
	 */
	public void insert(BinaryTreeNode node)
	{
		if(isEmpty())
		{
			root = node;
		}
		else
		{
			BinaryTreeNode temp = root;
			BinaryTreeNode parent = root;
			
			while(temp != null)
			{
				parent = temp;
				if(node.isLessThan(temp))
					temp = temp.getLeft();
				else
					temp = temp.getRight();
			}
			
			if(node.isLessThan(parent))
				parent.setLeft(node);
			else
				parent.setRight(node);
		}
	}
	
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public BinaryTreeNode search(BinaryTreeNode nodeToSearch)
	{
		BinaryTreeNode temp = root;
		
		while(temp != null)
		{
			if(temp.isEqual(nodeToSearch))
				break;
			else
				if(nodeToSearch.isLessThan(temp))
					temp = temp.getLeft();
				else
					temp = temp.getRight();
		}
		
		return temp;
	}
	
	
	/**
	 * 
	 * @param value
	 */
	public void delete(BinaryTreeNode nodeToDelete)
	{
		BinaryTreeNode temp = root;
		BinaryTreeNode parent = root;
		
		while(temp != null)
		{
			parent = temp;
			if(nodeToDelete.isLessThan(temp))
				temp = temp.getLeft();
			else
				temp = temp.getRight();
		}
		
	
		if(isLeaf(temp)) {
			if(nodeToDelete.isLessThan(parent))
				parent.setLeft(null);
			else
				parent.setRight(null);
		}
			
		if(oneChild(temp)) {
			if(nodeToDelete.isLessThan(parent)) {
			if(temp.getLeft()!=null) {
				parent.setLeft(temp.getLeft());
			}else
				parent.setLeft(temp.getRight());
		    } else
		    	if(temp.getLeft()!=null) {
					parent.setRight(temp.getLeft());
		      }else
					parent.setRight(temp.getRight());
			    }
		else {
			BinaryTreeNode temp2=temp;
			BinaryTreeNode parent2=temp;
			
			temp2=temp2.getRight();
		while(temp.getLeft()!=null) {
			parent=temp2;
			temp2=temp2.getLeft();
			
		}
		temp=temp2;
		parent2.setLeft(null);
			
		}
			
	}
	
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean isLeaf(BinaryTreeNode node)
	{
		return (node.getLeft() == null && node.getRight() == null) ? true : false;
	}
	
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean oneChild(BinaryTreeNode node)
	{
		return (node.getLeft() != null && node.getRight() != null) ? false : true;
	}
	
	
	/**
	 * 
	 * @param node
	 */
	public void preorder(BinaryTreeNode node)
	{
		if(node != null)
		{
			System.out.print(node.toString() + " ");
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}
	
	
	/**
	 * 
	 * @param node
	 */
	public void postorder(BinaryTreeNode node)
	{
		if(node != null)
		{
			postorder(node.getLeft());
			postorder(node.getRight());
			System.out.print(node.toString() + " ");
		}
		
	}
	
	
	/**
	 * 
	 * @param node
	 */
	public void inorder(BinaryTreeNode node)
	{
		if(node != null)
		{
			inorder(node.getLeft());
			System.out.print (node.toString() + " ");
			inorder(node.getRight());
		}
	
	}
}