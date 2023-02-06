public class removeDublicate{
    public static void main(String args[]){
      
        String str = "aabbccdddddeeefffffff";
        removeDublicateFun(str,0,new StringBuilder(""),new boolean[26]);
    }
    public static void removeDublicateFun(String str,int idx, StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.print(newStr);
            return;
        }
        // kaj
        char curChar = str.charAt(idx);
        // check if it is alrady tru in map or not
        if(map[curChar - 'a'] == true){
            removeDublicateFun( str, idx+1, newStr, map);

        }else{
            map[curChar-'a'] = true;
            removeDublicateFun(str,idx+1,newStr.append(curChar),map);
        }
    }
}