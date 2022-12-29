import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WeightedGraph {
    private static Map<String, List<WeightedEdge>> adjacencyList;

    // Constructor
    public WeightedGraph() {
        this.adjacencyList = new HashMap<>();
    }

    // Add a new vertex to the graph
    public static void addVertex(String vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            adjacencyList.put(vertex, new LinkedList<>());
        }
    }

    // Add a new edge to the graph
    public static void addEdge(String source, String destination, int weight) {
        addVertex(source);
        addVertex(destination);

        adjacencyList.get(source).add(new WeightedEdge(source, destination, weight));
    }

    // Get the neighbors of a given vertex
    public static List<WeightedEdge> getNeighbors(String vertex) {
        return adjacencyList.get(vertex);
    }

    // Get all the vertices in the graph
    public static List<String> getAllVertices() {
        return new LinkedList<>(adjacencyList.keySet());
    }

    public static Map<String, List<WeightedEdge>> getAdjacencyList() {return adjacencyList;}
}