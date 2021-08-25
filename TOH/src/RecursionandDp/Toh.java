package RecursionandDp;

	

	import java.util.Scanner;

	public class Toh {

		public static void main(String[] args) {
			// TODO Auto-generated method stub	
			
			int n = 3;
			solve('A','C','B',n);
			
		}

		private static void solve(char s, char d, char h, int n) {
			// TODO Auto-generated method stub
			
			if(n==1) {
				
				System.out.println("Moving plate "+n+"from"+s+" to "+d);
				
				return;
				
			}
			
			solve(s,h,d,n-1);
			
			System.out.println("Moving plate "+n+"from"+s+" to "+d);
			
			solve(h,d,s,n-1);
			
		}

	}

