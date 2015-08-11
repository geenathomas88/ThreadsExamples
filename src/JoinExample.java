
public class JoinExample{
	public static void main(String[] args){
		Thread th1 = new Thread(new MyJoin(), "th1");
		Thread th2 = new Thread(new MyJoin(), "th2");
		Thread th3 = new Thread(new MyJoin(), "th3");
		
		th1.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		th2.start();
		
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th3.start();
	}
}
class MyJoin implements Runnable{

	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread Started : "+ t.getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Ended : "+ t.getName());
	}

}
