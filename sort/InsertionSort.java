package cn.bdqn.dao;
/**
 * ��������
 * @author admin
 *1.����һ���ڱ�a[0]
 *2.����Ҫ����ֵ��λ��j
 *3.�������������������а�j��ֵ������һλ��ֱ��a[0]>a[j]
 *4.��a[0]����a[j+1]��λ��	
 */
public class InsertionSort02 {
	public static void main(String[] args) {
		int a[]=new int[]{6,3,1,9};  //����
		int j;
		for (int i = 0; i < a.length; i++) {
			int temp=a[i]; //temp  3
			for (j = i-1; j >=0; j--) {
				if(a[j]>temp){      //�Ƚ�Ҫ���ҵ�λ���� ǰһλ��ֵ 
					a[j+1]=a[j];  //�Ƚ� �������������һλ
				}else{break;}
			}
			a[j+1]=temp;  // Ҫ���ҵ�λ�õ�ֵ ����j+1
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
