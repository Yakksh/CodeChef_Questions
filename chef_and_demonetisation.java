package questions;

import java.util.*;
public class chef_and_demonetisation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- != 0) {
			int s = sc.nextInt();
			int n = sc.nextInt();
			
			if(s%n==0) System.out.println(s/n);
			else if(s%n==1) System.out.println(s/n+1);
			else System.out.println(s%2==1?s/n+2:s/n+1);
		}
		
		sc.close();
	}

}
