import java.util.Scanner;
public class Name
{
	public static void main(String[] x)
	{
		Scanner ip = new Scanner(System.in);
		String name;
		System.out.println("Enter your name");
		name = ip.nextLine();
		System.out.println("Your name : " + name);
	}
}