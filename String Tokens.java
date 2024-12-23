import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    StringTokenizer st = new StringTokenizer(s, " !,?._'@]+");
    int n = st.countTokens();
    System.out.println(n);
    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
    }
   }
}

