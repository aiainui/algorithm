package cn.bdqn.dao;

import java.util.Scanner;

/**
 * ð������
 * @author suifeng
 *1.�Ƚ������������Ĵ�С�������ǰֵС�ں�һ��ֵ������λ�ã�ֱ���ҵ����ֵ���������һ��λ��
 *2.�������ʣ�µ����ֵ
 */

public class BubbleSort {
	public static void main(String[] args) {
		int arr1[]={1,3,5,3,2,7,8};
		//Scanner sca=new Scanner(System.in);
		bubble(arr1);
		for (int i = 0; i < arr1.length; i++) {
			//int bu = sca.nextInt();
			System.out.println("��������Ϊ"+arr1[i]);
		}
		
	}
	public static void bubble(int arr[]){
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] < arr[j+1]){//�Ƚ�������������ֵ
					//����
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
