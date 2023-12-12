import java.util.LinkedList;
import java.util.Queue;
public class Practice{

   static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data = data ;
    }

   }
   static int idx = -1;
   public static Node Buildtree(int values[]){
     idx++;
      if(idx >= values.length || values[idx] == -1){
        return  null ;
      }

      Node newNode = new Node(values[idx]);
      newNode.left = Buildtree(values);
      newNode.right = Buildtree(values);

      return newNode ;
   }
    public static void levelorder(Node root){
       

      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);

      while(!q.isEmpty()){
         Node curNode = q.remove();
         if(curNode ==  null){
         System.out.println();
          if(q.isEmpty()){
          break;
         }else{
          q.add(null);
         }
        }
         else{
          System.out.print(curNode.data+" ");

          if(curNode.left != null){
            q.add(curNode.left);

           }
          if(curNode.right != null){
            q.add(curNode.right);
          }
        }
      }
    }
    // // public static int Height(Node root){
    //     if(root == null){
    //       return 0;
    //     }
         
        
    //    int lh = Height(root.left);
    //    int rh = Height(root.right);

    //    return Math.max(lh, rh)+1;
    // }

    public static int countNode(Node root){
       if(root == null){
        return 0;
       }

        int lc = countNode(root.left);
        int rc = countNode(root.right);
        return lc+rc+1;
    }
   public static int sum(Node root){
    if(root == null){
      return 0;
    }
     int leftsum = sum(root.left);
     int rightsum = sum(root.right);
     return leftsum+rightsum+root.data;
   }

  //  public static int diameter(Node root){
  //    if(root == null){
  //     return 0;
  //    }
  //     int ld = diameter(root.left);
  //     int rd = diameter(root.right);
  //     int rh = Height(root.right);
  //     int lh = Height(root.left);
  //     int self = rh+lh+1;
  //     return Math.max(  self, Math.max(ld, rd));
  //  }
     static class info{
      int ht;
      int dim;
      public info(int ht, int dim){
        this.ht = ht ;
        this.dim = dim ;
       }
    }
    public static info diameter1(Node root){
       if(root == null){
        return new info(0,0) ;
       }
       info  leftinfo = diameter1(root.left);
       info rightinfo = diameter1(root.right);

       int dim = Math.max(Math.max(leftinfo.dim, rightinfo.dim),leftinfo.ht+rightinfo.ht+1);
       int Height = leftinfo.ht+rightinfo.ht+1;

       return new info(Height, dim);
         
    }
   public static void main(String[] args) {
    int values[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    // Practice tree = new Practice();
       Node res = Buildtree(values);
      //  System.out.println(res.data);

      //  levelorder(res);
      // System.out.println( Height(res));
      // System.out.println(countNode(res));
      // System.out.println(sum(res));
      // System.out.println("The daimeter is"+diameter(res));
      // System.out.println(diameter1(res));
      info  res2 = diameter1(res);
      System.out.println(res2.dim);
      System.out.println(res2.ht);

   }
}