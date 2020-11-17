
public class Main {
	//Task 1.1
	public static int remainder(int a,int b) {
		
		return a%b;
	}
	//Task1.2
	public static float triArea(int a,int h) {
		return (0.5f*a*h);
	}
	//Task1.3
	public static int animals(int chikens,int cows,int pigs) {
		return (chikens*2+cows*4+pigs*4);
	}
	//Task1.4
	public static boolean profitableGamble(float prob,float prize,float pay) {
		if (prob*prize<pay)return false;
		return true;		
	}
	//Task1.5
	public static String operation(int N,int a,int b) {
		if(a*b == N) return "multiplay";
		if(a/b == N || b/a == N) return "division";
		if(a+b==N)return "add";
		if(a-b ==N || b-a == N) return "subtracted";
		return "none";
	}
	//Task1.6
	public static int ctoa(char a) {
		return (int)a;
	}
	//Task1.7
	public static int addUpTo(int a) {
		int sum = 0;
		for (int i=1; i<=a;i++) {
			sum+=i;
		}
		return sum;
	}
	//Task1.9
	public static int sumOfCubes(int[] a) {
		int sum = 0;
		
		for(int i=0; i<a.length;i++) {
			sum=sum+(a[i]*a[i]*a[i]);
		}
		return sum;
	}
	//Task 1.8
	public static int nextEdge(int a, int b){

		return ((a+b)-1);
	}
	//Task 1.10
	public static boolean abcmath(int a,int b,int c){
		a = (int)(a*Math.pow(2,b));
		if (a%c==0) return true;
		return false;
	}
	public static void main(String[] args) {
		//Task1.1
		System.out.println("Task1.1");
		System.out.println(remainder(1, 3));
		System.out.println(remainder(3, 4));
		System.out.println(remainder(-9, 45));
		System.out.println(remainder(5, 5));
		
		//Task1.2
		System.out.println("Task1.2");
		System.out.println(triArea(3, 2) );
		System.out.println(triArea(7, 4) );
		System.out.println(triArea(10, 10));
		
		//Task1.3
		System.out.println("Task1.3");
		System.out.println(animals(2, 3, 5));
		System.out.println(animals(1, 2, 3));
		System.out.println(animals(5, 2, 8));
		
		//Task1.4
		System.out.println("Task1.4");
		System.out.println(profitableGamble(0.2f, 50f, 9f));
		System.out.println(profitableGamble(0.9f, 1f, 2f));
		System.out.println(profitableGamble(0.9f, 3f, 2f));
		
		//Task1.5
		System.out.println("Task1.5");
		System.out.println(operation(24, 15, 9));
		System.out.println(operation(24, 26, 2));
		System.out.println(operation(15, 11, 11));
		
		//Task1.6
		System.out.println("Task1.6");
		System.out.println(ctoa('A'));
		System.out.println(ctoa('m'));
		System.out.println(ctoa('['));
		System.out.println(ctoa('\\'));
		
		//Task1.7
		System.out.println("Task1.7");
		System.out.println(addUpTo(3));
		System.out.println(addUpTo(10));
		System.out.println(addUpTo(7));

		//Task1.8
		System.out.println(nextEdge(8,10));

		//Task1.9
		int[] b = {1,5,9};
		System.out.println(sumOfCubes(b));

		//Task 1.10
		System.out.println(abcmath(42,5,10));
		
	}

}
