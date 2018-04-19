package sample.code;

import java.util.Scanner;

public class SampleFibonacci {
	public static void main(String args[]){
//		int num1, num2, num3, count, i;
//		num1 = 0;
//		num2 = 1;
////		count = 10;
//		Scanner s = new Scanner(System.in);
//		System.out.print("Count is: ");
//		count = s.nextInt();
//		System.out.print(num1 + "\t" + num2 + "\t");
//		for (i = 2; i < count; i++){
//			num3 = num1 + num2;
//			System.out.print(num3 + "\t");
//			num1 = num2;
//			num2 = num3;
//		}
		
		int num = 5;
		int fib[] = new int[num];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < 5; i++)
		{
			fib[i] = fib[i-2] + fib[i-1];
		}
		for (int k = 0; k < 5; k++)
			System.out.print(fib[k] + "\t");
		
	}

}
