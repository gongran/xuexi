package xuexi.sorts;

public class MaoPao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrays = { 4, 5, 3, 7, 6, 9, 11, 1, 3 };
		int size = arrays.length - 1;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				int a = arrays[i];
				int b = arrays[j];
				int temp = 0;
				if (a > b) {
					temp = a;
					a = b;
					b = temp;
				}
			}
		}

	}

	public void sort(int[] a) {
		int temp = 0;
		for (int i = a.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (a[j + 1] < a[j]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

}
