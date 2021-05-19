class ArrayDemo{
	public static void main (String []a){
	//literal way
	int evenNumbers[]= { 2,4,6,8,10,12 };
	
	System.out.println(evenNumbers[4]);
	
	System.out.println(" size of evenNumbers "+evenNumbers.length);
	
	int []oddNumbers = new int[10];
	System.out.println(" size of oddNumbers "+oddNumbers.length);
	System.out.println(oddNumbers[0]);
	oddNumbers[0]=12;
	
	for (int i =0; i < evenNumbers.length; i++){
	
	System.out.println(evenNumbers[i]);
		}
	}
}