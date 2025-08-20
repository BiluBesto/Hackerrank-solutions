import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
       if (a.length() != b.length()) {
            return false;
        }
            a = a.toLowerCase();
        b = b.toLowerCase();

        int[] freq = new int[26]; // counts for a-z

        // Increase for a's characters, decrease for b's characters
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }

        // Check if all counts are 0
        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}