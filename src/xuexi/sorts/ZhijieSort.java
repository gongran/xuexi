package xuexi.sorts;

import java.util.Arrays;
import java.util.Random;

public class ZhijieSort {

	public static void main(String[] args) {
		// ����һ������
		int[] array = new int[10];
		// Ϊ����������������������
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(500);
		}

		System.out.print("ԭʼ����  ��");
		System.out.println(Arrays.toString(array));
		/****************************************
		 * ���濪ʼ��ʽ�ġ�ֱ��ѡ�������㷨 ֱ��ѡ������Ĺؼ��� 1����a[0]-a[N-1]��ѡ����С�����ݣ�Ȼ����a[0]����λ��
		 * 2����a[1]-a[N-1]��ѡ����С�����ݣ�Ȼ����a[1]����λ�ã���1��������a[0]����N��������Сֵ��
		 * 3����a[2]-a[N-1]��ѡ����С�����ݣ�Ȼ����a[2]����λ�ã���2��������a[1]����N-1��������Сֵ��
		 * �Դ����ƣ�N-1������󣬴������ݾ��Ѿ����մ�С�����˳�������ˡ�
		 ****************************************/
		// N������Ԫ�أ�����Ҫѭ��N��
		for (int i = 0; i < array.length - 1; i++) {
			// ��С����������������ÿ�ζ��������ѭ���ļ����������ó�ʼֵ��
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				// ������С�����������жϵ�ǰ������Ƿ�С����С����
				// ���С�ڣ���ѵ�ǰ����������Ϊ��С����������
				// ���򲻴���
				if (array[minIndex] > array[j]) {
					minIndex = j;
				}
				// ֱ��ѭ����ɵ�ʱ��minIndex�϶����ǵ�ǰ����ѭ���У���С���Ǹ���
			}
			// System.out.print(i + "�֣���С��" + array[minIndex] + "��");
			// System.out.print("ԭ����" + minIndex + "��������" + i);
			// �õ���С���������󣬰Ѹ�������Ӧ��ֵ�ŵ�����ߣ����Ұ�����ߵ�ֵ�ŵ��������ڵ�λ��.
			// ����ߵ�ֵ
			int temp = array[i];
			// ����С��������Ӧ��ֵ�ŵ������
			array[i] = array[minIndex];
			// ��ԭ������߶�Ӧ��ֵ�ŵ���С���������ڵ�λ��
			array[minIndex] = temp;
			System.out.println(String.format("%2s", (i + 1)) + "�������" + Arrays.toString(array));
		}
	}

}
