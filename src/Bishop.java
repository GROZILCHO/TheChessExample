public class Bishop extends Piece {
    public boolean isValidMove(Position newPosition) {
        // First call the parent's method to check for the board bounds
        if(!super.isValidMove(newPosition)){
            return false;
        }

        if (Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row)){
            return true;
        } else {
            return false;
        }
    }
}
