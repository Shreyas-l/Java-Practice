package NQT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

public class MaxSpending {

	public static void main(String[] args) throws IOException{
		
		int x=10,y,z;
		z=y=x;
		y-=x--;
		z-=--x;
		x-=--x-x--;
		System.out.println(x+"-"+y+"-"+z);
		
	}

}
