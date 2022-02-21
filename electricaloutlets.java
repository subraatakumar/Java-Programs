import java.util.Scanner;

public class electricalOutlets {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			int K = sc.nextInt();
			int result = sc.nextInt();
			for(int j=0; j<K-1; j++) {
				result = result -1 +sc.nextInt();
			}
			System.out.println(result);
		}

	}

}
