public class AbstractClass{
    public static void main(String args[]){
        Robot r = new Robot();
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.print("Animal constructor called...");
        color = "Brown";
    }
        void eat(){
            System.out.print("Animal eat....");
        }
        // abstract void walk(){
            // getting error because abstract method  cannot have a body... 
        // }
        abstract void walk();
        // ekhane walk namer function ta animal er opor depend korba na animal only akta idea dia diccha
        // j walk namer akta function thakba jtar return type hba void abar atak nijar moto kore koreee
        //  naw
}
class Human extends Animal{
    Human(){
        System.out.print("\nHuman constructor called...");
    }
    // Human have to abstract and override the method walk() if not than we will get error...
    void walk(){
        System.out.print("Walk using 2 legs...");
    }
    void changeColor(){
        color = "White_Brown";
        System.out.print(color);
    }
}
class Robot extends Human{
    Robot(){
        System.out.print("\nRobot constructor called...");
    }
}