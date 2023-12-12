
import java.util.HashMap;
import java.util.LinkedList;
import  java.util.Queue; 
import java.util.ArrayList ;
public class Practice2{


     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data ;
        
        }
     }
      public static boolean isidentical(Node root, Node subroot){

        if(root == null && subroot == null){
            return true;
        }else if(root == null || subroot == null){
            return false ;
        }
         if(!isidentical(root.left, subroot.left)){
            return false ;
         }
         if(!isidentical(root.right, subroot.right)){
            return false ;
         }
         return true ;
      }
     public static boolean issubtree(Node root, Node subroot){
      if(root == null){
        return false ;
      }

        if(root.data == subroot.data){
            if(isidentical(root,subroot)){
                return true ;
            }
        }

        return issubtree(root.left, subroot) || issubtree(root.right, subroot);

     }


     static class info{
        Node node;
        int hd;
        public info(Node node, int hd){
            this.node = node ;
            this.hd = hd ;
        }
     }

     public static void topview(Node root){

        Queue<info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0;
        int max = 0;
        q.add(new info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            info  curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break ;
                }else{
                    q.add(null);
                }
            } else{
                if(!map.containsKey(curr.hd)){
                  map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                   q.add(new info(curr.node.left, curr.hd-1));
                   min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
             }
            
        }
        for(int i=min; i<=max; i++){
            System.out.println(map.get(i).data+" ");
        }
    } 

    public static void kthlevel(Node root, int k){

        Queue<Node>  q = new LinkedList<>();
        q.add(root);
        q.add(null);
         int level =1;
         while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty()){
                    break ;
                }else{
                    q.add(null);
                    level++;
                }
            }else{

           
             if(level== k){
                System.out.print(currNode.data+" ");
             }
             if(currNode.left != null){
                q.add(currNode.left);
                // level++;
               }
             if(currNode.right != null){
                q.add(currNode.right);
                // level++;
             }
             }
             }
          }
         
      public static void kthlevel2(Node root, int level, int k){
           if(root == null){
            return ;
           }
           if(level == k){
           System.out.print(root.data+" ");
           return ;
           }
          
          kthlevel2(root.left, level+1, k);
          kthlevel2(root.right, level+1, k);
           
      }
      public static boolean getpath(Node root, int n, ArrayList<Node> path ){
          if(root == null){
            return false;
          }
         if(root.data == n){
            return true ;
         }
          path.add(root);

         boolean leftfound = getpath(root.left, n, path);
         boolean rightfound = getpath(root.right, n, path);

         if(leftfound || rightfound){
            return true ;
         }

         path.remove(path.size()-1);
         return false ;
      }

      public static Node Lca(Node root, int n1, int n2){

         ArrayList<Node>  path1 = new ArrayList<>();
         ArrayList<Node>  path2 = new ArrayList<>();

           getpath(root, n1, path1);
           getpath(root,n2, path2);

         int i =0;
         for(; i<path1.size() && i<path2.size(); i++){
             if(path1.get(i) != path2.get(i)){
                break ;
             }
         }

         return path1.get(i-1);
         
      }
     public static void main(String[] args) {
        Node newNode = new Node(1);
        newNode.left = new Node(2);
        newNode.left.left = new Node(4);
        newNode.left.right = new Node(5);
        newNode.right = new Node(3);
        newNode.right.right = new Node(6);

        // Node sumnode = new Node(2);
        // sumnode.left = new Node(4);
        // sumnode.right = new Node(5);

    //    boolean ans = issubtree(newNode, sumnode);
    //    System.out.println(ans);
        //  topview(newNode);
        // //  kthlevel(newNode, 2);
        // int k=2;
        // kthlevel2(newNode, 1, k);
         Node res =   Lca(newNode, 4, 5);
         System.out.println(res.data);

     }
}