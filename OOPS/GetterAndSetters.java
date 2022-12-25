public class GetterAndSetters{
    public static void main(String args[]){
        BankAccountCreat newAcc = new BankAccountCreat();
        newAcc.setName("Sajal Mahata");
        System.out.print("Account holder name: "+newAcc.getName());
        newAcc.setPassword("Sajal");
        System.out.print("\nAccount holder password: "+newAcc.getPassword());
        newAcc.setAccnumber(123456789);
        System.out.print("\nAccount holder account number: "+newAcc.getAccnumber());
    }
}
class BankAccountCreat{
   public String name;
   private String password;
   public int accNumber;
    void setName(String newName){
        name = newName;
    }
    void setPassword(String newPassword){
        password = newPassword;
    }
    void setAccnumber(int newNumber){
        accNumber = newNumber;
    }
    // getters
    String getName(){
       return this.name ;
    }
  public  String getPassword(){
        return this.password;
    }
    int getAccnumber(){
        return this.accNumber;
    }
}