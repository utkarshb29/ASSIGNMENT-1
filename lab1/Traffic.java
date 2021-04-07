package lab1;
import java.util.Scanner;
public class Traffic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("SELECT THE OPTION FROM 1-3");
	
	int x = sc.nextInt();
	switch(x) {
	case 1: System.out.println("GO");
	break;
	case 2: System.out.println("READY");
	break;
	case 3: System.out.println("STOP");
	break;
	default:System.out.println("INVALID INPUT"); 
	
		}

	
	}
}

