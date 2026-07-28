package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    // Node class
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    static class Tree {
        static int index = -1;

        public static Node buildTree(int[] nodes) {
            index++;
            if (index >= nodes.length) {
                return null;
            }

            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Preorder Traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.value+" ");
    }
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currnode = q.remove();
            if(currnode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else {
                System.out.print(currnode.value+" ");
                if(currnode.left != null){
                    q.add(currnode.left);
                }
                if(currnode.right != null){
                    q.add(currnode.right);
                }
            }
        }
    }
public static int CountNode(Node root){
        if(root == null){
            return 0;
        }
        int left=CountNode(root.left);
        int right = CountNode(root.right);
        return left+right-1;
}
public static int sumOfNode(Node root){
        if(root == null){
            return 0;
        }
        int leftsum=sumOfNode(root.left);
        int rightsum = sumOfNode(root.right);
        return leftsum+rightsum+ root.value;

    }
public static int HegihtOffTree(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight=HegihtOffTree(root.left);
        int rightHeight=HegihtOffTree(root.right);
        return Math.max(leftHeight,rightHeight)+1;
}
public static int diameter(Node root){
        if(root ==  null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3 = HegihtOffTree(root.left)+HegihtOffTree(root.right)+1;
        return Math.max(diam3,Math.max(diam2,diam1));
}


    public static void main(String[] args) {

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Node root = Tree.buildTree(nodes);

        System.out.println("Preorder Traversal:");
        preorder(root);
        System.out.println();
        System.out.println("inorder Traversal:");
        inorder(root);
        System.out.println();
        System.out.println("postorder Traversal:");
        postorder(root);
        System.out.println();
        System.out.println("Levelorder Traversal:");
        levelOrder(root);
    }
}