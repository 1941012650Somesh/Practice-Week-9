import java.util.*;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=n;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int m=i;m>1;m--)
            {
                System.out.print(m);
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        n=n-1;
        for(int i=n;i>=1;i--)
        {
            for(int k=n+1;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int m=i;m>1;m--)
            {
                System.out.print(m);
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
