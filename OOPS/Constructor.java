public class Constructor{
    public static void main(String args[]){
        Pen p1 = new Pen();
    }
}
class Pen{
    int tip;
    String color;
    Pen(){
        System.out.print("Default Constructor");
        System.out.print("Constructor is called..");
    }
}