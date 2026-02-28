package ABC;
import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter length of first array");
		int n1 = sc.nextInt();
		int[] a1 = new int[n1];
		System.out.println("Enter elements");
		for(int i = 0; i<n1; i++) {
			a1[i] = sc.nextInt();
		}
		System.out.println("Enter length of second array");
		int n2 = sc.nextInt();
		int[] a2 = new int[n2];
		System.out.println("Enter elements");
		for(int i = 0; i<n2; i++) {
			a2[i] = sc.nextInt();
		}
		boolean ans = true;
		if(n1!=n2) {
			ans = false;
		}
		for(int i =0; i<n1; i++) {
			if(a1[i] != a2[i]) {
				ans = false;
				break;
			}
		}
		if(ans == false) {
			System.out.println(" not Equal");
		}
		else {
			System.out.println("equal");
		}

	}

}
