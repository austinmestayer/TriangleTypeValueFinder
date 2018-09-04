import java.util.Scanner;
public class dataparse {

	public static void main(String[] args) {
		String Adjacent;
		String Hypotenuse;
		String Opposite;
		String a = "______________________________________";
		
		System.out.println("Recommended use 'sqrt' before square root symbols for simplicity.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is Adjacent?");
				Adjacent = sc.nextLine();
		System.out.println("What is Opposite?");
				Opposite = sc.nextLine();
		System.out.println("What is the Hypotenuse?");
				Hypotenuse = sc.nextLine();
				
				System.out.println("Thank you. Now processing...");
				
				System.out.println(a);
				
				System.out.println("Sin =	" + Opposite);
				System.out.println("	- ");
				System.out.println("	" + Hypotenuse);
				
				System.out.println(a);
				
				System.out.println("Cos =	" + Adjacent);
				System.out.println("	- ");
				System.out.println("	" + Hypotenuse);
				
				System.out.println(a);
				
				System.out.println("Tan =	" + Opposite);
				System.out.println("	- ");
				System.out.println("	" + Adjacent);
				
				System.out.println(a);
				
				System.out.println("Csc =	" + Hypotenuse);
				System.out.println("	- ");
				System.out.println("	" + Opposite);
				
				System.out.println(a);
				
				System.out.println("Sec =	" + Hypotenuse);
				System.out.println("	- ");
				System.out.println("	" + Adjacent);
				
				System.out.println(a);
				
				System.out.println("Cot =	" + Adjacent);
				System.out.println("	- ");
				System.out.println("	" + Opposite);
				
				System.out.println(a);
				
				
				
			
	}

}
