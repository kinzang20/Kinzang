public class arraydemo{
	static int[] arr1;
	public static int[] resize(int length){
		int[] temp = new int[length];

		for(int i=0; i<arr1.length; i++){
			temp[i]=arr1[i];
		}
		temp[length - 1] = 4;
		arr1 = temp;
		return arr1;
	}
	public static void main(String[] args) {
		int[] arr1=new int[3];
		arr1[0]= 1;
		arr1[1]= 2;
		arr1[1]= 3;
		int[] newarr1 = resize(4);

		for (int i = 0; i< newarr1.length; i++)
		{
			System.out.println(newarr1[i]);
		}
	}
}