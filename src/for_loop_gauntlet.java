public class for_loop_gauntlet {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		for (int i = 100; i >= 0; i -= 2) {
			System.out.println(i);
		}
		for (int i = 2; i < 100; i++) {
			System.out.println(i);
		}
		for (int i = 1; i < 99; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " odd");
			}

		}
		for (int i = 2; i < 500; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " even");
			}
		}
		for (int i = 0; i < 777; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
}
