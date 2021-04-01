package NQT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValleys {

public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int steps = Integer.parseInt(br.readLine().trim());
		
		int hike[] = new int[steps];
		int i=0;
		for(char c:br.readLine().trim().toCharArray()) {
			
			if(c=='D') {
			hike[i++] = -1;
			}else {
				hike[i++] = 1;
			}
		}
		
		int seaLevel = 0;
		int valley=0;
		for(i=0;i<steps;i++) {
			
			if(hike[i] == -1) {
				
				if(seaLevel == 0) {
					valley++;
					seaLevel--;
				}
				else{
					seaLevel--;
				}
			}
			else {
				seaLevel++;
			}
		}
		System.out.println(valley);
	}

}
