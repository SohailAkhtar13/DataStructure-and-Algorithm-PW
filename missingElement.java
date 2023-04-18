public class MissingElement 
{
public static void main(String[] args) {
    int arr[]={1,2,4,7,6,5,8,9};
    int n=arr.length;
    int sum=0;
    int missingElem=0;
    
    //Sum of natural number in an array
    int sumNatural=((n+1)*(n+2))/2;

    //Sum of  all the element present in the element currently

    for(int i=0;i<n;i++)
    
    {
        sum+=arr[i];
    }
    missingElem=sumNatural-sum;
    System.out.println("the missing element is :"+missingElem);

}
    
}


//Note: The elements should be continuous

//Time Complexity=O(n)  due to summing up all the elements present in  array using for loop
//Space Complexity =O(1)
