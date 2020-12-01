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

//Task 5.2
public static boolean rook(String start, String end){
    if(start.length() != 2 || end.length() != 2){return false;}
    if(start.charAt(0) != end.charAt(0)){
        if (start.charAt(1) != end.charAt(1)){return false;}
    }
    return true;
}
public static boolean bishop(String start, String end){
    if(start.length() != 2 || end.length() != 2){return false;}
    int a = 0;
    int b = 0;

    a = (int)end.charAt(0) - (int)start.charAt(0) + (int)end.charAt(1);
    b = (int)start.charAt(1);
    
    return a==b;
}
public static boolean queen(String start, String end){
    if(start.length() != 2 || end.length() != 2){return false;}
    int a = 0;

    a = (int)end.charAt(0) - (int)start.charAt(0) + (int)end.charAt(1) - (int)start.charAt(1);
    return a<=1;
}
public static boolean horse(String start, String end){
     if(start.length() != 2 || end.length() != 2){return false;}
     int a = 0;
     int b = 0;   
    a = Math.abs((int)end.charAt(0) - (int)start.charAt(0));
    b = Math.abs((int)end.charAt(1) - (int)start.charAt(1));
    
    if ((a == 1 && b == 2) || (a==2 && b==1)) return true;
    return false;
}
public static boolean pawn(String start, String end){
    if(start.charAt(0) != end.charAt(0)) return false;
    if(Math.abs((int)start.charAt(1) - (int)end.charAt(1)) != 1) return false;
    return true;
}
public static boolean canMove(String str,String start,String end){

    boolean flag = false;
    switch (str){
        case "Rook":{flag = rook(start,end); break;}
        case "Bishop":{flag = bishop(start,end); break;}
        case "Queen":{flag = queen(start,end); break;}
        case "Horse":{flag = horse(start,end); break;}
        case "Pawn":{flag = pawn(start,end); break;}
    }
    return flag;
}

public static void main(String[] args){

//Task 5.1
System.out.println("Task5.1");
System.out.println(Arrays.toString(encrypt("Hello")));
System.out.println(decrypt(encrypt("Hello") ));
//Task 5.2
System.out.println("Task5.2");
System.out.println(canMove("Rook", "A8", "H8"));
System.out.println(canMove("Bishop", "A7", "G1"));
System.out.println(canMove("Queen", "C4", "D6"));
//Task 5.3
System.out.println("Task5.3");
}



}