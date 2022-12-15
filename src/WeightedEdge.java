class WeightedEdge {
    private int source;
    private int destination;
    private int weight;

    // Constructor
    public WeightedEdge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    // Get the source vertex
    public int getSource() {
        return source;
    }

    // Get the destination vertex
    public int getDestination() {
        return destination;
    }

    // Get the weight of the edge
    public int getWeight() {
        return weight;
    }
}