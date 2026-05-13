package Loop_Statements;

public class for_loop {

	public static void main(String []args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		
		for(int i=4;i>=1;i--) {
			System.out.println(i);
			if (i==3) {
				break;
			}
		}
		
		for(int i=1;i<=5;i++) {
			System.out.println("Day "+ i);
			for(int j=9; j<=18; j++) {
				System.out.println(j+ " - "+ (j+1));
			}
		}
		int i=1;
		for(;i<=5;) {
			System.out.println(i);
			i++;
		}
		
	}
}
