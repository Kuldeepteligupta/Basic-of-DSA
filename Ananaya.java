import java.util.ArrayList;

public class Ananaya {

    static class Edge{
         int src;
         int desti;
         int wt;
         public Edge(int s, int d, int w){
            this.src = s;
            this.desti = d;
            this.wt = w;
         }
    }
     public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> Graph[] = new ArrayList[v];
        for(int i=0; i<Graph.length; i++){
            Graph[i] = new ArrayList<>();
        }
        Graph[0].add(new Edge(0,1,5));
         Graph[1].add(new Edge(1,0,5));
          Graph[1].add(new Edge(1,2,1));
           Graph[1].add(new Edge(1,3,3));
         Graph[2].add(new Edge(2,1,1));
          Graph[2].add(new Edge(2,3,1));
           Graph[2].add(new Edge(2,4,2));
          Graph[3].add(new Edge(3,1,3));
           Graph[3].add(new Edge(3,2,1));
            Graph[0].add(new Edge(4,2,2));

            for(int i=0; i<Graph[2].size(); i++){
                 Edge e = Graph[2].get(i);
                 System.out.println(e.desti);
            }


     }
}
