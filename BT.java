
import java.util.*;
import java.util.LinkedList;
public class BT {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    static class BinaryTree{
        static int idx = -1;
     public static Node Buildtree( int nodes[]){
               idx++;
        if(idx > nodes.length-1 || nodes[idx] == -1){
            return null ;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = Buildtree(nodes);
         newNode.right = Buildtree(nodes);
        return newNode ;
     }

     public static void Preorder(Node root){
         if(root == null){
            // System.out.println("No node");
            return  ;
         }
         System.out.print(root.data+" ");
          Preorder(root.left);
          Preorder(root.right);

     }
     public static void Inorder(Node root){
        if(root == null){
            return  ;
        }

         Inorder(root.left);
         System.out.print(root.data+" ");
         Inorder(root.right);
        //  return ;
     }

     public static void Postorder(Node root){
        if(root == null){
            return ;
        }

        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
     }

     public static void Levelordertrav(Node root){

         if(root == null){
            return ;
        }
         
         Queue<Node> Q = new LinkedList<Node>();

         Q.add(root);
         Q.add(null);

          while(!Q.isEmpty()){
             Node currNode =Q.remove();
              if(currNode == null){
                System.out.println();
                if(Q.isEmpty()){
                    break ;
                }else{
                    Q.add(null);
                }
              }
              else{
                System.out.print(currNode.data+" ");

                 if(currNode.left != null){
                    Q.add(currNode.left);
                 }
                 if(currNode.right != null){
                    Q.add(currNode.right);
                 }
              }
          }

     }

      public static int height(Node root){
        if(root == null){
            return 0;
        }

         int lh = height(root.left);
         int rh = height(root.right);
          return Math.max(lh, rh)+1;

      }

    }
     public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node res = tree.Buildtree(nodes);
        // System.out.println(res.data);

        // tree.Preorder(res);
        // tree.Inorder(res);
        // tree.Postorder(res);
        // tree.Levelordertrav(res);
        System.out.println(tree.height(res));
        
     }
}
