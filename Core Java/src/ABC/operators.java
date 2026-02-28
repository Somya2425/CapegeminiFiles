package ABC;
import java.util.Scanner;
public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int ans = n / 10;
        System.out.println("Number after removing the last digit is: "+ans);
        
	}

}
