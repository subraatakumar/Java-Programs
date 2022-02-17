
import java.util.Scanner;

public class qualityAdjustedLifeYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		float result = 0;
		for(int i=0; i<N; i++) {
			float q = sc.nextFloat();
			float y = sc.nextFloat();
			result = result + (q*y);
		}
		System.out.format("%.3f",result);
		
	}

}
