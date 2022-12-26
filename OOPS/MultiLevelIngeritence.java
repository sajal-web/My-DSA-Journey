public class MultiLevelIngeritence{
    public static void main(String  args[]){
        DOg dubby = new DOg();
        dubby.eat();
        dubby.legs = 5;
        System.out.print("\n"+dubby.legs);
    }
}
// Base class
class Animals{
    String color;
    void eat(){
        System.out.print("Eating..");
    }
    void breath(){
        System.out.print("Breathing...");
    }

}
// Derived class
class Mammals extends Animals{
    int legs;
}
// Derived class
class DOg extends Mammals{
    String breed;
}