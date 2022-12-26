public class HybridInheritence{
    public static void main(String args[]){
        Dog doggy = new Dog();
        doggy.eat();

    }
}
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
// Derived from FIsh
class Shark extends Fish{ 
    void shark(){
    System.out.print("THis is shark");
    }

}
// Derived class
class Bird extends Animals{
    int fings;
    void fly(){
        System.out.print("Flying...");
    }
    
}
// Derived from Bird
class Peackok{
     void peackok(){
    System.out.print("THis is Peackok...");
    }

}
// Derived class
class Human extends Animals{
    int legs;
    void walk(){
        System.out.print("Walking ....");
    }
}
// Derived from Human
class Dog extends Human{
   void dog(){
    System.out.print("THis is DOg...");
    }

}