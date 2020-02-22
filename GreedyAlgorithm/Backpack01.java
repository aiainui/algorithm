package cn.bdqn.entity;

/**
 * 背包算法
 * @author suifeng
 * 已知 一批 物体的个数 ，重量，和每个物体的价格 ，将这批物体这样放入一个背包里 ，背包装入的重量是已知的，问放入哪些物品放性价比才最大
 *1.声明一个性价比的数组 和一个性价比下表的数组
 *2.利用默认排序算出 性价比 和性价比的下表
 *3.再利用贪婪排序 按照从大到小的顺序 求出性价比 和性价比下表
 *4.利用性价比的下标和物体的重量 求出背包装哪些物体 性价比最大
 */
public class Backpack01 {
	
	private int[] weights =new int[]    //weights 物体的重量
			{25,30,60,35,20,50,40};
	private int[] values =new int[]     //value 物体的价格
			{20,40,45,50,10,45,50};
	private static int capacity =150;   //背包的重量

	
	public void backpack(){
		int size =weights.length;
		double [] prices= new double[size];
		//用一个数组保存排序后的性价比和物品的下表
		int [] tags=new int[size];
		for (int i = 0; i < size; i++) {
			prices[i]=(double) values[i]/weights[i];
			tags[i]=i;//默认排序 0 1 2 3 4 5
		}
		//贪婪排序
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if(prices[i]<prices[j]){
					//交换  性价比大的放到前边
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
		//根据已经拍好的性价毕，和相对的重量 添加到背包里
		int sum=0;
		int sum1=0;
		for (int i = 0; i < size; i++) {
			//根据下表拿到数量
			if(weights[tags[i]]<=capacity){
				System.out.println("添加物品"+weights[tags[i]]);
				sum=sum+values[tags[i]];
				sum1=sum1+weights[tags[i]];
				capacity=capacity-weights[tags[i]];
			}
			
		}
		System.out.println("物品的总价值"+sum);
		System.out.println("物品的总重量"+sum1);
		
	}
	public static void main(String[] args) {
		Backpack01 backpack =new Backpack01();
		backpack.backpack();
	}
}


