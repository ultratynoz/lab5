import java.util.List;

public interface WeightedGraph<E> {

    public boolean addVertex(int ID, E content);

    public List<Vertex> getVertices();

    public int getVertex(int ID);

    public List<Integer> getEdges(int ID);


}
