public class Main {
    public static void main(String[] args){
        Game game = new Game();
        Piece piece = new Piece();
        Rock rock = new Rock();
        Queen queen = new Queen();
        Bishop bishop = new Bishop();

        Position testPosition = new Position(0,1);

        if(queen.isValidMove(testPosition)){
            System.out.println("Yes, I can move there.");
        }
        else{
            System.out.println("Nope, can't do!");
        }
    }
}
