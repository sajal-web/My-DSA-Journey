public class Static{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setSchoolName("ABC");
        System.out.println(s1.getSchoolName());
        Student s2 = new Student();// because i declare schoolname as school that's why all object have same schoolname
        System.out.println(s2.getSchoolName());
    }
}
class Student{
    static int returnResult(int phy, int chem, int math){
        return (phy + chem + math)/3;
    }
     String name;
     int roll;
     static String schoolName;
     String getSchoolName(){
         return this.schoolName;
     }
     void setSchoolName(String newName){
         this.schoolName = newName;
     }
}