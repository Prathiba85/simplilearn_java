package classroom_tutorials;

public class prime_number {
	public static void main(String[] args) {
		int n = 10;
		boolean flag = true;

		if ((n == 2) || (n == 3))

			flag = true;

		if ((n % 2) == 0 || (n % 3 == 0))
			flag = false;

		for (int i = 5; i < n/2;i++){
			if ((n % i) == 0) {
				flag = false;
				break;
			}

		}

		if (flag == true)
			System.out.println("This is Prime ");
		else
			System.out.println("This is notPrime");

	}

}
