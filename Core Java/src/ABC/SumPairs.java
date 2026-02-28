package ABC;

import java.util.Scanner;

public class SumPairs {

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
        System.out.println("enter target");
        int target = sc.nextInt();
        int count = 0;
        
        for(int i = 0; i<n; i++) {
        	for(int j = i+1; j<n; j++) {
        		if(a1[i]+a1[j]==target) {
        			count++;
        			break;
        		}
        		
        	}
        }
        
        System.out.println(count);
	}

}
