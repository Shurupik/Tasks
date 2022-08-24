import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	    
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть перший катет: ");
        int num = in.nextInt();
        System.out.print("Введіть другий катет: ");
        int num2 = in.nextInt();
        double g = Math.sqrt(num*num+num2*num2);
        System.out.println("Гіпотенуза = " + g);

	}

}
