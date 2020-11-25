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
	

	public static void main(String[] args){
	//Task 4.1	
	System.out.println(Bessie(10,7,"hello my name is Bessie and this is my essay"));
		
	}
	

}
