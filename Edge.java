public class Edge {
    private Vertex start;
    private Vertex end;
    private Integer weight;

    public Edge(Vertex startV,Vertex endV, Integer inputeWeight){
        this.start=startV;
        this.end=endV;
        this.weight=inputeWeight;
    }

    public Vertex getStart() {
        return start;
    }

    public Vertex getEnd() {
        return end;
    }

    public Integer getWeight() {
        return weight;
    }
    
    
}
