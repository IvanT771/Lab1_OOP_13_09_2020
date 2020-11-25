import java.util.Arrays;
public class Task3{

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
    public static boolean isValidHexCode(String str){
        if(str.length() != 7 || str.charAt(0) != '#'){return false;}
        str = str.toUpperCase();
        for(int i=1; i<str.length();i++){
            if(
                !(
                (str.charAt(i) >= '0' && str.charAt(i) <= '9') ||
                (str.charAt(i)>='A' && str.charAt(i)<='Z')
                )
              ){return false;}
        }
        return true;
    }

    //Task 3.6
    public static int count(int[] mas){
        if(mas.length == 1){return 1;}
        if(!(mas.length >=2)){return 0;}
        int buf = 1;
        for(int i=1;i<mas.length;i++){
            if(mas[i-1] != mas[i]){
                buf++;
            }
        }
        return buf;
    }
    public static boolean same(int[] mas1, int[] mas2){
        
        Arrays.sort(mas1);
        Arrays.sort(mas2);

       return (count(mas1) == count(mas2));

        
    }

    //Task 3.7
    
    public static boolean isKaprekar(int n){
        int a = n*n;
        int b = 0;
        int c = 0;
        String str = Integer.toString(a);
        String num = "0";
        for(int i = 0; i<(int)(str.length()/2); i++){
            num+=str.charAt(i);
        }
        b = Integer.parseInt(num.trim());
        num = "0";
        for(int i = (int)str.length()/2; i<str.length(); i++){
            num+=str.charAt(i);
        }
        c= Integer.parseInt(num.trim());
        num = "0";
        if(b+c == n){return true;}
        return false;
    }


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
        //Task 3.5
        System.out.println(isValidHexCode("#CD5C5C"));
        System.out.println(isValidHexCode("#CD5C58C"));
        //Task 3.6
        int[] a = {2,3,4};
        int[] b = {1,2,3,3,1};
        System.out.println(same(a, b));
        //Task 3.7
        System.out.println(isKaprekar(3));
        System.out.println(isKaprekar(297));
    }



}