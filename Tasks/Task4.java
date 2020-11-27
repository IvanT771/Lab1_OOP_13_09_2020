import java.util.*;
class Task4{
	
	//Task 4.1
	public static String Bessie(int n, int k,String str){
	
	String newStr = "";
	String[] words = new String[n+1];
	int i = 0;
	for(String word: str.split(" ")){
		
		words[i] = word;
		i++;
	}
	int countStrLength = 0;
	for(int j = 0; j<n;j++){
		if(words[j].length()+countStrLength <=k){
		newStr+=words[j]+" ";
		countStrLength += words[j].length();
		
		}else{
		newStr+="\r\n";
		countStrLength = 0;
		newStr+=words[j]+" ";
		countStrLength += words[j].length();
		
		}
		
	}
	return newStr;	
	}
	//Task 4.2
	public static String split(String str){
	
	int count = 0;
	String newStr = "";
	for(int i=0;i<str.length();i++){
		if(str.charAt(i) == '('){
		count++;
		newStr+=str.charAt(i);}
		else{
		count--;
		newStr+=str.charAt(i);}
		if(count<=0)newStr+="\r\n";
		}
	     	return newStr;}
	//Task 4.3
	public static String toCamelCase(String str){
		String newStr = "";
		boolean flag = false;
		for(String word: str.split("_")){
			if(!flag) {newStr+=word.toLowerCase(); flag = true;}
			else {
			String s =""+word.substring(0,1).toUpperCase()+word.substring(1,word.length());
			newStr+=s;}
		}
		return newStr;
	}
	public static String toSnakeCase(String str){
	
	ArrayList<String> words = new ArrayList<String>();
	String byf = "";
	
	for(int i =0; i<str.length();i++){
		String s = str.substring(i,i+1).toUpperCase(); 
		if(str.charAt(i) != s.charAt(0)){
		byf+=str.charAt(i);
		}else{
		words.add(byf);
		byf=s.toLowerCase();
		}
	}
	words.add(byf);
	String newStr = "";
	
	for(String word:words){
	newStr+=word+"_";
	}
	return newStr.substring(0,newStr.length()-1);
	}
	
	//Task 4.4
	public static String overTime(double[] mas){
		double sum = 0;
		if(mas[0] - 17 <=0 && mas[1] -17 <=0){
		sum = Math.abs(mas[1] - mas[0]) * mas[2];}
		else if (mas[0] - 17 > 0 && mas[1] -17 >0){
		sum = Math.abs(mas[1] - mas[0]) * mas[2] * mas[3];}
		else if (mas[0] - 17 <=0 && mas[1]- 17 >0){
		sum = (17 - mas[0])*mas[2] + (mas[1] -17)*mas[2]*mas[3];}
		else if (mas[0] - 17 >0 && mas[1] -17 >0){
		sum = Math.abs(mas[1] - mas[0]) * mas[3]*mas[2];}
		String s = String.format("$%.2f",sum);
	return s;
	}
	
	//Task 4.5
	public static String BMI(String strMas, String strGrowth){
	String strResult = "";
	double mas = 0;
	double growth = 0;
	
	if(strMas.indexOf("pounds") != -1){
	mas = Double.parseDouble(strMas.split(" ")[0]) * 0.45f;
	}else{
	mas = Double.parseDouble(strMas.split(" ")[0]);}
	//System.out.println("mas = " + mas);
	
	if(strGrowth.indexOf("inches") != -1){
	growth = Double.parseDouble(strGrowth.split(" ")[0]) / 39.5f;}
	else{
	growth = Double.parseDouble(strGrowth.split(" ")[0]);}
	//System.out.println("growth = "+ growth);
	double result = mas/(growth*growth);
	result = Math.round(result*100) /10;
	result/=10;
	if(result < 18.5f){
	strResult = ""+result + " UnderWeigth";
	}else
	if(result < 24.9f){
	strResult =""+result + " NormalWeigth"; 
	}else{
	strResult = ""+result+ " OverWeigth";}
	
	return strResult;
	}
	
	//Task 4.6
	public static int bugger(int num){
	int count = 0;
	int buf = 0;
	int c = 1;
	while(num / 10 > 0){
		buf = num;
		 while (buf > 0){
		 	c*=buf%10;
		 	buf = buf / 10; 
		 }
		 count ++;
		 num = c;
		 c = 1;
	}
	return count;
	}
	
	//Task 4.7
	public static String toStarShorthand(String str){
	String strResult = "";
	int count = 0;
	for(int i=0; i<str.length();i++){
		count = 1;
		int curent = i;
			for(int j=i+1; j<str.length();j++){
			if(str.charAt(i) != str.charAt(j)){i = j-1; break;}
			else{count++;}
			}
		if(count>1){strResult+=""+str.charAt(curent)+"*"+count;}else{
		
		strResult+=""+str.charAt(curent);}
	}
	return strResult;
	}

	public static void main(String[] args){
	//Task 4.1
	System.out.println("Task 4.1");	
	System.out.println(Bessie(10,7,"hello my name is Bessie and this is my essay"));
	//Task 4.2
	System.out.println("Task 4.2");
	System.out.println(split("(())(())((()))"));
	System.out.println(split("((()))(())()()(()())"));	
	//Task 4.3
	System.out.println("Task 4.3");
	System.out.println(toCamelCase("hello_edabit"));
	System.out.println(toSnakeCase("helloEdabit"));
	//Task 4.4
	System.out.println("Task 4.4");
	double a[] = {9,17,30,1.5f};
	double b[] = {16,18,30,1.8f};
	double c[] = {13.25f,15,30,1.5f};
	System.out.println(overTime(a));
	System.out.println(overTime(b));
	System.out.println(overTime(c));
	//Task 4.5
	System.out.println("Task 4.5");
	System.out.println(BMI("55 kilos", "1.65 metrs"));
	System.out.println(BMI("205 pounds", "73 inches"));
	System.out.println(BMI("154 pounds", "2 meters"));
	//Task 4.6
	System.out.println("Task 4.6");
	System.out.println(bugger(39));
	System.out.println(bugger(4));
	System.out.println(bugger(999));
	//Task 4.7
	System.out.println("Task 4.7");
	System.out.println(toStarShorthand("abbccc"));
	System.out.println(toStarShorthand("77777geff"));
	System.out.println(toStarShorthand("abc"));
	
	}
	

}
