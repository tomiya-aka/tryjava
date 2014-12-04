package lesson9;

public class Q2 {
	static int maxOfArray(int[] n) {
		int max = 0;
		
		for(int i : n) {
			if (i > max) {
				max = i;
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		int[] dt = {50, 20, 80, 30, 10, 40};
		
		System.out.println(maxOfArray(dt));
	}
}
