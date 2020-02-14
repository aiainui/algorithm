package cn.bdqn.dao;

/**
 * �Ż��汾
 * 1 ˫��Ƚ�
 * 1.1 �����׼Ԫ�� pivot 
 * 1.2 ͬʱ�ô���������ڱ����бȽ� �Լ� �������Һ��ڱ����бȽ�
 * 1.3 ���н�����data[i]�����ڱ�,�ڱ���ǰһ��ֵ�滻�����򣬺͵�ǰֵ�滻
 * 2 �ֱ�ݹ����������������
 */
public class QuickSort {
	public static int partition(int r[], int low, int high) { // ���ֺ���
		int i = low;
		int j = high;
		int pivot = r[low]; // ��׼Ԫ��
		while (i < j) {
			while (i < j && r[j] > pivot)
				j--; // ����ɨ��
			while (i < j && r[i] <= pivot)
				i++;// ����ɨ��
			if (i < j) {
				// swap(r[i++],r[j--]); //��������i++,j--
				int temp;
				temp = r[i];
				r[i] = r[j];
				r[j] = temp;
				i++;
				j--;
			}
		}
		if (r[i] > pivot) // �ж��ڱ��ұߵ�ֵ�Ƿ�����ڱ�
		{
			// swap(r[i-1],r[low]);
			int temp = r[i - 1];
			r[i - 1] = r[low];
			r[low] = temp;
			return i - 1; // ���������ڱ���λ��
		}
		// swap(r[i],r[low]);
		int temp = r[i];
		r[i] = r[low];
		r[low] = temp;
		return i;
	}

	public static void quickSort(int r[], int low, int high) {
		if (r == null || low >= high)
			return;
		// �ҵ����ֵ�
		int mid = partition(r, low, high);
		// �������Һ��ڱ����бȽϣ�
		quickSort(r, low, mid - 1);
		// ����������ڱ����бȽ�
		quickSort(r, mid + 1, high);

	}

	public static void main(String[] args) {
		int[] data = { 2, 9, 3, 4, 1, 7, 5 };
		// QuickSort q = new QuickSort();
		// q.quickSort(data, 0, data.length - 1);
		quickSort(data, 0, data.length - 1);
		for (int i = 0; i < data.length; i++) {
			System.out.println("data: " + data[i]);
		}
	}

}
