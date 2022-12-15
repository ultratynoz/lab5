import java.util.List;

public interface WeightedGraph<E> {

    public boolean addVertex();

    public List<Vertex> getVertices();

    public int getVertex(int ID);

    public List<Integer> getEdges(int ID);


}
