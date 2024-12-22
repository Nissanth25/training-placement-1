import java.io.*;
import java.util.*;
public class Solution {

public static String palindrome(String A){
    char[] char_array = A.toCharArray();
    int i = 0;
    int j = A.length()-1;
    while(i<j){
     if(char_array[i]!=char_array[j]){
         return "No";
     }
     i++;
     j--;
    }
    return "Yes";
    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String A = scanner.next();
    System.out.println(palindrome(A));
} }



