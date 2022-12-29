import java.util.LinkedList;
import java.util.List;

class WeightedEdge {
    private String source;
    private String destination;
    private int weight;
    private Integer distance = Integer.MAX_VALUE;
    private List<WeightedEdge> shortestPath = new LinkedList<>();

    // Constructor
    public WeightedEdge(String source, String destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }


    // Get the source vertex
    public String getSource() {
        return source;
    }

    // Get the destination vertex
    public String getDestination() {
        return destination;
    }

    // Get the weight of the edge
    public int getWeight() {
        return weight;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public List<WeightedEdge> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<WeightedEdge> shortestPath) {
        this.shortestPath = shortestPath;
    }
}