import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the row count of the board: ");
        int rowCount = scan.nextInt();
        System.out.print("Enter the column count of the board: ");
        int columnCount = scan.nextInt();
        MineSweeper mine = new MineSweeper(rowCount,columnCount);

        mine.placeMines();
        mine.printBoard();
        boolean running = true;


        while( running) {

            System.out.print("Enter the row: ");
            int inputRow = scan.nextInt();
            System.out.print("Enter the column: ");
            int inputColumn = scan.nextInt();

            if (inputRow < 1 || inputRow > rowCount) {
                System.out.println("You entered an invalid row number.");
                continue;
            }
            if ( inputColumn < 1 || inputColumn > columnCount){
                System.out.println("You entered an invalid column value.");
                continue;
            }



            running = mine.choose(inputRow - 1, inputColumn - 1);
            if (mine.isCompleted()){
                System.out.println("You won the game.");
                break;
            }

            if (running) {
                mine.printBoard();


            }else{
                System.out.println("You lost the game!");
                mine.printBoard2();
            }
        }
    }

}
