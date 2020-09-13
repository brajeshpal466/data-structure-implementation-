class Binarytree
{
    static Node root=null;
   void inorder(Node node)
   {
   	if(node==null)
   	{
   		return;
   	}
   	else
   	{
   	inorder(node.left);
   	System.out.println(" "+node.key+"\n");
   	inorder(node.right);
   }

   }
   void preorder(Node node)
   {
   	if(node==null)
   		return;
   	else
   	{
   		System.out.println(" "+node.key+"\n");
   		preorder(node.left);
   		preorder(node.right);
   	}
   }
   void postorder(Node node)
   {
   	if(node==null)
   		return;
   	else
   	{
   	postorder(node.left);
   	postorder(node.right);
   	System.out.println(" "+node.key+"\n");
   }
   }
  
	public static void main(String[] args) {
		Binarytree tree=new Binarytree();
		tree.root=new Node(1);
		// create left and righ node and assigg key value
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		//sub child of left and right
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		System.out.println("Inorder travesal of Binarytree");
        tree.inorder(root);
        System.out.println("preorder travesal of Binarytree");
        tree.preorder(root);
        System.out.println("Post order travesal of Binarytree");
        tree.postorder(root);
        
	}
}
class Node
{
	int key;
	Node left,right;
	Node(int d)
	{
		key=d;
		left=right=null;
	}
}