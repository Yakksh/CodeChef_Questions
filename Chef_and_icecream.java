package questions;

import java.util.*;
public class Chef_and_icecream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- != 0) {
			int n = sc.nextInt();
			int[] person = new int[n];
			for(int i=0;i<n;i++) {
				person[i] = sc.nextInt();
			}
			
			boolean serve = false;
			int five = 0;
			int ten = 0;
			int fifteen = 0;
			
			for(int i=0;i<n;i++) {
				int toserve = person[i];
				serve = false;
				
//				if(toserve == 5) {
//					five ++;
//					serve = true;
//				}
//				else if(toserve == 10) {
//					if(five != 0) {
//						ten++;
//						five -= 1;
//						serve = true;
//					}
//					else break;
//				}
//				else {
//					if(ten !=0 ) {
//						fifteen++;
//						ten -= 1;
//						serve = true;
//					}
//					else break;
//				}
				
				switch(toserve) {
				case 5:
					five++;
					serve = true;
					break;
				case 10:
					if(five != 0) {
						ten++;
						five -= 1;
						serve = true;
					}
					break;
				case 15:
					if(ten !=0 ) {
						fifteen++;
						ten -= 1;
						serve = true;
					}
					else if(five >= 2) {
						fifteen++;
						five -= 2;
						serve = true;
					}
				}
				if(!serve) break;
			}
			if(serve) System.out.println("YES");
			else System.out.println("NO");
			
			
		}
		
		sc.close();
	}

}
