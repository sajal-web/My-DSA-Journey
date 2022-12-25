public class ShallowAndDeep{
    public static void main(String args[]){
        Student myStdn = new Student();
       myStdn.name = "sajal";
        myStdn.roll = 3390;
        myStdn.marks[0]= 100;
        myStdn.marks[1]= 90;
        myStdn.marks[2]=80;
        Student herStdn = new Student(myStdn);
        herStdn.password = "HerPassword";
        myStdn.marks[2]=10;
        for(int i =0;i<3;i++){
            System.out.print(herStdn.marks[i]+" ");
        }
    }
}
class Student{
    String name ;
    int roll;
    String password;
    int marks[];
    Student(){
        marks = new int[3];
    }
    // Shallow copy constructor--> here we copy the references we don't make any new object we don't make a new
    // marks array, name , roll 
            // Student(Student myStdn){
            //     marks = new int[3];
            //     this.name = myStdn.name;
            //     this.roll = myStdn.roll;
            //     this.marks = myStdn.marks;

            // }
    // Deep Copy constructor--> in this copy we make new objects
    Student(Student myStdn){
         marks = new int[3];
                this.name = myStdn.name;
                this.roll = myStdn.roll;
                for(int i =0;i<3;i++){
                    this.marks[i]=myStdn.marks[i];
                }

    }

}
