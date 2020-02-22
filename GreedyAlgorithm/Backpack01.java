package cn.bdqn.entity;

/**
 * �����㷨
 * @author suifeng
 * ��֪ һ�� ����ĸ��� ����������ÿ������ļ۸� ��������������������һ�������� ������װ�����������֪�ģ��ʷ�����Щ��Ʒ���Լ۱Ȳ����
 *1.����һ���Լ۱ȵ����� ��һ���Լ۱��±������
 *2.����Ĭ��������� �Լ۱� ���Լ۱ȵ��±�
 *3.������̰������ ���մӴ�С��˳�� ����Լ۱� ���Լ۱��±�
 *4.�����Լ۱ȵ��±����������� �������װ��Щ���� �Լ۱����
 */
public class Backpack01 {
	
	private int[] weights =new int[]    //weights ���������
			{25,30,60,35,20,50,40};
	private int[] values =new int[]     //value ����ļ۸�
			{20,40,45,50,10,45,50};
	private static int capacity =150;   //����������

	
	public void backpack(){
		int size =weights.length;
		double [] prices= new double[size];
		//��һ�����鱣���������Լ۱Ⱥ���Ʒ���±�
		int [] tags=new int[size];
		for (int i = 0; i < size; i++) {
			prices[i]=(double) values[i]/weights[i];
			tags[i]=i;//Ĭ������ 0 1 2 3 4 5
		}
		//̰������
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if(prices[i]<prices[j]){
					//����  �Լ۱ȴ�ķŵ�ǰ��
					double temp =prices[i];
					prices[i]=prices[j];
					prices[j]=temp;
					//
					int tag=tags[i];          //2 1 0 3 4 5
					tags[i]=tags[j];
					tags[j]=tag;
				}
			}
		}
		//�����Ѿ��ĺõ��Լ۱ϣ�����Ե����� ��ӵ�������
		int sum=0;
		int sum1=0;
		for (int i = 0; i < size; i++) {
			//�����±��õ�����
			if(weights[tags[i]]<=capacity){
				System.out.println("�����Ʒ"+weights[tags[i]]);
				sum=sum+values[tags[i]];
				sum1=sum1+weights[tags[i]];
				capacity=capacity-weights[tags[i]];
			}
			
		}
		System.out.println("��Ʒ���ܼ�ֵ"+sum);
		System.out.println("��Ʒ��������"+sum1);
		
	}
	public static void main(String[] args) {
		Backpack01 backpack =new Backpack01();
		backpack.backpack();
	}
}


