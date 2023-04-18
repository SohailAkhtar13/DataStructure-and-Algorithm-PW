public class ArrayReverse
{
    public static void main(String[] args) {
        
        int arr[]={1,4,76,43,51};
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        {
           int temp=arr[i];   //Swapping logic
           arr[i]=arr[n-i-1];
           arr[n-i-1]=temp;

        }
      for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]+ " ");    //Displaying the array in console
      }
      System.out.println();
    }
    
}


//Time Complexity = O(N) due to for loop
// Space Complexity =O(1)
