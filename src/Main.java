import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader;
        WeightedGraphClass adjacencyList = new WeightedGraphClass();

        try {
            reader = new BufferedReader(new FileReader("C:\\Projekte\\HTW Berlin\\FS2\\Assets\\Info\\Lab05\\graph1.txt"));
            String line = reader.readLine();

            while (line != null) {
                String vertices[] = line.split("\\s+");
                for(int i = 1; i < vertices.length; i++){
                    String[] weightedDest = vertices[i].split(",");
                    adjacencyList.addEdge(Integer.parseInt(vertices[0]), Integer.parseInt(weightedDest[0]), Integer.parseInt(weightedDest[1]));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Graph.findShortestBetween(adjacencyList.getAllVertices());
    }
}