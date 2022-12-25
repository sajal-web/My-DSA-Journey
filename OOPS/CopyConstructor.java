// ekta object er sb properties onny object a copy kore fela hlo copy constructor er kaj
public class CopyConstructor{
    public static void main(String args[]){
        Student myStdn = new Student();
        myStdn.name = "sajal";
        myStdn.roll = 3390;
        myStdn.marks[0]= 100;
        myStdn.marks[1]= 90;
        myStdn.marks[2]=80;
        Student herStdn = new Student(myStdn);
        herStdn.password = "HerPassword";
        myStdn.marks[2]=100;
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
    // copy constructor
    Student(Student myStdn){
        marks = new int[3];
        this.name = myStdn.name;
        this.roll = myStdn.roll;
        this.marks = myStdn.marks;

    }
}