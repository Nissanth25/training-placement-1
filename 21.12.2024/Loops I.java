import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
           int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        if(N <= 20 && N >= 2){    
        } for(int a = 1; a <= 10; a++){
                int mult = N * a;
                        System.out.println(N + " x " + a + " = " + mult);
                }
        }
}
