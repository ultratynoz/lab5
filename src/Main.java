import java.io.*;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader;
        WeightedGraph adjacencyList = new WeightedGraph();

        try {
            reader = new BufferedReader(new FileReader("C:\\Projekte\\HTW Berlin\\FS2\\Assets\\Info\\Lab05\\bvg.txt"));
            String line = reader.readLine();

            while (line != null) {
                String vertices[] = line.split("\\s+");
                for(int i = 1; i < vertices.length; i++){
                    String[] weightedDest = vertices[i].split(",");
                    adjacencyList.addEdge(vertices[0], weightedDest[0], Integer.parseInt(weightedDest[1]));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<String> map = adjacencyList.getAllVertices();
        // String start = map.get(Graph.getRandom(map.size()));
        // String end = map.get(Graph.getRandom(map.size()));
        String start = "060192001006";
        String end = "060029101731";
        Map<String, Map<String, String>> result = Dijkstra.shortestPath(adjacencyList, start, end);
        Map<String, String> distances = result.get("distances");
        Map<String, String> predecessors = result.get("predecessors");

// Get the shortest path
        List<String> path = Dijkstra.getShortestPath(start, end, predecessors);

// Print the shortest path
        System.out.println("Shortest path from " + start + " to " + end + ":");
        for (String vertex : path) {
            System.out.print(vertex + " ");
        }

// Print the distance of the shortest path
        System.out.println("\nDistance: " + distances.get(end));
    }
}