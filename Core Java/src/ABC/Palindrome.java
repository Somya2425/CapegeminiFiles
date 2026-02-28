package ABC;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num  =0;
		int rev =0;
		int d = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		d = num;
		while(num!=0) {
			d = num%10;
			rev = rev * 10 + d;
			num = num/10;
		}
		if(d==num) {
			System.out.println("palindrome");
		}
		else {
			System.out.println(" not palindrome");
		}

	}

}
