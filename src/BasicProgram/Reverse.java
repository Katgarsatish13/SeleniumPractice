package BasicProgram;

public class Reverse {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int rev = 0;
		int n=120;
		while(n>0)
		{
			rev=0*10;
			rev=n/10;
			n=n/10;
		}
		System.out.println("reverse no is "+ rev);
	}

}
