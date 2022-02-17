import java.util.Scanner;

public class checkPrime2 {

	public static void main(String[] args) {
		// TODO : Print all the prime numbers from 1 to 1000
		for(int i=2;i<=1000;i++) {
			boolean prime = true;
			for(int x=2;x<i;x++){
				if(i%x == 0) {
					prime = false;
				}
			}
			if(prime) {
				System.out.println(i);
			}
		}

	}

}
