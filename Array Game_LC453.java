
import java.util.PriorityQueue;

public class Solution {
	
	public int solution(int[] arr){
		int min=arr[0];
		int sum=0;
		for(int n:arr)
		{
			sum+=n;
			min=Math.min(min,n);
		}
		return sum-min*arr.length;
	}
}
