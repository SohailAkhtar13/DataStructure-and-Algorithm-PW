import java.util.*;
import java.io.*;

public class PrefixSumOptimised {
    

        public static void PrefixSumMatrix(int arr[][])
        {
            int m=arr.length;
            int n=arr[0].length;
            //Traversing the array row wise
            for(int i=0;i<m;i++)
            {
                for(int j=1;j<n;j++)
                {
                    arr[i][j]+=arr[i][j-1];
                }
            }
            //traversing the array column wise
            for(int j=0;j<n;j++)
            {
                for(int i=1;i<m;i++)
                {
                    arr[i][j]+=arr[i-1][j];
                }
            }

        }

        public static int sumRegion(int arr[][],int r1,int c1,int r2,int c2)
        {
            int sum=0,up=0,left=0,repeatedRegion=0,result=0;
            sum=arr[r2][c2];
            up=arr[r1-1][c2];
            left=arr[r2][c1-1];
            repeatedRegion=arr[r1-1][c1-1];
            result=sum-up-left+repeatedRegion;
           return result;

        }
        public static int findSumMatrix(int[][] arr, int r1, int c1, int r2, int c2){
            int sum = 0;
            for(int i=r1; i<=r2; i++){
                for(int j=c1; j<=c2; j++){
                    sum += arr[i][j];
                }
            }
            return sum;
        }
        public static void main(String[] args) 
        {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of rows");
    int m=sc.nextInt();
    System.out.println("Enter no of Columns");
    int n=sc.nextInt();

    int arr[][]=new int[m][n];

    System.out.println("Enter the Matrix elements");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }

    int r1,r2,c1,c2;
    System.out.println("Enter the value of r1");
    r1=sc.nextInt();
    System.out.println("Enetr the value of c1");
    c1=sc.nextInt();
    System.out.println("Enter the value of r2");
    r2=sc.nextInt();
    System.out.println("Enter the value of c2");
    c2=sc.nextInt();

    PrefixSumMatrix(arr);
    int result=sumRegion(arr,r1,c1,r2,c2);
    System.out.println("the sum  is "+result);

    
    }
}


//TC=O(mxn)
//SC=O(1)
