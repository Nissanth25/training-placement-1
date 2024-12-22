import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        Set<Pair> uniquePairs = new HashSet<>();
        
        for (int i = 0; i < t; i++) {
            Pair pair = new Pair(pair_left[i], pair_right[i]);
            uniquePairs.add(pair);
            System.out.println(uniquePairs.size());
        }
        s.close();
    }
}
class Pair {
    String first;
    String second;
    
    Pair(String first, String second) {
        this.first = first;
        this.second = second;
    }  
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }
    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
