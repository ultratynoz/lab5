import java.util.*;

public class Graph {
    public static int getRandom(int mapSize){
        return (int)(Math.random()*mapSize);
    }

    public static WeightedGraph findShortestBetween(WeightedGraph weightedGraph,List<Integer> map){
        int source = map.get(getRandom(map.size()));
        int destination = map.get(getRandom(map.size()));
        Map<String, List<WeightedEdge>> adjacencyList = weightedGraph.getAdjacencyList();

        System.out.println(source);
        System.out.println(destination);

        Set<WeightedEdge> settledNodes = new HashSet<>();
        Set<WeightedEdge> unsettledNodes = new HashSet<>();

        WeightedEdge start = adjacencyList.get(source).get(0);

        start.setDistance(0);

        unsettledNodes.add(start);

        while (unsettledNodes.size() != 0){
            WeightedEdge currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            List<WeightedEdge> edgeFromSource = WeightedGraph.getNeighbors("Test");
            for (int i = 0; i < edgeFromSource.size(); i++){
                WeightedEdge node = edgeFromSource.get(i);
                int edgeWeight = node.getWeight();
                if(!settledNodes.contains(node)) {
                    calcMinDistance(node, edgeWeight, currentNode);
                    unsettledNodes.add(node);
                }
            }
            settledNodes.add(currentNode);
        }
    return weightedGraph;
    }

    private static void calcMinDistance(WeightedEdge node, int edgeWeight, WeightedEdge currentNode) {
        int sourceDistance = currentNode.getDistance();
        if(sourceDistance + edgeWeight < node.getDistance()){
            node.setDistance(sourceDistance + edgeWeight);
            LinkedList<WeightedEdge> shortestPath = new LinkedList<>(currentNode.getShortestPath());
            shortestPath.add(currentNode);
            node.setShortestPath(shortestPath);
        }
    }

    private static WeightedEdge getLowestDistanceNode(Set<WeightedEdge> unsettledNodes){
        WeightedEdge shortestDistanceNode = null;
        int shortestDistance = Integer.MAX_VALUE;
        for(WeightedEdge edge: unsettledNodes){
            int edgeDistance = edge.getDistance();
            if(edgeDistance < shortestDistance) {
                shortestDistance = edgeDistance;
                shortestDistanceNode = edge;
            }
        }
        return shortestDistanceNode;
    }
}
