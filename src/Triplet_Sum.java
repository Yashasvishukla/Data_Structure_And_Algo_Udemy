/*
Consider one element and then use two pointer approach to find the other two pair

arr[i]  And then consider l and r range to find sum ==> targetSum - arr[i]
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplet_Sum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,15};
        int targetSum = 18;
        tripletSum(arr,targetSum);
    }

    private static void tripletSum(int[] arr, int targetSum) {
        List<List<Integer>> pairs = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            int currSum = arr[i];
            int l = i+1;
            int r = arr.length-1;
            while(l<r)
            {
                int subPairSum = arr[l]+arr[r]+currSum;
                if(subPairSum == targetSum)
                {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(currSum);
                    pair.add(arr[l]);
                    pair.add(arr[r]);
                    pairs.add(pair);
                    l++;
                    r--;
                }
                else if(subPairSum > targetSum)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
        }

        System.out.println(pairs);
    }
}
