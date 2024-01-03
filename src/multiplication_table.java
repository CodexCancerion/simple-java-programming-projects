public class multiplication_table {
	public static void main(String[] args) {
		int x, y;
		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {
				System.out.printf("%3d ", x*y);
			}
			System.out.println();
		}
	}
}
