import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         // 1. Sum of lengths
        System.out.println(A.length() + B.length());

        // 2. Is A lexicographically greater than B?
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        // 3. Capitalize the first letter of each and print them separated by a space
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capA + " " + capB);

        sc.close();
    }
}



