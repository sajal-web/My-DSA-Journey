public class Interface{
    public static void main(String args[]){
        Rook r = new Rook();
        r.moves();                           
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.print("Can move UP/DOWN/LEFT/RIGHT/DIAGONAL(In all 4 Directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.print("Can move UP/DOWN/LEFT/RIGHT ");
    }
}