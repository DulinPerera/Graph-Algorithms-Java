import java.util.ArrayList;

public class Graph {

    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean inputIsWeighted,boolean inputIsDirected){
        this.vertices=new ArrayList<Vertex>();
        this.isWeighted=inputIsWeighted;
        this.isDirected=inputIsDirected;
    }

    public Vertex addVertex(String data){
        Vertex newVertex=new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }

    public void  addEdge(Vertex vertex1,Vertex vertex2,Integer weight){
        if(!this.isWeighted){
            weight=null;
        }
        vertex1.addEdge(vertex2, weight);
        if (!this.isDirected){
            vertex2.addEdge(vertex1,weight);
        }
    }

    public void removeEdge(Vertex vertex1,Vertex vertex2){
        vertex1.removeEdge(vertex2);
        if(!this.isDirected){
            vertex2.removeEdge(vertex1);
        }
    }

    public static void main(String[] args) {
        
    }
}
