package Exception_Handler;

public class Exception_Handler_getCause {
	public static void main(String[] args) throws Exception {
		try{
//		int [] arr = new int[3];
//		
//		for(int i = 0; i > arr[10]; i++) {
//			arr[i] = 3*i;
//			System.out.println("Index of "+i+" Array is: "+arr[i]);			
//		}
		
		throw new Exception("Please Maintain your Limitations...", new ArrayIndexOutOfBoundsException()); 
		
		}catch (ArrayIndexOutOfBoundsException ai) {
			// TODO: handle exception
			System.out.println("Cause of Exception: "+ai.getCause());
		}
		
	}
}