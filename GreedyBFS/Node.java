package Tugas.GreedyBFS;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String nama;
    private int x;
    private int y;
    private List<Node> tetangga;
    private boolean visited;

    public Node(String nama, int x, int y) {
        this.nama = nama;
        this.x = x;
        this.y = y;
        this.tetangga = new ArrayList<>();
        this.visited = false;
    }

    public String getNama() {
        return nama;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isVisited() {
        return visited;
    }

    public void addTetangga(Node tetangga) {
        this.tetangga.add(tetangga);
    }

    public List<Node> getTetangga() {
        return tetangga;
    }
}
