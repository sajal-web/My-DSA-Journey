public class OopsConcept{
    public static void main(String args[]){
            Pen p1 = new Pen();
            p1.setColor("blue");
            System.out.print(p1.color);
    }
   static class Pen{
        int thickNess;
        String color;
        void  setThickness(int thick){
            thickNess = thick;
        }
        void  setColor(String col){
            color = col;
        }
    }
}