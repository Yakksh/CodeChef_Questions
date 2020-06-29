package questions;
import java.util.*;

public class cache_Hits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0){
		    int n = sc.nextInt();
		    int b = sc.nextInt();
		    int m = sc.nextInt();

		    int count = 1;
		    int x1 = 0;
		    for(int i =0;i<m;i++){
		        int x = sc.nextInt();
		        int l = (int)x/b;
		        if(l != x1) {
		        	count ++;
		        }
		        x1 = l;
		    }
		    System.out.println(count);
		}

		
	}
}
