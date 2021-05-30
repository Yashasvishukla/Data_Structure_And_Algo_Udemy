import java.util.HashSet;
import java.util.Set;

public class Longest_Band {
    public static void main(String[] args) {
        int arr[] = {1,9,3,0,18,5,2,4,10,7,12,6};
        longestBand(arr);
    }

    private static void longestBand(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for(int a: arr)
        {
            set.add(a);
        }
        int longest = 0;
        for(int i=0;i<n;i++)
        {
            int element = arr[i];

            if(set.contains((element-1))) continue; // cannot be a start or head of the band

            int count = 0;
            while(set.contains(element)){
                element++;
                count++;
            }
            longest = Math.max(longest,count);
        }
        System.out.println(longest);
    }
}
