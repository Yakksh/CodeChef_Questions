package questions;

import java.util.*;
public class Chef_and_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		while(t-- != 0) {
			String s = sc.nextLine();
			int count = 0;
			
			for(int i=0;i<s.length()-1;i++) {
				if(s.charAt(i) == 'x') {
					if(s.charAt(i+1)=='y') {
						count++;
						i++;
					}
				}
				else if(s.charAt(i)=='y') {
					if(s.charAt(i+1)=='x') {
						count++;
						i++;
					}
				}
			}
			System.out.println(count);
			
		}
		
		
		sc.close();
	}

}
