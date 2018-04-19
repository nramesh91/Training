package sample.code;

import java.util.Arrays;
import java.util.Scanner;

public class FindOddNum {
	
	int[] oddNum(int l, int r){
		int count = 0;
        for (int i = l; i <= r; i++){
            if (i % 2 != 0){
                count++;
            }
        }
        int odd[] = new int[count];
        int itr = 0;
        for (int i = l; i <= r; i++){
            if (i % 2 !=0){
                odd[itr] = i;
                itr++;
            }
        }
        return odd;
	}
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter l value: ");
		int l = s.nextInt();
		System.out.print("Enter r value: ");
		int r = s.nextInt();
		FindOddNum odd = new FindOddNum();
		int[] res = odd.oddNum(l, r);
		System.out.println("Odd numbers are: ");
		for (int i = 0; i < res.length; i++)
			System.out.println(res[i]);
	}

}
