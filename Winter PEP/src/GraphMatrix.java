public class GraphMatrix {
    private int vertices;
    private int edges;
    private int[][] mat;
    public GraphMatrix(int size){
        this.mat=new int[size][size];
        this.vertices=size;
        this.edges=0;
    }
    public void addEdge(int a,int b){
        mat[a][b]=1;
        mat[b][a]=1;
        edges++;
    }
    public void printGraph(){
        System.out.println("Vertices: "+vertices+" Edges: "+edges);
        int ver=0;
        for(int[] j:mat){
            System.out.print(ver+": ");
            ver++;
            for(int i : j){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        GraphMatrix g=new GraphMatrix(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.printGraph();
    }
}
