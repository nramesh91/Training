package sample.code;

import java.util.Scanner;

public class SamplePrimeNum {
	public static void main(String args[]){
		Scanner s  = new Scanner(System.in);
		System.out.print("Enter num: ");
		int num = s.nextInt();
		if (isPrime(num))
			System.out.println(num + " is prime number");
		else
			System.out.println(num + " is not prime number");
	}

	static Boolean isPrime(int number){
		for (int i = 2; i <= number/2; i++){
			if(number%i == 0)
				System.out.println(number%i);
				return false;
		}
		return true;
	}
}
