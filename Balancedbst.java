public class Balancedbst {

    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data ;
            this.left = null;
            this.right = null ;
        }
    }
       
    public static Node BuildbalancedBST(int nodes[], int si, int ei){
          if(si > ei){
            return null ;
          }
        int mid = (si+ei)/2;
        Node root = new Node(nodes[mid]);
        root.left = BuildbalancedBST(nodes, si, mid-1);
        root.right = BuildbalancedBST(nodes, mid+1, ei);
        return root ;
    }

    public static void preorder(Node root){
          if(root == null){
            return ;
          }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int nodes[] = {3,5,6,8,10,11,12};
        Node root = BuildbalancedBST(nodes, 0, nodes.length-1);
        preorder(root);

    }
}
