package telran.memory.utils;

public class MemoryService {
	public static int getMaxAvailableMemory() {
		
		int left = 0;

		int right = Integer.MAX_VALUE / 2;

		while (left <= right) {

			int center = left + (right - left) / 2;

			try {
				int[] arr = new int[center];
				left = center + 1;

			} catch (OutOfMemoryError e) {
				right = center - 1;
			}
		}
		System.out.println(left);
		return left;
	}
}
