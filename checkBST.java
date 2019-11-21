package Achievers1;
import java.util.*;


class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data = d;
        right = left = null;
    }
}
public class BinarySearchTree {

static Node root;

public static boolean checkBST(Node root)
{
    if(root.left!=null || root.right!=null)
    {
        if(root.left.data>root.data)
        {
            return false;
        }
        else if(root.right.data<root.data)
        {
            return false;
        }
        else
        {
            checkBST(root.left);
            checkBST(root.right);
        }
    }
        return true;
}


public static void main(String args[]){
   Scanner s = new Scanner(System.in);
   BinarySearchTree bst = new BinarySearchTree();
    bst.root=new Node(6);
    bst.root.left=new Node(4);
    bst.root.right=new Node(8);
    bst.root.left.left=new Node(3);
    bst.root.left.right=new Node(5);
    bst.root.right.left=new Node(7);
    bst.root.right.right=new Node(9);
    boolean demo=checkBST(root);
    if(demo)
    {
        System.out.println("Is a BST");
    }
    else
    {
        System.out.println("Not a BST");
    }
}
}
