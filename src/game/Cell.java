package game;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private List<Cell> neighbours = new ArrayList<>();
    private int status;
    private final int id;

    public Cell(int status, int id) {
        this.status = status;
        this.id = id;
    }

    public void setNeighbours(List<Cell> neighbours) {
        this.neighbours = neighbours;
    }

    public List<Cell> getNeighbours() {
        return neighbours;
    }

    public int getStatus() {
        return status;
    }

    public void kill() {
        status = 0;
    }

    public void raise() {
        status = 1;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "id=" + id +
                ", neighbours=" + neighbours +
                ", status=" + status +
                '}';
    }
}
