import java.util.HashMap;
import java.util.List;

public interface WeightedGraph {

    void addEdge(int source, int dest, int weight);

    void multiEdge(int source, HashMap<Integer, Integer> destinations);

    List<Vertex> getVertices();

    int getVertexName(int source);

    int getWeight(int source, int dest);

    List<Integer> getNeighbours(int source);
}
