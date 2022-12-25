public class TypesOfConstructor{
    public static void main(String args[]){
        Door myDoor = new Door();// Constructor overloading here we can see polymorphism 
        Door saptarshiDoor = new Door("Green");
        
    }
}
class Door{
    String color;
    int length;
    float height;

    Door(){// this is non parameaterized constructor..
        System.out.print("THis is a default white color door...");
    }
    Door(String color){// This is parameaterized constructor...
         System.out.print("\nThis is custom "+color+" door...");
    }

}