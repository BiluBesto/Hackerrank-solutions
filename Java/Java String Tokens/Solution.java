import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String alt="";
        boolean flag = false;
        int lencur=0;
        for (char i : s.toCharArray())
        {
            if(i!='!'&&i!=','&&i!='.'&&i!=' '&&i!='?'&&i!='_'&&i!='\''&&i!='@')
            {
                alt = alt + i;
                if(!flag)
                lencur++;
                flag  = true;
            }
            else if (flag)
            {
                flag = false;
                alt = alt + " ";
            }
           
        }
        System.out.println(lencur);
        for (char i:alt.toCharArray())
        {
            if(i!=' ')
                System.out.print(i);
            else
                System.out.println();
        }
        scan.close();
    }
}

