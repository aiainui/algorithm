package mypro01;

// ���η�
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
	    //�ҵ����ֵ�
	    int mid = Partition(data, start, end);
	    //���ֵ������������
	    quickSort(data, start, mid - 1);
	    //���ֵ������������
	    quickSort(data, mid + 1, end);
	}
    
    public int Partition(int[] data, int start, int end){
        int i = start, j = end; //��ʼ ����
        int pivotKey = data[start]; //�ڱ����ָ��
        while (i < j) {  
            while (i < j && data[j] >= pivotKey) j--;//����ɨ��
            if (i < j) data[i++] = data[j];  
            while (i < j && data[i] <= pivotKey) i++;//����ɨ��
            if (i < j) data[j--] = data[i]; 
        }
        data[i] = pivotKey;
        return i;
    }
}
