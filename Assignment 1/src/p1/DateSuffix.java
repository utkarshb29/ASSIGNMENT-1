package p1;
import java.util.Scanner;
public class DateSuffix {
public static void main(String[] args) {
	int a;
	System.out.println("Enter date");
	Scanner sc =new Scanner(System.in);
	a=sc.nextInt();
	if(a==1) {
		System.out.println("1st");
	}
	else if(a==2)
		System.out.println("2nd");
	else if(a==3)
		System.out.println("3rd");
	else if(a==21)
		System.out.println("21st");
	else if(a==22)
		System.out.println("22nd");
	else if(a==23)
		System.out.println("23rd");
	else if(a<31)
	{
		System.out.println("Suffixed Date =" + a +"th");
	}
	else {
		System.out.println("Enter a Valid Date!!!");
	}
}
}