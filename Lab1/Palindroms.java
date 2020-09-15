public class Palindroms{

    public static String reverseString(String str){

        String s = "";

        for (int i=str.length()-1; i>=0;i--){
            s+=str.charAt(i);
        }
        return s;
    }

    public static boolean isPalindrome(String str){

        if (str.equals(reverseString(str))){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        String s = "";
        for(int i=0;i<args.length;i++){
           
            s = args[i];
          
                if(isPalindrome(s)){
                    System.out.println(" "+ s +" -YES");
                }else{
                    System.out.println(" "+s+" -NO");
                }
                s="";
            }
            
        

    }

}