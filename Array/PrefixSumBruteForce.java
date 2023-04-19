import java.util.*;
import java.io.*;
//Brute Force Approach

public class PrefixSum {
    public static int findSumMatrix(int arr[][],int r1,int c1,int r2, int c2)
    { 
        int sum=0;
        for(int i=r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
   

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of rows");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns");
        int n=sc.nextInt();

        int arr[][]=new int[m][n];

        System.out.print("Enter the Matrix Elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
            
        }
        int r1,c1,r2,c2;

        System.out.println("Enter the r1 cordinates");
        r1=sc.nextInt();
        System.out.println("Enter the c1 Cordinates");
        c1=sc.nextInt();
        System.out.println("Enter the r2 Cordinates");
        r2=sc.nextInt();
        System.out.println("Enter the C2 cordinates");
        c2=sc.nextInt();

        int result=findSumMatrix(arr, r1, c1, r2, c2);
        System.out.println("The sum ofelements is "+result);


    }
    
}

//TC=O(mxn)
//SC=O(1)

