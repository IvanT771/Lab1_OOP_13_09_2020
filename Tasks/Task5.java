
import java.util.*;
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

//Task 5.3
public static boolean canComplete(String str1, String str2){
    
    int j = 0;
    for (int i = 0; i<str2.length();i++){
        if(str2.charAt(i) == str1.charAt(j)){
            j++;
        }
    }

    if(str1.length() == j){return true;}
    return false;
}
//Task 5.4
public static int sumDigProd(int... numbers){

    int sum = 0;
    for(int num:numbers){
        sum +=num;
    }
    int mult = 1;

    while(sum / 10 > 0){
        int c = sum;
        mult = 1;
        while (c % 10 > 0){
            mult*=c % 10;
            c = c / 10;
        }
        sum = mult;
    }
    return sum;
}

//Task 5.5
public static String sameVowelGroup(String... words){
    if(words.length < 1){return " ";}
    String glas = "aeoqiujy";
    String resultS = "";
    HashSet<String> sim = new HashSet<String>();
    for(int i=0; i<words[0].length();i++){
        if(  glas.indexOf(words[0].charAt(i)) != -1  ){
            sim.add(""+words[0].charAt(i));
        }
    }
List<String> list = new ArrayList<String>(sim);
Collections.sort(list);

  

    for(String word:words){
         HashSet<String> sim2 = new HashSet<String>();
        for(int i =0; i<word.length();i++){
            if( glas.indexOf(word.charAt(i)) != -1  ){
            sim2.add(""+word.charAt(i));
        }
        }
       List<String> list2 = new ArrayList<String>(sim2);
       Collections.sort(list2);

       if(list.equals(list2)){
           resultS+=word+" ";
       }
        
    }


return resultS;
}
//Task 5.6
public static boolean validateCard(String number){
    int len = number.length() - 1; //Step 1
    String numReverse = "";
    int flag = (int)number.charAt(len) - 48;


    for(int i = len-1; i>=0; i--){ //Step 2
        numReverse+=""+number.charAt(i);
    }

    int sum = 0;

    for(int i = 0; i<numReverse.length(); i++){ //Step 3
        int buf = (int)numReverse.charAt(i) - 48;

        if(buf % 2 != 0){
            buf*=2;
            if(buf / 10 > 0){
                buf = buf/10 + buf%10;
            }
        }
        sum+=buf; //Step 4
    }
    return (10 - (sum%10) == flag);
}
//Task 5.7


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
System.out.println(canComplete("butl", "beautiful" ));
System.out.println(canComplete("bbutl", "beautiful"));
//Task 5.4
System.out.println("Task5.4");
System.out.println(sumDigProd(16,28));
System.out.println(sumDigProd(0));
System.out.println(sumDigProd(1,2,3,4,5,6));
//Task 5.5
System.out.println("Task5.5");
System.out.println(sameVowelGroup("toe", "ocelot", "maniac" ));
System.out.println(sameVowelGroup("many", "carriage", "emit", "apricot", "animal" ));
System.out.println(sameVowelGroup("hops","chuff","bot","bottom"));
//Task 5.6
System.out.println("Task5.6");
System.out.println(validateCard("1234567890123456"));
System.out.println(validateCard("1234567890123452"));

}



}