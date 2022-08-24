import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     int num = in.nextInt();
		System.out.println("The next number for the number " + num + " is " + ++num);
		--num;
		System.out.println("The previous number for the number " + num + " is " + --num);
	}
}
