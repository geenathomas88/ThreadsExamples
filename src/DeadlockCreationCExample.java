
public class DeadlockCreationCExample {

	public static void main(String[] args){
		
		new Thread(new ThreadOne(),"ThreadOne").start();
		new Thread(new ThreadTwo(),"ThreadTwo").start();
	}

}
class ThreadOne implements Runnable{

	public void run() {
		Thread t = Thread.currentThread();
		synchronized (String.class){
			System.out.println("Lock acquired on string class" + t.getName());
		
		synchronized (Integer.class){
			System.out.println("Lock acquired on integer class"+ t.getName());
		}
		}
		
	}
	
}
class ThreadTwo implements Runnable{

	public void run() {
		Thread t = Thread.currentThread();
		synchronized (Integer.class){
			System.out.println("Lock acquired on integer class" + t.getName());
		synchronized (String.class){
			System.out.println("Lock acquired on string class"+ t.getName());
		}	
		}
		
	}
	
}