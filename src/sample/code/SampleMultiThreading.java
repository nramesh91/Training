package sample.code;

public class SampleMultiThreading extends Thread{
	public void run(){
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread started");
	}
	
	public static void main(String args[]){
		SampleMultiThreading mt = new SampleMultiThreading();
		mt.start();
		mt.start();
	}
}
