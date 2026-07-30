class Solution {
    void pushZerosToEnd(int[] arr) {
        int slow=0;
         int fast=0;
        for( fast=0;fast<arr.length;fast++){
            if(arr[fast]!=0){
                int temp=arr[slow];
                arr[slow]=arr[fast];
                arr[fast]= temp;
                slow++;
            }                                                                                                               
        
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna