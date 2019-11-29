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
public class LowestCommonAncestor {
 
static Node root;

 Node lowest(Node root, int a, int b) {
        if (root == null) {
            return root;
        }
        if (root.data == a || root.data == b) {
            return root;
        }
        Node l = lowest(root.left, a, b);
        Node r = lowest(root.right, a, b);
        if (l != null && r != null) {
            return root;
        }
        return (l != null) ? l : r;
    }

public static void main(String args[]){
   Scanner s = new Scanner(System.in);
   LowestCommonAncestor tree = new LowestCommonAncestor();
    tree.root=new Node(1);
    tree.root.left=new Node(2);
    tree.root.right=new Node(3);
    tree.root.left.left=new Node(4);
    tree.root.left.right=new Node(5);
    tree.root.right.left=new Node(6);
    tree.root.right.right=new Node(7);
   
    System.out.println("Enter two nodes");
    int a=s.nextInt();
    int b=s.nextInt();
    Node k=tree.lowest(root,a,b);
    System.out.println(k.data);
}
}
