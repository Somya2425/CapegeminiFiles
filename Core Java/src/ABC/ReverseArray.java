package ABC;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Length of array");
        int n = sc.nextInt();
        int a1[] = new int[n];
        System.out.println("Elements of array");
        for(int i =0; i<n; i++) {
        	a1[i] = sc.nextInt();
        }
        int start = 0;
        int end = n-1;
        while(start<end) {
        	int temp = a1[start];
        	a1[start] = a1[end];
        	a1[end] = temp;
        	start++;
        	end--;
        }
        System.out.println("Elements of  reversed array");
        for(int i =0; i<n; i++) {
           System.out.println(a1[i]);
	}
	}

}
