package cn.bdqn.dao;
/**
 * 插入排序
 * @author admin
 *1.设置一个哨兵a[0]
 *2.设置要查找值得位置j
 *3.在数组中搜索，搜索中把j的值往后移一位，直到a[0]>a[j]
 *4.将a[0]插入a[j+1]的位置	
 */
public class InsertionSort02 {
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
