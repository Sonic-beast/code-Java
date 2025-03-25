import java.util.LinkedList;
// Adjacency matrix representation

public class GraphList {
    private LinkedList<Integer>[] adj;
    private int vertices;
    private int edges;
    public GraphList(int nodes){
        this.vertices=nodes;
        this.edges=0;
        this.adj=new LinkedList[nodes];
        for(int i=0;i<nodes;i++){
            this.adj[i]=new LinkedList<>();
        }
    }
    public void addEdge(int a,int b){
        this.adj[a].add(b);
        this.adj[b].add(a);
        edges++;
    }
    public void printGraph(){
        System.out.println("Vertices: "+vertices+" Edges: "+edges);
        int ver=0;
    for(int i=0;i<vertices;i++){
        System.out.print(ver+": ");
        ver++;
        for(int j: adj[i]){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args){
        GraphList g=new GraphList(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.printGraph();


    }
}
