package game;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Cell> cells = new ArrayList<>();

    public Board(int width, int height) {
        for (int i = 0; i < width * height; i++) {
            cells.add(new Cell(0, i));
        }
    }

    @Override
    public String toString() {
        return "Board{" +
                "cells=" + cells +
                '}';
    }
}
