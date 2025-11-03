public class TicTacToe {
    public static void main(String[] args) {
        char[] board = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        var numberOfSquaresPlayed = 0;
        var whoseTurnItIs= 'x';
        while (numberOfSquaresPlayed < 9)
        {
            printTheBoard(board);
            System.out.printf("Choose a square player %s:", whoseTurnItIs);

            var scanner = new java.util.Scanner(System.in);
            var input = scanner.nextInt();

            board[input-1] = whoseTurnItIs;
        }
    }

    private static void printTheBoard(char[] board) { // Imprime a tabela
        System.out.println( board[0] + " | " +  board[1] + " | " + board[2]);
        System.out.println( " - + - + - " );
        System.out.println( board[3] + " | " +  board[4] + " | " + board[5]);
        System.out.println( " - + - + - " );
        System.out.println( board[6] + " | " +  board[7] + " | " + board[8]);
    }
}
// Step 4