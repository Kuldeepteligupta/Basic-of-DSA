import java.util.*;
import java.util.LinkedList;
public class BinaryTree {


    static class Node{
        int data;
        Node left;
         Node right;
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }


    }

     static class BinaryTreeimp{
        static int idx =-1;
         public static Node Buildtree(int nodes[]){
           idx++;
           if( idx >nodes.length-1 ||  nodes[idx] == -1 ){
            return null ;
           }

           Node newNode = new Node(nodes[idx]);
           newNode.left = Buildtree(nodes);
           newNode.right = Buildtree(nodes);

           return newNode ;
         }

         public static void levelorder(Node root){
          if(root == null){
            return ;
          }

          Queue<Node> q = new LinkedList<>();
          q.add(root);
          q.add(null);

          while(!q.isEmpty()){
             Node currNode = q.remove();
             if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break ;
                }else{
                    q.add(null);
                }
             }else{
                 System.out.print(currNode.data+" ");

                 if(currNode.left != null){
                    q.add(currNode.left);
                 }
                 if(currNode.right !=null){
                    q.add(currNode.right);
                 }
             }   
            }
           }
    }
    public static void main(String[] args) {
        int nodes [] = {1,2,3,4,5,6};
        BinaryTreeimp tree = new BinaryTreeimp();
             Node root  = tree.Buildtree(nodes);
            //  System.out.println(root.data);

           tree.levelorder(root);

    }
}
