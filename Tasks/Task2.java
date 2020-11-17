import java.util.Arrays;
public class Task2{

    //Task 2.1
    public static String repeat(String str,int count){
        String newStr = "";
        for(int i=0; i < str.length(); i++){
            for(int j=0; j<count; j++){
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    //Task 2.2
    public static int differenceMaxMin(int[] mas){
        
        if(!(mas.length >=2)){return 0;}
        int maxNumber = mas[0];
        int minNumber = mas[1];

        for(int i=0;i<mas.length;i++){
            if(mas[i]>maxNumber){maxNumber=mas[i];}
            if(mas[i]<minNumber){minNumber=mas[i];}
        }
        return maxNumber-minNumber;
    }

    //Task 2.3
    public static boolean isAvgWhole(int[] mas){
        int sum = 0;
        for(int i=0;i<mas.length;i++){
            sum+=mas[i];
        }
        if(sum % 2 == 0){return true;}
        return false;
    }
    //Task 2.4
    public static int[] cumulativeSum(int[] mas){

        int[] newMas = new int[mas.length];
        for(int i =0; i<newMas.length;i++){newMas[i]=0;}

        for(int i = 0;i<mas.length;i++){
            for(int j=i; j>=0;j--){
                newMas[i]+=mas[j];
            }
        }

        return newMas;
    }

    //Task 2.5
    public static int getDecimalPlaces(String str){
        int count = 0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) == '.'){return count;}
            count++;
        }
        return 0;
    }
    //Task 2.6
    public static int Fibonacci(int a){

        int[] mas = new int[a];
        if(a<1){return 1;}
        mas[0] = 1;
        mas[1] =2;
        for(int i=1; i<a-1;i++){
            mas[i+1] = mas[i-1]+mas[i];
        }
        return mas[a-1];
    }

    //Task 2.7
    public static boolean isValid(String str){

        if(str.length()>5){return false;}
        for(int i=0; i<str.length();i++){
            if(!(str.charAt(i) >= '0' && str.charAt(i) <='9')){return false;}
        }
        return true;
    }
    //Task 2.8
    public static boolean isStrangePair(String str1, String str2){
        if(str1.length()<2 || str2.length()<2){return false;}
        if(!(str1.charAt(0) == str2.charAt(str2.length()-1) && str1.charAt(str1.length()-1) == str2.charAt(0))) {return false;}
        return true;
    }
    //Task 2.9
    public static boolean isPrefix(String str1,String str2){
        if(str2.charAt(str2.length()-1) != '-' || str2.length()<2 ){return false;}
        str2 = str2.replaceAll("-","");
        if(str1.indexOf(str2) == 0){return true;}
        return false;
    }
    public static boolean isSuffix(String str1,String str2){
        if(str2.charAt(0) != '-' || str2.length()<2 ){return false;}
        str2 = str2.replaceAll("-","");
        if(str1.indexOf(str2) == str1.length() - str2.length()){return true;}
        return false;
    }

    //Task 2.10
    public static int boxSeq(int step){
        int curentStep = 0;
        boolean isStep = false;
        for(int i=0;i<step;i++){
            if(isStep){
                curentStep+=3;
            }else{
                curentStep--;
            }
            isStep=!isStep;
        }
        return curentStep;
    }

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

        //Task 2.1
        System.out.println(repeat("abc",5));
        //Task 2.2
        int[] a = {1,2,3};
        System.out.println(differenceMaxMin(a));
        //Task 2.3
        System.out.println(isAvgWhole(a));
        //Task 2.4
        int[] b = cumulativeSum(a);
        System.out.println(Arrays.toString(b));
        //Task 2.5
        System.out.println(getDecimalPlaces("400.2"));
        //Task 2.6
        System.out.println(Fibonacci(12));
        //Task 2.7
        System.out.println(isValid("59001"));
        System.out.println(isValid("853 7"));
        //Task 2.8
        System.out.println(isStrangePair("ratio","orator"));
        //Task 2.9
        System.out.println(isPrefix("automation","auto-"));
        System.out.println(isSuffix("arachnophobia","-phobia"));
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