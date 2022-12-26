public class HierarchialInheritence{
    public static void main(String args[]){
        Human saptarshi = new Human();
            saptarshi.eat();
        
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
class Fish extends Animals{
    int fins;
    void swim(){
        System.out.print("Swiming....");
    }
}
// Derived class
class Bird extends Animals{
    int fings;
    void fly(){
        System.out.print("Flying...");
    }
    
}
// Derived class
class Human extends Animals{
    int legs;
    void walk(){
        System.out.print("Walking ....");
    }
}