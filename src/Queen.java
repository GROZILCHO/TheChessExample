public class Queen extends Piece {
    public String name;

    @Override public boolean isValidMove(Position newPosition){
        // First call the parent's method to check for the board bounds
        if(!super.isValidMove(newPosition)){
            return false;
        }
        if ((newPosition.column == this.column || newPosition.row == this.row)||
                (Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row))){
            return true;
        }
        return false;
    }

    Queen(){
        super();
        this.name = "queen";
    }
}
