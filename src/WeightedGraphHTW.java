import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class WeightedGraphHTW<E> implements WeightedGraph<E>{

    private HashMap<Integer, Vertex<E>> vertices;

    @Override
    public boolean addVertex(int ID, E content) {
        try{
            vertices.put(ID,new Vertex<E>(content));
        }catch(Exception e){
            return false;
        }
        return true;
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
