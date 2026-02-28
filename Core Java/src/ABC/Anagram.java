package ABC;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s1 = sc.nextLine();
        
        System.out.println("Enter string");
        String s2 = sc.nextLine();
        
        System.out.println(check(s1,s2));
        
	}
	
	static boolean check(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		int count[] = new int[26];
		for(int i = 0; i<s1.length(); i++) {
			count[s1.charAt(i) - 'a']++;
			count[s2.charAt(i) - 'a']--;
			
		}
		for(int i =0; i<26; i++) {
			if(count[i]!=0) {
				return false;
			}
			
		}
		return true;
	}

}
