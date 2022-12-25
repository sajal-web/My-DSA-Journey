public class classes_objects{
    // we have to create a public class as my file name
    public static void main(String args[]){
        Pen p1 = new Pen();//  created a pen object name p1
        p1.setColor("green");// we call . operator to set color
        System.out.print(p1.color);
        p1.setTip(5);
        System.out.print(p1.tip);
    }
}
class Pen{ // class name start with capital latter
    String color;
    int tip;
    void setColor(String newColor){ // set color function 
        color = newColor;
    }
    void setTip(int newTip){// set tip  function or method
        tip = newTip;
    }
}
