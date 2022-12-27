import java.util.*;

public class Graph {
    private static Map<Integer, List<WeightedEdge>> adjacencyList;

    public static int getRandom(int mapSize){
        return (int)(Math.random()*mapSize);
    }

    public static void findShortestBetween(List<Integer> map){
        int source = map.get(getRandom(map.size()));
        int destination = map.get(getRandom(map.size()));
        Map<Integer, List<WeightedEdge>> adjacencyList = WeightedGraph.getAdjacencyList();

        System.out.println(source);
        System.out.println(destination);

        Set<Integer> settledNodes = new HashSet<>();
        Set<Integer> unsettledNodes = new HashSet<>();

        unsettledNodes.add(source);
    }
}
