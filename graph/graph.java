package graph;
import java.util.*;
public class graph {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();

        }
        graph[0].add(new Edge(0, 2 , 2));

        graph[1].add(new Edge(1, 2,2));
        graph[1].add(new Edge(1, 3,10));

        graph[2].add(new Edge(2, 0,6));
        graph[2].add(new Edge(2, 1,7));
        graph[2].add(new Edge(2, 1,8));
        
        graph[3].add(new Edge(3, 1,-1));
        graph[3].add(new Edge(3, 2,0));
        

    }
    public static void main(String[] args) {
        int V=4;

        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        //print 2s neighbour
        for(int i=0;i<graph[1].size();i++){
            Edge e= graph[1].get(i);
            System.out.print(e.dest+ " , "+e.wt);
        }
    }
}
