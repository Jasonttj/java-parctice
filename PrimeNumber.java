
public class PrimeNumber {
	public static void main(String[]args) {
		int sum =0;
		boolean is;
		for (int i=2; i<=10000; i++) {
			is =true;
			for (int j=2; j<=Math.pow((double)i,(1.0/2.0)); j++) {
				if (i%j==0) {
					is =false;
					break;
				};
			};
			if (is ==true) {
				System.out.println(i);
				sum++;
			};
		};
		System.out.println("total:"+sum);
		
	}
}
