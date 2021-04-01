package NQT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BirthdayCakeCandles {

public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		
		String S1[] = br.readLine().trim().split(" ");
		
		int[] candles = new int[N];
		int i=0;
		for(String s:S1) {
			candles[i++] = Integer.parseInt(s);
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int x:candles) {
			if(x>max) {
				max=x;
			}
		}
		int count=0;
		for(int x:candles) {
			if(x==max) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
