class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        char[] chr = s.toCharArray();
        StringBuilder[] str = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            str[i] = new StringBuilder();
        }
        
        int pointer = 0, flag = 0, count = 0;
        
        while (count < s.length()) {
            str[pointer].append(chr[count]);
            if (flag == 0) pointer++;
            else if (flag == 1) pointer--;

            if (pointer == numRows - 1 || pointer == 0) {
                flag = (flag == 0) ? 1 : 0;
            }
            count++;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : str) {
            result.append(sb);
        }
        
        return result.toString();
    }
}
