import java.util.Arrays;
class Task5{

//Task 5.1
public static String decrypt(int[] crypt){

    if(!(crypt.length >0)){return null;}

    String result = "";
    int num = 0;//пред символ

    for(int i = 0; i < crypt.length; i++){
        result+=""+ (char)(crypt[i]+num);
        num = crypt[i]+num;
    }
    return result;
}
public static int[] encrypt(String str){

   if(!(str.length()>0)){return null;}

   int[] result = new int[str.length()];

   int num = 0; //Предыдущий символ
   for(int i = 0; i<str.length(); i++){
       result[i] = ((int)str.charAt(i)) - num;
       num = (int)str.charAt(i);
   }

return result;
}

public static void main(String[] args){

//Task 5.1
System.out.println("Task5.1");
System.out.println(Arrays.toString(encrypt("Hello")));
System.out.println(decrypt(encrypt("Hello") ));
//Task 5.2
System.out.println("Task5.2");
}



}