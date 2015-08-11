
public class DeamonExample extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Deamon thread is running");
		}else{
			System.out.println("Normal thread is running");
		}
	}
	public static void main(String[] args){
		DeamonExample dte = new DeamonExample();
		DeamonExample dte1 = new DeamonExample();
		
		dte1.setDaemon(true);
		
		dte.start();
		dte1.start();
	}
}
