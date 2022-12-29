class WeightedVertex implements Comparable<WeightedVertex> {
    private String vertex;
    private int distance;

    // Constructor
    public WeightedVertex(String vertex, int distance) {
        this.vertex = vertex;
        this.distance = distance;
    }

    // Get the vertex
    public String getVertex() {
        return vertex;
    }

    // Get the distance
    public int getDistance() {
        return distance;
    }

    @Override
    public int compareTo(WeightedVertex other) {
        return Integer.compare(distance, other.distance);
    }
}