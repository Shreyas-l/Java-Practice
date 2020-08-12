package CompetitiveCoding;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MergeIntervals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> intervals = new ArrayList<ArrayList<Integer>>();
		
		System.out.println("Enter the number of intervals:");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int j=i+1;
			System.out.println("Enter Start & and of " + j + "Interval: ");
			
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			ArrayList<Integer> temp = new ArrayList<Integer>();
			
			temp.add(start);
			temp.add(end);
			
			intervals.add(temp);
		}
		
		System.out.println(intervals);
		
		System.out.println("Enter Start & End of New Interval: ");
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		ArrayList<Integer> interval = new ArrayList<Integer>();
		interval.add(start);
		interval.add(end);
		
		int i=0;
		ArrayList<Integer> newInterval = new ArrayList<Integer>();
		
		while(i<intervals.size()) {
			
			if(intervals == null){
				
				ArrayList<ArrayList<Integer>> intervals_List = new ArrayList<ArrayList<Integer>>();
				intervals_List.add(interval);
				break;
				
				}
			else if(intervals.size() == 0) {
				intervals.add(interval);
				break;
			}
			
			ArrayList<Integer> currentInterval = intervals.get(i);
			
			if(currentInterval.get(1) < interval.get(0)) {
				i++;
				continue;  //PASS
			}
			else if(currentInterval.get(0) > interval.get(1)) {
				intervals.add(i,interval);  // ADD AT INDEX i
				break;
			}
			else {
				//MERGE
				int startNew = Math.min(currentInterval.get(0),interval.get(0));
				int endNew = Math.max(currentInterval.get(1), interval.get(1));
				
				newInterval.add(startNew);
				newInterval.add(endNew);
				interval = newInterval;
				intervals.remove(i);
				
			}
			
		}
		
		if(i == intervals.size()) {
			intervals.add(interval);
		}
		
		
		System.out.println(intervals);
		

	}

}
