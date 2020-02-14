package cn.bdqn.dao;

/**
 * 优化版本
 * 1 双向比较
 * 1.1 定义基准元素 pivot 
 * 1.2 同时让从右往左和哨兵进行比较 以及 从左往右和哨兵进行比较
 * 1.3 进行交换：data[i]大于哨兵,哨兵和前一个值替换，否则，和当前值替换
 * 2 分别递归求左区间和右区间
 */
public class QuickSort {
	public static int partition(int r[], int low, int high) { // 划分函数
		int i = low;
		int j = high;
		int pivot = r[low]; // 基准元素
		while (i < j) {
			while (i < j && r[j] > pivot)
				j--; // 向左扫描
			while (i < j && r[i] <= pivot)
				i++;// 向右扫描
			if (i < j) {
				// swap(r[i++],r[j--]); //交换，后i++,j--
				int temp;
				temp = r[i];
				r[i] = r[j];
				r[j] = temp;
				i++;
				j--;
			}
		}
		if (r[i] > pivot) // 判断哨兵右边的值是否大于哨兵
		{
			// swap(r[i-1],r[low]);
			int temp = r[i - 1];
			r[i - 1] = r[low];
			r[low] = temp;
			return i - 1; // 返回最终哨兵的位置
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
		// 找到划分点
		int mid = partition(r, low, high);
		// 从左往右和哨兵进行比较，
		quickSort(r, low, mid - 1);
		// 从右往左和哨兵进行比较
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
