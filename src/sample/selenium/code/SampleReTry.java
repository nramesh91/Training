package sample.selenium.code;

public class SampleReTry {
	public static void main(String args[]){
		System.out.println("main method started");
		SampleReTry srt= new SampleReTry();
		srt.div();
	}
	void div(){
		try{
			int i = 0;
			int j = 10;
			int c = j / i;
			System.out.println("Value of c is: " + c);
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("Arithmetic Exception");
			reTry();
		}
	}
	void reTry(){
		int count = 3;
		System.out.println("Count: " + count);
	}
	

}
