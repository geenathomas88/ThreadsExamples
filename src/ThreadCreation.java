
public class ThreadCreation {

	public static void main(String[] args) {
		/*	ThreadRunner thread1 = new ThreadRunner();
		thread1.setName("thread1");
		thread1.start();
		System.out.println();
		
		ThreadRunner thread2 = new ThreadRunner();
		thread2.setName("thread2");
		thread2.start();
		System.out.println();
		
		ThreadRunner thread3 = new ThreadRunner();
		thread3.setName("thread3");
		thread3.start();
		System.out.println();
		
		ThreadRunner thread4 = new ThreadRunner();
		thread4.setName("thread4");
		thread4.start();
		System.out.println();*/


ThreadRunner2 th = new ThreadRunner2();
Thread t = new Thread(th);
t.start();
try {
t.sleep(1000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
System.out.println();

ThreadRunner2 th1 = new ThreadRunner2();
Thread t1 = new Thread(th1);
t1.start();
try {
t1.sleep(1000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
System.out.println();

ThreadRunner2 th2 = new ThreadRunner2();
Thread t2 = new Thread(th2);
t2.start();
System.out.println();
}



}
class ThreadRunner extends Thread{

	
	public void run(){
		for(int i = 0; i< 10; i++){
			System.out.print(this.getName()+ " " + i + " ");
		}
	}
}

class ThreadRunner2 implements Runnable{

	public void run() {
		for(int i = 0; i< 10; i++){
			System.out.print( i + " ");
		}
		
	}
	
}