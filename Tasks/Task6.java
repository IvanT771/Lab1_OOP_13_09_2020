import java.util.*;
public class Task6{
    //Task5.1
    //Task5.2
    public static String translateWord(String word){

        String glas = "aeiouyAEIOUY";
        if(word.length() <= 0){return "";}
       
            if( glas.indexOf(word.charAt(0))  != -1){

                return (word+="yay");

            }else{
                for(int i=0; i<word.length();i++){
                    if(glas.indexOf(word.charAt(0)) == -1){
                        word = word.substring(1,word.length()) + word.substring(0,1);
                    }else{
                        return (word+="ay");
                    }
                }
        }
        return " ";
    }
    public static String translateSentence(String str){
        String result = "";
        for(String word:str.split(" ")){
            result+=translateWord(word)+" ";
        }
        return result;
    }
    //Task5.3
    public static boolean isNumericArray(String str) {
    if (str == null || str =="")
        return false;
    for (char c : str.toCharArray())
        if (c < '0' || c > '9')
            return false;
    return true;}
    public static boolean validColor(String str){

        if(str.indexOf("rgb") != 0){return false;}else{
            str = str.substring(3,str.length());

            String[] num =  str.split(",");
            if(num.length == 0){return false;}
            for(int i=0; i<num.length;i++){if(num[i].isEmpty()){return false;}}

            if(num[0].indexOf("(") !=0){return false;}
            num[0] = num[0].substring(1,num[0].length());
           
            if(num[num.length-1].indexOf(")") != num[num.length-1].length()-1){return false;}
            num[num.length-1] = num[num.length-1].substring(0,num[num.length-1].length()-1);
            

            for(int i=0;i<num.length;i++){
               if(isNumericArray(num[i])){
                   int c = Integer.parseInt(num[i]);
                   if(!(c>=0 && c<=255)){return false;}
               }else{
                   return false;
               }
            }
        }
        return true;
    }
    //Task5.4
    public static String stripUrlParams(String url, String... parametor){

        int startParam = url.indexOf("?"); //index input in start parametors
        if(startParam == -1){return url;}

        String param = url.substring(startParam+1, url.length());
        String result = url.substring(0,startParam+1);

       String[] par = param.split("&");
      HashSet<String> re = new HashSet<String>();

       for(int i=0; i<par.length;i++){
           for(int j=i+1; j<par.length;j++ ){
               if(par[i].charAt(0) == par[j].charAt(0)){
                   if(par[i].charAt(par[i].length()-1) < par[j].charAt(par[j].length()-1)){
                       par[i] = par[j];
                   }
               }
           }
           re.add(par[i]);
       }
       List<String> list = new ArrayList<String>(re);
       Collections.sort(list);
       
        for(String i:list){
            
            boolean flag = true;
            for(int j=0; j<parametor.length;j++){

                if(i.indexOf(parametor[j]) != -1){flag = false; break;}
            }

            if(flag){
          
            result+=i+"&";}

        }

        return result.substring(0,result.length()-1);
    }
    //Task5.5
    public static String getHashTags(String str){
        String result ="";
        String[] list = str.split(" ");

        Arrays.sort(list,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return (o2.length() - o1.length());
            }
        });

        for(int i =0; i<3;i++){
            result+="#"+list[i]+" ";
        }

        return result;
    }
    //Task5.6
    public static int ulam(int num){
        if (num<3){return -1;}
        ArrayList<Integer> ul = new ArrayList<Integer>();
        ul.add(1);
        ul.add(2);


        for(int i=3; i<=10000;i++){

            int count = 0;

            for(int j = 0; j<ul.size();j++){
                for(int k = j+1; k<ul.size();k++){

                    if(ul.get(j)+ul.get(k) == i){
                        count++;
                    }
                    if (count > 1)
                    break;
                }
                    if (count > 1)
                    break;
            }

            if(count == 1){
                ul.add(i);
                if(ul.size() >= num){
                    return (int)ul.get(ul.size()-1);
            }
            }
        }
        
        return -1;


    }
    //Task5.7
    //Task5.8

    public static String convertToRoman(int n){
        String result = "";
        int ten = n/10;
        for(int i=0; i<ten;i++){
            result+="X";
        }

        int ostatok = n%10;
   
            switch (ostatok){
                case (9):result+="IX"; break;
                case (8):result+="IIX"; break;
                case (7):result+="VII"; break;
                case (6):result+="VI"; break;
                case (5):result+="V"; break;
                case (4):result+="IV"; break;
                case (3):result+="III"; break;
                case (2):result+="II"; break;
                case (1):result+="I"; break;
                default: break;
            }
       
        

        return result;
    }


    //Task5.9
    //Task5.10

public static void main(String[] args){
//Task 5.1
//System.out.println("Task5.1");

//Task 5.2
System.out.println("Task5.2");
System.out.println(translateWord("flag"));
System.out.println(translateWord("Apple"));
System.out.println(translateWord("button"));
System.out.println(translateSentence("I like to eat honey waffles"));

//Task 5.3
System.out.println("Task5.3");
System.out.println(validColor("rgb(0,0,0)"));
System.out.println(validColor("rgb(0,,0)"));
System.out.println("Task5.3");

//Task 5.4
System.out.println("Task5.4");
System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2"));
System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2","b"));

//Task 5.5
System.out.println("Task5.5");
System.out.println(getHashTags("How the Avocado Became the Fruit of the Global Trade"));

//Task 5.6
System.out.println("Task5.6");
System.out.println(ulam(4));
System.out.println(ulam(9));
System.out.println(ulam(206));

//Task 5.7
System.out.println("Task5.7");
System.out.println(convertToRoman(2));
System.out.println(convertToRoman(12));
System.out.println(convertToRoman(16));

//Task 5.8
///System.out.println("Task5.8");

//Task 5.9
//System.out.println("Task5.9");

//Task 5.10
//System.out.println("Task5.10");


}
}
