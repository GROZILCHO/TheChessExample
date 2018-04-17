public class Rock extends Piece{
    String name;

    public boolean isValidMove(Position newPosition){
        // First call the parent's method to check for the board bounds
        if(!super.isValidMove(newPosition)){
            return false;
        }
        // If we passed the first test then check for the specific rock movement
        if(newPosition.column == this.column || newPosition.row == this.row){
            return true;
        }
        else{
            return false;
        }
    }

    public Rock(){
        this.name = "rock";
    }
}