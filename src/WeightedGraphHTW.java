import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class WeightedGraphHTW<E> implements WeightedGraph<E>{

    private HashMap<Integer, Vertex<E>> vertices;

    @Override
    public boolean addVertex() {
        return false;
    }

    @Override
    public List<Vertex> getVertices() {
        return null;
    }

    @Override
    public int getVertex(int ID) {
        return 0;
    }

    @Override
    public List<Integer> getEdges(int ID) {
        return null;
    }
}

class Vertex<E>{
    private List<Integer> edges;
    private E content;

    public Vertex(E content){
        this.content = content;
    }

    public List<Integer> getEdges() {
        return edges;
    }

    public E getContent(){
        return content;
    }

}
