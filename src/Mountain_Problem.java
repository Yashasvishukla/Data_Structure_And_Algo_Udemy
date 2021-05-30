public class Mountain_Problem {
    public static void main(String[] args) {
        int arr[] = {5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4};
        maxLengthOfHighestMountain(arr);
    }

    private static void maxLengthOfHighestMountain(int[] arr) {
//         Key Points here are
//        1. Identify the Peak element
//        2. Peak element is one : whose left element is smaller and the right element as well
//        3. To calculate the length of highest mountain

//        1 we will traverse to the left until we break the strict decreasing order.
//        2 While moving forward we can keep track of strict decreasing nature.
//        3 we can start from the next element when we encounter the change in strict decreasing nature.


        int largest = 0;

        // First element or the last element cannot be the peak element;
        for(int i=1;i<arr.length-1;)
        {
            // Check whether a peak element or not
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                // check the backward elements (left)
                int count = 1; // include the peak element;
                int j = i;

                // we are tracking the j-1 the element
                while(j>=1 && arr[j]>arr[j-1]){
                    count ++;
                    j--;
                }

                // check the forward elements (right)
                while(i<arr.length-1 && arr[i] > arr[i+1])
                {
                    count ++;
                    i++;
                }

                largest = Math.max(largest,count);
            }
            else
            {
                i++;
            }
        }

        System.out.println(largest);
    }
}
