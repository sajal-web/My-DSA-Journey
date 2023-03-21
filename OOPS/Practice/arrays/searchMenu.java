public class searchMenu{
    public static void main(String args[]){
        String menu[] = {"samosa","chole batore","chowmin","toast"};
       System.out.print(menufound(menu,"saosa"));
       
    }
     static String menufound(String menu[],String key){
        for(int i = 0;i<menu.length;i++){
            if(menu[i] == key){
                return menu[i];
            }
        }
    return "not found";
    }
}