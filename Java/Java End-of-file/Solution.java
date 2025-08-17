import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String c;
        int lno=1;
        while(s.hasNextLine())
        {
            c=s.nextLine();
            System.out.println(lno+" "+c);
            lno++;
        }
    }
}