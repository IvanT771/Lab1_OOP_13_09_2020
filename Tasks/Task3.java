import java.util.Arrays;
public class Task2{

//Task 3.1 
    public static int solutions(double a,double b,double c){

        double d = b*b - 4*a*c;
        if (d<0){return 0;}
        if(d==0){return 1;}
        return 2;
        
    }

    //Task 3.2
    public static int findZip(String str){

        String find = "zip";
        if(!(str.contains(find))){return -1;}
        int index = str.indexOf(find) + find.length();
        return str.indexOf(find,index);
    }

    //Task 3.3
    public static boolean checkPerfect(int number){
       int sum = 0;
        for(int i=number-1; i>0;i--){
            if(number % i == 0){
               sum+=i;
            }
        }
        if(sum==number){return true;}
        return false;
    }

    //Task 3.4
    public static String flipEndChars(String str){

        if(str.length() <= 2){return "incompatible";}
        if(str.charAt(0) == str.charAt(str.length()-1)){return "Two's a pair.";}
        int rnd = 33+(int)(Math.random()*126);
        String strNew = ""+(char)rnd;
        for (int i=1; i<str.length()-1;i++){
            strNew+=str.charAt(i);
        }
        rnd = 33+(int)(Math.random()*126);
        strNew+=(char)rnd;
        return strNew;
    }

    //Task 3.5



    public static void main(String[] args) {

        //Task 3.1
        System.out.println(solutions(1,0,-1));
        //Task 3.2
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(findZip("all zip files are compressed"));
        //Task 3.3
        System.out.println(checkPerfect(6));
        //Task 3.4
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(flipEndChars("ada"));
        System.out.println(flipEndChars("z"));
    }



}