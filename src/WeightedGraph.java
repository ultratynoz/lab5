import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WeightedGraph {
    private static Map<Integer, List<WeightedEdge>> adjacencyList;

    // Constructor
    public WeightedGraph() {
        this.adjacencyList = new HashMap<>();
    }

    // Add a new vertex to the graph
    public static void addVertex(int vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            adjacencyList.put(vertex, new LinkedList<>());
        }
    }

    // Add a new edge to the graph
    public static void addEdge(int source, int destination, int weight) {
        addVertex(source);
        addVertex(destination);

        adjacencyList.get(source).add(new WeightedEdge(source, destination, weight));
    }

    // Get the neighbors of a given vertex
    public static List<WeightedEdge> getNeighbors(int vertex) {
        return adjacencyList.get(vertex);
    }

    // Get all the vertices in the graph
    public static List<Integer> getAllVertices() {
        return new LinkedList<>(adjacencyList.keySet());
    }

    public static Map<Integer, List<WeightedEdge>> getAdjacencyList() {return adjacencyList;}
}