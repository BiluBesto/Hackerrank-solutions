import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++)
            {
                int res=a,ct=0,temp=1;
                while(ct!=j+1)
                {
                    res+=temp*b;
                    temp*=2;
                    ct++;
                }
                System.out.print(res+" ");
            }
            System.out.println();
        }
        in.close();
    }
}