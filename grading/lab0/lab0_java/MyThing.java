public class MyThing {

	public void count(int x) {
		// Print every odd number between 1 and x (inclusive) in the form
		// 1...
		// 3...
		// <etc>
		// x!
		if (x > 0) {
			int last_out;
			if (x % 2 == 1){
				last_out = x;
			}
			else {
				last_out = x-1;
			}
			for (int i = 1; i < last_out; i++) {
				if (i % 2 == 1) {
					System.out.println(i + "...");
				}
			}
			System.out.println(last_out + "!");
		}
	}
}
