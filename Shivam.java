import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Shivam {

    static class Edge{
        int src;
        int desti;
        int wt;
        public Edge(int src, int desti, int wt){
            this.src = src;
            this.desti= desti;
            this.wt = wt ;
        }
    }

    public static void CreateGraph(ArrayList<Edge>  graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,5,1));
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,5,1));
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));
        graph[6].add(new Edge(6,5,1));
        traverse(graph);
       
    }

    public static void traverse(ArrayList<Edge> Graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean visit[] = new boolean[Graph.length];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();

            if(visit[curr] != true){
                System.out.println(curr);
                visit[curr] = true ;
                for(int i=0; i<Graph[curr].size(); i++){
                     Edge e = Graph[curr].get(i);
                     q.add(e.desti);
                }
            }
        }

        
    }
     public static void DFS(ArrayList<Edge> Graph[], int curr,boolean visit[]){
         
        System.out.print(curr+" ");
        visit[curr] = true ;

        for(int i=0; i<Graph[curr].size(); i++){
            Edge e = Graph[curr].get(i);

            if(!visit[e.desti]){
                DFS(Graph, e.desti, visit);
            }
        }
     }

     public static boolean Haspath(ArrayList<Edge> Graph[], int src, int desti, boolean visited[]){
        // boolean visited[] = new boolean[v];
          if(src == desti){
            return true ;
          }
          visited[src]=true;
          for(int i=0; i<Graph[src].size(); i++){
             Edge e = Graph[src].get(i);
              if(!visited[e.desti] && Haspath(Graph, e.desti, desti, visited)){
                 return true ;
              }
          }
          return false ;
     }
     public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>  Graph[] = new ArrayList[v];
         boolean  visited[] = new boolean[v];
        CreateGraph(Graph);
        DFS(Graph, 0, new boolean[v]);
        Boolean ans = Haspath(Graph, 0, 5, visited);
        System.out.println(ans);
        
         
     }
}
