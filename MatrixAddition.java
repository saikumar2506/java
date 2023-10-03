import java.io.*;
import java.util.*;
public class MatrixAddition
{
    public static void main(String args[]){
        int arr[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows : ");
        int r=sc.nextInt();
        System.out.println("Enter no.of coloumns : ");
        int c=sc.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int res[][] = new int[r][c];
        System.out.println("Total no.of elements in the matrix");
        System.out.println("Ente elements into matrix A:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter elements into matrix B:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The Resultant Matrix is");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
