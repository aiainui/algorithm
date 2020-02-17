package cn.bdqn.dao;
/**
 * 插入排序
 * @author admin
 *1.取其中一个值作为要插入的值，
 *2.查找待插入位置
 *3.找到则插入，找不到则将当前值后移
 */
public class InsertionSort {
	public static void main(String[] args) {
		int a[]=new int[]{6,3,1,9};  //输入
		int j;
		for (int i = 0; i < a.length; i++) {
			int temp=a[i]; //temp  3
			for (j = i-1; j >=0; j--) {
				if(a[j]>temp){      //比较要查找的位置与 前一位的值 
					a[j+1]=a[j];  //比较 大的序列往后移一位
				}else{break;}
			}
			a[j+1]=temp;  // 要查找的位置的值 附给j+1
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
