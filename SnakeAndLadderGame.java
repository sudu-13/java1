import java.util.Scanner;

public class SnakeAndLadderGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the board
        String[][] board = new String[10][10];
        for (int i = 0; i < 10; i++) {
            board[i] = scanner.nextLine().split(" ");
        }

        // Read the die inputs
        String[] dieInputs = scanner.nextLine().split(" ");

        // Process the board and count snakes and ladders
        int snakes = 0;
        int ladders = 0;
        int currentPosition = 1;

        for (String dieInput : dieInputs) {
            int die = Integer.parseInt(dieInput);
            int nextPosition = currentPosition + die;

            if (nextPosition <= 100) {
                String cell = board[9 - (nextPosition - 1) / 10][(nextPosition - 1) % 10];
                if (cell.startsWith("S(")) {
                    currentPosition = Integer.parseInt(cell.substring(2, cell.length() - 1));
                    snakes++;
                } else if (cell.startsWith("L(")) {
                    currentPosition = Integer.parseInt(cell.substring(2, cell.length() - 1));
                    ladders++;
                } else {
                    currentPosition = nextPosition;
                }
            }

            if (currentPosition == 100) {
                System.out.println("Possible " + snakes + " " + ladders);
                return;
            }
        }

        System.out.println("Not possible " + snakes + " " + ladders + " " + currentPosition);
    }
}
