package Loop_Statements;

public class While_loop {

	public static void main(String[] args) {

 		int n=0;
		while(n<=10){
			System.out.println("Hi "+n);
			n++;
			if (n==5) {
				System.out.println("Bye "+ n);
				break;
			}
		}
		while (n<=10) {
			System.out.println("Hi "+n);
			int j=1;
			while(j<=3) {
				System.out.println("inner hi");
				j++;
			}
			n++;
			if (n==11) {
				System.out.println("Bye "+ n);
				break;
			}
		}
	}

}
