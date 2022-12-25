public class AccessModifiers{
    public static void main(String args[]){
    BankAccount myAcc = new BankAccount();
    myAcc.userName = "sajal";
    //myAcc.password = "sss";// getting error because password has private acccess in BankAccount
    myAcc.setPassword("sajal");
   // System.out.print(myAcc.password);// getting error to fetch password because password has private access
    }
}
class BankAccount{
    public  String userName;
    private String password;
    // to change password here i can made a function 
   public void setPassword(String newPassword){
        password = newPassword;
    }



}