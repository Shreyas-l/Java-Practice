package codeVita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q5 {

	
	public static double arr;
	public static double brr;
	public static HashMap<Double,Double> hm = new HashMap<Double,Double>();
	public static HashMap<Integer,Double> dista = new HashMap<Integer,Double>();
	
	
	public static void main (String[] args) throws IOException{
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int h = Integer.parseInt(br.readLine().trim());
		
		int ipos[] = new int[4];
		
		int i=0;
		for(String ele:br.readLine().trim().split(" ")) {
			ipos[i++] = Integer.parseInt(ele);
		}
		
		//System.out.println(ipos);
		int a[] = {0,ipos[0],h};
		int b[] = {h,ipos[1],h};
		int c[] = {h,ipos[2],0};
		int d[] = {0,ipos[3],0};
		
		double newA = 0;
		newA = trian(a,b,c,d);
		
		double maxSum = 4*Math.pow(arr+brr, 2);
		double minSum = maxSum;
		
		
		int speed[] = new int[4];
		
		i=0;
		for(String ele:br.readLine().trim().split(" ")) {
			speed[i++] = Integer.parseInt(ele);
		}
		
		String dir[] = new String[4];
		
		i=0;
		for(String ele:br.readLine().trim().split(" ")) {
			dir[i++] = ele;
		}
		
		
		int af,bf,cf,df;
		
		if(dir[0].equals("U")){
			af = h;
		}else {
			af = 0;
		}
		if(dir[1].equals("U")) {
			bf = h;
		}else {
			bf = 0;
		}
		if(dir[2].equals("U")) {
			cf = h;
		}else {
			cf = 0;
		}
		if(dir[3].equals("U")) {
			df = h;
		}else {
			df = 0;
		}
		//System.out.println(af+" "+bf+" "+cf+" "+df);
		
		//double newA = 0;
		for(;;) {
			if(a[1] == af && b[1] == bf && c[1] == cf && d[1] == df) {
				break;
			}else {
				//System.out.println("Next Loop");
				if(af>a[1]) {
					a[1] += speed[0];
				}else if(af<a[1]) {
					a[1] -= speed[0];
				}
				
				if(bf>b[1]) {
					b[1] += speed[1];
				}else if(bf<b[1]) {
					b[1] -= speed[1];
				}
				
				if(cf>c[1]) {
					c[1] += speed[2];
				}else if(cf<c[1]) {
					c[1] -= speed[2];
				}
				
				if(df>d[1]) {
					d[1] += speed[3];
				}else if(df<d[1]) {
					d[1] -= speed[3];
				}
			
				
				if(a[1] == af && c[1] == cf) {
					if( b[1]!= bf && d[1] == df) {
						newA = trianA(a,b,c,brr);
					}
					else if(b[1]==bf && d[1]!=df) {
						newA = trianB(a,c,d,arr);
					}
					else {
						newA = trian(a,b,c,d);
					}
				}else {
					newA = trian(a,b,c,d);
				}
				
				//double newA = trian(a,b,c,d);
				
				if(newA > maxSum) {
					maxSum = newA;
				}
				if(newA < minSum) {
					minSum = newA;
				}
				
			}
		}
		
		System.out.println((int)maxSum +" "+(int)minSum);
		

	}
	
	
	static double trianA(int a[], int b[], int c[], double ar) {
		double d1 = dist(a,b);
		double d2 = dist(b,c);
		double d3 = dist(c,a);
		
		
		double arABC = area(d1,d2,d3);
		arr = arABC;
		
		double ans = 4*Math.pow(arABC+ar, 2);
		
		return(ans);
	}
	
	static double trianB(int a[], int c[], int d[], double ar) {
		
		double d4 = dist(a,d);
		double d5 = dist(d,c);
		double d6 = dist(c,a);
		
		double arADC = area(d4,d5,d6);
		brr = arADC;
		
		double ans = 4*Math.pow(ar+arADC, 2);
		
		return(ans);
	}
	
	static double trian(int a[], int b[], int c[], int d[]) {
		double d1 = dist(a,b);
		double d2 = dist(b,c);
		double d3 = dist(c,a);
		
		double d4 = dist(a,d);
		double d5 = dist(d,c);
		double d6 = dist(c,a);
		
		double arABC = area(d1,d2,d3);
		arr = arABC;
		
		double arADC = area(d4,d5,d6);
		brr = arADC;
		
		double ans = 4*Math.pow(arABC+arADC, 2);
		
		return(ans);
	}
	
	static double dist(int p[], int q[]) {
		
		int x1 = p[0],y1 = p[1], z1 = p[2];
		int x2 = q[0],y2 = q[1], z2 = q[2];
		
		int v = x2 - x1;
		double va=0,ba=0,na=0;
		int b = y2 - y1;

		int n = z2 - z1;
		
		
		for (Map.Entry<Integer, Double> entry : dista.entrySet()) {
			Integer key = entry.getKey();
			
			if(v == key) {
				Double value = entry.getValue();
				va = value;
			}
			if(b == key) {
				Double value = entry.getValue();
				ba = value;
			}
			if(n == key) {
				Double value = entry.getValue();
				na = value;
			}
 
		}
		
		if(va == 0) {
			va = Math.pow(x2 - x1, 2);
			dista.put(v, va);
		}
		if(ba == 0) {
			ba = Math.pow(y2 - y1, 2);
			dista.put(b, ba);
		}
		if(na == 0) {
			na = Math.pow(z2 - z1, 2);
			dista.put(n, na);
		}
		
		
		double d = Math.pow((va +  ba +  na *  1.0), 0.5);
		
		if(d<0) {
			d=-d;
		}
		return(d);
		
	}
	
	static double area(double a, double b, double c) {
		
		double s = (a+b+c)/2; 
		
		double no = s*(s-a)*(s-b)*(s-c);
		
		for (Map.Entry<Double, Double> entry : hm.entrySet()) {
			Double key = entry.getKey();
			
			if(key == no) {
				Double value = entry.getValue();
				return(value);
			}
 
		}
        
		double ans = (double)Math.sqrt(no);
		hm.put(no, ans);
		
		return(ans);
	}

}
