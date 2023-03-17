import java.util.Scanner;
public class Q14 
{
	public static void main (String [ ] args) {
		
		Scanner sc = new Scanner (System.in);
		int a,b;
		System.out.println("entier a:");
	a = sc.nextInt();
	System.out.println("entier b:");
	b = sc.nextInt();
	int t = a;
	a = b;
	b = t;
	System.out.println("entier a:" + a );
	System.out.println("entier a:" + b);
	
	}
}
	