package mypro01;

// 分治法
public class QuickSort{
	public static void main(String[] args) {
		int[] data = {2,9,3,4,1,7,5};
		QuickSort q = new QuickSort();
		q.quickSort(data, 0, data.length - 1);
		for(int i = 0; i < data.length; i++){
			System.out.println("data: "+ data[i]);
		}
		
	}	

    public void quickSort(int[] data, int start, int end) {
	    if (data == null || start >= end) return; 
	    //找到划分点
	    int mid = Partition(data, start, end);
	    //划分点的左区间排序
	    quickSort(data, start, mid - 1);
	    //划分点的右区间排序
	    quickSort(data, mid + 1, end);
	}
    
    public int Partition(int[] data, int start, int end){
        int i = start, j = end; //开始 结束
        int pivotKey = data[start]; //哨兵、分割点
        while (i < j) {  
            while (i < j && data[j] >= pivotKey) j--;//向右扫描
            if (i < j) data[i++] = data[j];  
            while (i < j && data[i] <= pivotKey) i++;//向左扫描
            if (i < j) data[j--] = data[i]; 
        }
        data[i] = pivotKey;
        return i;
    }
}
