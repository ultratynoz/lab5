import java.util.*;

public class Dijkstra {
    public static Map<String, Map<String, String>> shortestPath(WeightedGraph graph, String start, String end) {
        // Create a priority queue to store the vertices that are being processed
        PriorityQueue<WeightedVertex> queue = new PriorityQueue<>();

        // Create a map to store the distances from the start vertex to all other vertices
        Map<String, String> distances = new HashMap<>();

        // Create a map to store the predecessor vertex for each vertex in the shortest path
        Map<String, String> predecessors = new HashMap<>();

        // Set the distance to all vertices to infinity, except for the start vertex
        for (String vertex : graph.getAllVertices()) {
            if (vertex.equals(start)) {
                distances.put(vertex, "0");
            } else {
                distances.put(vertex, Integer.toString(Integer.MAX_VALUE));
            }
        }

        // Add the start vertex to the priority queue
        queue.add(new WeightedVertex(start, 0));

        // Process the vertices in the priority queue until it is empty
        while (!queue.isEmpty()) {
            // Get the vertex with the smallest distance from the queue
            WeightedVertex vertex = queue.poll();

            // Get the neighbors of the vertex
            List<WeightedEdge> neighbors = graph.getNeighbors(vertex.getVertex());

            // Update the distances of the neighbors
            for (WeightedEdge edge : neighbors) {
                String neighbor = edge.getDestination();
                int distance = edge.getWeight();

                // Calculate the distance from the start vertex to the neighbor
                int newDistance = Integer.parseInt(distances.get(vertex.getVertex())) + distance;

                // If the new distance is smaller than the previous distance, update it
                if (newDistance < Integer.parseInt(distances.get(neighbor))) {
                    distances.put(neighbor, Integer.toString(newDistance));
                    predecessors.put(neighbor, vertex.getVertex());

                    // Add the neighbor to the priority queue
                    queue.add(new WeightedVertex(neighbor, newDistance));
                }
            }
        }

        // Create the result map
        Map<String, Map<String, String>> result = new HashMap<>();
        result.put("distances", distances);
        result.put("predecessors", predecessors);

        // Return the result map
        return result;
    }


    public static List<String> getShortestPath(String start, String end, Map<String, String> predecessors) {
        // Create a linked list to store the shortest path
        LinkedList<String> path = new LinkedList<>();

        // Add the end vertex to the path
        path.add(end);

        // Get the predecessor of the end vertex
        String predecessor = predecessors.get(end);

        // Add the predecessor to the path and set it as the new end vertex
        while (predecessor.equals(start)) {
            path.addFirst(predecessor);
            predecessor = predecessors.get(predecessor);
        }

        // Add the start vertex to the path
        path.addFirst(start);

        // Return the shortest path
        return path;
    }
}


