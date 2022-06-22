package loops;

public class NestedLoop {

	public static void main(String[] args) {
		int counter = 0;
		// hours
		for (int hour = 0; hour < 24; hour++) {
			// minutes - 60 * 24
			for (int minute = 0; minute < 60; minute++) {
				System.out.println(hour + ":" + minute);
				counter++;
			} // must entirely finish before

			// this line
		}

		System.out.println(counter);

		// format // import // save all
	} // Ctrl+Shift+F Ctrl+Shift+O Ctrl+Shift+S

}
