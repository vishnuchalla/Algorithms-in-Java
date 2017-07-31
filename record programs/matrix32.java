import java.util.*;
class matrix
{
 public static void main(String args[])
 {
  System.out.println("Enter the no of rows and coloumns of matrix A:");
  Scanner s=new Scanner(System.in);
  int p=s.nextInt();
  int q=s.nextInt();
  int a[][]=new int[p][q];
  System.out.println("Enter the no of rows and coloumns of matrix B:");
  int m=s.nextInt();
  int n=s.nextInt();
  int b[][]=new int[m][n];
  System.out.println("Enter the elements of matrix A:");
  for(int i=0;i<p;i++)
  {
   for(int j=0;j<q;j++)
   a[i][j]=s.nextInt();
  }
  System.out.println("Enter the elements of matrix B:");
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
   b[i][j]=s.nextInt();
  }
  int c[][]=new int[p][n];
  System.out.println("Matrix Multiplication:");
  for(int i=0;i<p;i++)
  {
   for(int j=0;j<n;j++)
   {c[i][j]=0;
    for(int k=0;k<m;k++)
    {
    int pr=a[i][k]*b[k][j];
    c[i][j]=c[i][j]+pr;
   }}}
   for(int i=0;i<p;i++)
   {
    for(int j=0;j<n;j++)
    System.out.print(c[i][j]+"\t");
    System.out.println();
   }
}
}
