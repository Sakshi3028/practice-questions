package Binarytree;


    import java.util.LinkedList;
import java.util.Queue;
public class questions {

static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

static class BinaryTree{
    static int idx=-1;
    public static Node buildTree(int nodes[]){
      idx++;
      if(nodes[idx]==-1){
        return null;
      }
    Node newNode=new Node(nodes[idx]);
    newNode.left=buildTree(nodes);
     newNode.right=buildTree(nodes);
     return newNode;
}}
//countofnodes
public static int countofnodes(Node root){
    if(root==null){
        return 0;
    }
    int leftNodes= countofnodes(root.left);
    int rightNodes= countofnodes(root.right);

    return leftNodes + rightNodes +1;
}
//height of nodes
public static int height(Node root){
     if (root == null) {
        return 0;
    }
    int leftheight= height(root.left);
    int rightheight= height(root.right);
    
    int myheight= Math.max(leftheight , rightheight)+1;
    return myheight;
}


public static void main(String args[]){
  int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
  BinaryTree tree= new BinaryTree();
  Node root = tree.buildTree(nodes);
//   preorder(root);
//   inorder(root);
// postorder(root);
// levelorder(root);
// System.out.println(countofnodes(root));
  System.out.println(height(root));
}
}
