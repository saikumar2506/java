import java.io.*;
public class MatrixDemo {
    public static void main(String args[])
    {
        int a[][] = new int[3][5];
        a[0][0]=11;
        a[0][1]=22;
        a[0][2]=33;
        a[1][0]=44;
        a[1][1]=55;
        a[1][2]=66;
        a[2][0]=77;
        a[2][1]=88;
        a[2][2]=99;
        System.out.println("Displaying matrix elements ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
