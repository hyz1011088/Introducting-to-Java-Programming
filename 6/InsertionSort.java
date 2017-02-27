
public class InsertionSort {
	public static void insertionSort(double [] list){
		for(int i =1;i<list.length;i++){
			double currentElement=list[i];
			int k;
			for(k=i-1;k>=0&&list[k]>currentElement;k--){
				list[k+1]=list[k];
			}
			list[k+1]=currentElement;
		}
		for(int i =0;i<list.length;i++){
			System.out.println(list[i]);
		}
	}
	
	public static void main(String [] args){
		double [] list={6,30,8,13,46,11,2};
		insertionSort(list);
	}

}
