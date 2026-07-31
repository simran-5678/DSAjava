class Solution {
    public static String reverseString(String s) {
        int start=0;
        char[]arr=s.toCharArray();
        int end=arr.length-1;
        for(int i=0;i<arr.length-1;i++){
            while(start<end){
               char temp=arr[start];
                arr[start]=arr[end];
                arr[end]= temp;
                start++;
                end--;
                
            }
         
        }
        return new String(arr);
    } 
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna