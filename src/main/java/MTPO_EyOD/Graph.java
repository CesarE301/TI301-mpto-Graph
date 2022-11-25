/**
 *Itess Instituto Tecnologico Superior de salvatierra
 *fecha: 24/11/2022 
 *Cesar Espino
 * MTPO
 * descripcion: representa un grafo
 */
package MTPO_EyOD;

/**
 *
 * @author cesar
 */
public class Graph {
    private final int NUM_VERTEX_MAX = 100;
    private int [] vertex;
    private int numVertex;
    private int[][] edge;
    private int numEdge;
    
    
    public Graph (){
        init();
    }
        
    public Graph(int numVertex) {
        setVertex(numVertex);
        init();
        
    }
    private void init(){
        this.vertex = new int[NUM_VERTEX_MAX];
        this.edge = new int[NUM_VERTEX_MAX][2];
    }
    
    public void setVertex(int numVertex) {
        this.numVertex = numVertex;
        
        for (int i = 0; i < numVertex; i++)
            this.vertex[i] = i;
        this.numVertex = numVertex;
    }
    
    public void setEdge(int i, int j){
        edge[numEdge][0] = i;
        edge[numEdge][1] = j;
        
        numEdge++;
    }
    
    public String toString() {
        String out = "Graph ------------- \n";
        
        out += "vertices : ["; 
        for (int i = 0; i < numVertex; i++) {
            out += i + (i== numVertex-1?"":", ");
        }
        out += "]\n";
        
        out += "aristas : [";
        for (int i = 0; i < numEdge; i++) {
            out += "(" + edge[i][0] + ", " + edge[i][1] + (i== numEdge-1?"":", ");
        }
        out += "]\n";
        
        return out;
    }
}
