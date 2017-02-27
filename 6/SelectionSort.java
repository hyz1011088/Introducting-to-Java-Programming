
public class SelectionSort {
	public static void selectionSort(double [] list){
		for(int i=0;i<list.length;i++){
			double currentMin=list[i];
			int currentMinIndex=i;
			for(int j=i+1;j<list.length;j++){
				if(currentMin>list[j]){
					currentMin=list[j];
					currentMinIndex=j;
				}
			}
			if(currentMinIndex!=i){
				list[currentMinIndex]=list[i];
				list[i]=currentMin;
			}
		}
		for(int i=0;i<list.length;i++){
			System.out.println(list[i]);
		}
	}
	
	public static void main(String [] args){
		double [] list={2,9,12,5,10,78,1,3};
		selectionSort(list);
	}

}
