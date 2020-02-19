package cn.bdqn.dao;

import java.util.Arrays;

/**
 * 堆排序
 * @author suifeng
 *1.构建一个大根堆
 *2.固定个最大值 剩余的数进行构建大根堆 重复以上过程
 */
public class HeapSort02 {
	public static void main(String[] args) {
		int arr[]={9,5,3,2,1};
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void heapSort(int arr[]){
		//构建一个大根堆
		for (int i = arr.length/2-1; i >= 0; i--) {
			heap(arr,i,arr.length);
		}
		for (int i= arr.length-1; i >0; i--) {
			swap(arr,0,i);  
			heap(arr, 0, i);
		}
	}

	public static void swap(int[] arr, int i, int length) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[length];
		arr[length]=temp;
		
	}

	public static void heap(int[] arr, int i, int length) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		int left=2*i+1;
		for (int j = left; j < length; j=2*j+1) {
			if(j+1<length&&arr[j+1]>arr[j]){
				j++;
			}
			if(arr[j]>temp){
			arr[i]=arr[j];
			i=j;
			}else{break;}
			
		}
		arr[i]=temp;
	}
}
