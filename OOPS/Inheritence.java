public class Inheritence{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
}
// Base class
class Animals{
    String color;
    void eat(){
        System.out.print("Eating");
    }
    void Sleep(){
        System.out.print("Sleeping");
    }
}
// Derived class
class Fish extends Animals{
    int fins;
    void swim(){
        System.out.print("Swiming in the water");
    }
}