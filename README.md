# MineSweeper Game

This Java program implements a simple console-based MineSweeper game. Players can enter the row and column count for the game board and attempt to clear the board without hitting any mines. Here's an overview of the game:

## How to Play

1. Enter the desired row and column count for the MineSweeper board.
2. Mines are randomly placed on the board.
3. Players enter row and column coordinates to reveal the cells.
4. The number in each cell represents the count of adjacent mines.
5. The game continues until all non-mine cells are revealed or a mine is uncovered.

## Implementation Details

- The game utilizes a `MineSweeper` class with methods for initializing the board, placing mines, revealing cells, and checking game completion.
- The program uses a hidden and a user board to differentiate between unrevealed and revealed cells.
- Players can enter coordinates to reveal cells, and the game provides feedback on adjacent mine counts.
- The game is won when all non-mine cells are revealed, and lost if a mine is uncovered.

## Usage

To play the MineSweeper game, run the `Main` class and follow the prompts to set up the board and make moves. The game will continue until completion, and the result will be displayed.


