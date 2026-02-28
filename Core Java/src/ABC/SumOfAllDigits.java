package ABC;
import java.util.*;

public class SumOfAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0) {
			sum += num%10 ;
			num = num/10;
		}
		System.out.println(sum);

	}

}

//\emph{empathize}, \emph{define}, \emph{ideate}, \emph{prototype}, and \emph{test}
