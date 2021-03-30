package p1;
import java.util.Scanner;
public class DemoOne {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter Marks obtained in English");
	int EnglishMarks = sc.nextInt();
	
	System.out.println("Enter Marks Obtained in Java");
	int Java=sc.nextInt();
	
	System.out.println("Enter Marks Obtained in DB");
	int DB=sc.nextInt();
	
	System.out.println("Enter Marks Obtained in SpringTools");
	int SpringTools=sc.nextInt();
	int TotalMarks= (EnglishMarks+Java+DB+SpringTools);
	float Average=((TotalMarks/4));
	System.out.println("Total Marks="+TotalMarks);
	System.out.println("Average="+Average);
	
	}
}

