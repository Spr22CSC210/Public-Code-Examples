package midterm4;

public class Queens {

    private static final int BOARD_SIZE = 8;

    public static void main(String[] args) {
        Board board = new Board(BOARD_SIZE);

        System.out.println(queens(board, 8, 0));

        System.out.println(board);
    }

    private static boolean queens(Board board, int numQueens, int col) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(board);
        if (numQueens == 0) {
            return true;
        } else {
            for (int i = 0; i < BOARD_SIZE; i++) {
                if (board.isSafe(i, col)) {
                    board.place(i, col);
                    if (queens(board, numQueens - 1, col + 1)) {
                        return true;
                    }
                    board.remove(i, col);
                }
            }
            return false;
        }
    }
}
