
public class ExceptionExample {
	public static void main(String args[]){
		int num1 = 10;
		int num2 = 5;
		System.out.println("Before execution");
		try {
			int result = num1/num2;
			System.out.println(result);
			//System.exit(0);
		} catch (Exception ae) {
			// TODO Auto-generated catch block
			ae.printStackTrace();
		}
		finally{
			System.out.println("I am finally- executed anyways");
		}
		System.out.println("After excecution");
		int arr[] = new int[5];
		try {
			arr[6]= 10;
			System.out.println(arr[5]);
		} catch (Exception abe) {
			// TODO Auto-generated catch block
			abe.printStackTrace();
		}
	}
	
	
	
}
