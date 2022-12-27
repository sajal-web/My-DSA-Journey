public class MethodOverriding{
    public static void main(String args[]){
        Deer d = new Deer();
        d.eat();// print the deer eat function
    }
}
class Animals{
    void eat(){
        System.out.print("Eat Everything...");
    }
}
// method overriding 
class Deer extends Animals{
    void eat(){// same function different definition...
        System.out.print("Eats Grass...");
    }
}