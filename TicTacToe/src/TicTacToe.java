import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[] board = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        var numberOfSquaresPlayed = 0;
        var whoseTurnItIs = 'x';
        var scanner = new Scanner(System.in);

        while (numberOfSquaresPlayed < 9) {
            printTheBoard(board);
            System.out.printf("Escolha um espaço para jogar %s: ", whoseTurnItIs);

            var input = scanner.nextInt();
            board[input - 1] = whoseTurnItIs;

            if ((board[0] + board[1] + board[2] == whoseTurnItIs * 3)
                    || (board[3] + board[4] + board[5] == whoseTurnItIs * 3)
                    || (board[6] + board[7] + board[8] == whoseTurnItIs * 3)
                    || (board[0] + board[3] + board[6] == whoseTurnItIs * 3)
                    || (board[1] + board[4] + board[7] == whoseTurnItIs * 3)
                    || (board[2] + board[5] + board[8] == whoseTurnItIs * 3)
                    || (board[0] + board[4] + board[8] == whoseTurnItIs * 3)
                    || (board[2] + board[4] + board[6] == whoseTurnItIs * 3)) {

                printTheBoard(board);
                System.out.println("Voce Ganhou! Parabéns!");
                break;
            } else {
                numberOfSquaresPlayed++;
                whoseTurnItIs = (whoseTurnItIs == 'x') ? 'o' : 'x';
            }

            if (numberOfSquaresPlayed == 9) {
                printTheBoard(board);
                System.out.println("Deu Empate!");
            }
        }

        scanner.close(); // <- fecha scanner
    } // <- fecha main

    private static void printTheBoard(char[] board) {
        System.out.println("" + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println(" - + - + - ");
        System.out.println("" + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println(" - + - + - ");
        System.out.println("" + board[6] + " | " + board[7] + " | " + board[8]);
    } // <- fecha printTheBoard
} // <- fecha classe TicTacToe
