public class MyThing {

	public void count(int x) {
		// Print every odd number between 1 and x (inclusive) in the form
		// 1...
		// 3...
		// <etc>
		// x!
		if (x > 0) {
			for (int i = 1; i < x; i++) {
				if (i % 2 == 1) {
					System.out.println(i + "...");
				}
			}
			if (x % 2 == 1) System.out.println(x + "!");
		}
	}
}
