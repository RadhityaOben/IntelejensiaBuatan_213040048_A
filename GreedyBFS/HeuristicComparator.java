package Tugas.GreedyBFS;

import java.util.Comparator;

public class HeuristicComparator implements Comparator<Node> {
    private Node goal;

    public HeuristicComparator(Node goal) {
        this.goal = goal;
    }

    @Override
    public int compare(Node Node1, Node Node2) {
        double heuristic1 = calculateHeuristic(Node1);
        double heuristic2 = calculateHeuristic(Node2);

        return Double.compare(heuristic1, heuristic2);
    }

    private double calculateHeuristic(Node Node) {
        double deltaX = Node.getX() - goal.getX();
        double deltaY = Node.getY() - goal.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
