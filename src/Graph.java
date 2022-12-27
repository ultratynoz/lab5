import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph {
    private static Map<Integer, List<WeightedEdge>> adjacencyList;

    public static int getRandom(int mapSize){
        return (int)(Math.random()*mapSize);
    }

    public static void findShortestBetween(List<Integer> map){
        int source = map.get(getRandom(map.size()));
        int destination = map.get(getRandom(map.size()));

        System.out.println(source);
        System.out.println(destination);
    }
}
