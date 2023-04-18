public class Palindrome
{
    public static void main(String args[])
    {
    int arr[]={1,2,3,2,1,4};
    int n=arr.length;
    boolean flag=false;

    for(int i=0;i<n/2;i++)
    if(arr[i]!=arr[n-i-1])
    {
         flag=true;
        System.out.println("It is not a palindromic array");
        break;
    }
    if(flag ==false)
    {
        System.out.println("It is a palindromic Array");
    }
    }
    

}



//Time Complexity = O(n)  due to for loop
//Space Complexity = O(1)
