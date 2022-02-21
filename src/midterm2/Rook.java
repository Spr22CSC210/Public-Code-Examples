package midterm2;

public class Rook extends Piece {

    public Rook(int row, int column) {
        super(row, column);
    }

    public boolean moveValid(int row, int column) {
        boolean sameRow = this.getRow() == row;
        boolean sameColumn = this.getColumn() == column;
        boolean sameSpot = sameRow && sameColumn;
        return sameRow || sameColumn && !sameSpot;
    }

}
