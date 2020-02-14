package cn.bdqn.dao;

import java.util.Scanner;

/**
 * 冒泡排序
 * @author suifeng
 *1.比较相邻两个数的大小，如果当前值小于后一个值，交换位置，直到找到最大值，放在最后一个位置
 *2.依次求出剩下的最大值
 */

public class BubbleSort {
	public static void main(String[] args) {
		int arr1[]={1,3,5,3,2,7,8};
		//Scanner sca=new Scanner(System.in);
		bubble(arr1);
		for (int i = 0; i < arr1.length; i++) {
			//int bu = sca.nextInt();
			System.out.println("排序后的数为"+arr1[i]);
		}
		
	}
	public static void bubble(int arr[]){
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] < arr[j+1]){//比较相邻两个数的值
					//交换
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
