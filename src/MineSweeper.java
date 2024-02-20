import java.util.Random;

public class MineSweeper {
    int rowCount;
    int columnCount;
    String[][] hiddenBoard;
    String[][] userBoard;


    MineSweeper(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.hiddenBoard = new String[rowCount][columnCount];
        this.userBoard = new String[rowCount][columnCount];
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                this.hiddenBoard[row][column] = "-";
                this.userBoard[row][column] = "-";
            }
        }
    }


    void printBoard() {
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                System.out.print(" " + this.userBoard[row][column]);

            }
            System.out.println();
        }

    }


    void printBoard2() {
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                System.out.print(" " + this.hiddenBoard[row][column]);

            }
            System.out.println();
        }

    }

    boolean choose(int row, int column) {
        if (this.hiddenBoard[row][column].equals("*"))
            return false;


            int mineCount = 0;
            for (int dx = -1; dx <= 1; dx++) {
                if ((column + dx >= 0) && (column + dx < columnCount)) {
                    for (int dy = -1; dy <= 1; dy++) {
                        if ((row + dy >= 0) && (row + dy < rowCount) && !((dx == 0) && dy == 0)) {
                            if (hiddenBoard[row + dy][column + dx].equals("*")) {
                                mineCount++;
                            }


                        }
                    }

                }
            }

            this.userBoard[row][column] = Integer.toString(mineCount);


        return true;
    }


    boolean isCompleted() {
        int count = 0;
        for (int row = 0; row < rowCount; row++)
            for (int column = 0; column < columnCount; column++) {
                if (this.userBoard[row][column].equals("-")) {
                    count++;
                }
            }
        return count == (rowCount * columnCount) / 4;
    }


    void placeMines() {
        Random ran = new Random();

        for (int i = 0; i < (rowCount * columnCount) / 4; i++) {
            int ran1;
            int ran2;

            do {
                ran1 = ran.nextInt(this.rowCount);
                ran2 = ran.nextInt(this.columnCount);

            } while (this.hiddenBoard[ran1][ran2].equals("*"));


            this.hiddenBoard[ran1][ran2] = "*";
        }
    }
}




