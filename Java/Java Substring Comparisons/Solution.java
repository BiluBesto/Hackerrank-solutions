import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,0+k);
        String largest = s.substring(0,0+k);
        int i=0;
        while((s.length()-k-i)>=0)
        {
            if(smallest.compareTo(s.substring(i,i+k))>=0)
                smallest=s.substring(i,i+k);
            if(largest.compareTo(s.substring(i,i+k))<0)
                largest=s.substring(i,i+k);  
            i++;
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}