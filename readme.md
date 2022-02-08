#Conway's Game of Life
A Turing-complete zero-player game, which can even be used to simulate itself! [^1]. Consists of a 2d square grid of cells, each of which can be alive or dead. At each step in time one of the following actions occurs:
1. Any live cell with two or three live neighbours survives. 
2. Any dead cell with three live neighbours becomes a live cell (reproduction). 
3. All other live cells die in the next generation (overpopulation or underpopulation).
4. All other dead cells stay dead.

The initial pattern is the seed of the game and determines how the evolution plays out.


###Classes
1. Board: Represents the n x m grid of the game, consists of an array of cells
2. Cell: Represents the cell at [n,m] in the board, has a set of neighbours, can be dead or alive.
3. View: ---

[^1]: [video demo](https://www.youtube.com/watch?v=xP5-iIeKXE8)