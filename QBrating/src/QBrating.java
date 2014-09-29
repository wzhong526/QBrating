import java.util.Scanner;
public class QBrating {
	public static void main(String[] args){
		
		Scanner user_input = new Scanner(System.in); 
		
		double TD;
		double Yards;
		double INT;
		double comp;
		double ATT;
		double a;
		double b;
		double c;
		double d;
		double w;
		double x;
		double y;
		double z;
		double rating;
		
		System.out.print("How many touchdowns?");
		TD = user_input.nextInt();
		
		System.out.print("How many yards?");
		Yards = user_input.nextInt();
		
		System.out.print("How many interceptions?");
		INT = user_input.nextInt();
		
		System.out.print("How many completions?");
		comp = user_input.nextInt();
		
		System.out.print("How many attempts?");
		ATT = user_input.nextInt();
		
		
		a = (((comp/ATT)-.3)*5);
		b = (((Yards/ATT)-3)*.25);
		c = ((TD/ATT)*20);
		d = (2.375-((INT/ATT)*25));
		{if (a < 0) {
			w = 0;
		}
		else if (a > 2.375) {
			w = 2.375;
		}
		else {
			w = a;
		}}
		{if (b < 0) {
			x = 0;
		}
		else if (b > 2.375) {
			x = 2.375;
		}
		else {
			x = b;
		}}
		{if (c < 0) {
			y = 0;
		}
		else if (c > 2.375) {
			y = 2.375;
		}
		else {
			y = c;
		}}
		{if (d < 0) {
			z = 0;
		}
		else if (d > 2.375) {
			z = 2.375;
		}
		else {
			z = d;
		}}
		rating = (((w+x+y+z)/6)*100);
				
		System.out.println("The QB rating is " + rating);
	}
}
