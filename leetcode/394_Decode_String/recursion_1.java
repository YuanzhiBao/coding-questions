public class Solution {
    public String decodeString(String s) {
        if (s.length() == 0) return "";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int digit_begin = i;
                while (Character.isDigit(s.charAt(++i)));
                int num = Integer.valueOf(s.substring(digit_begin, i));
                int count = 1;
                int str_begin = i + 1;
                i++;
                while (count != 0) {
                    if (s.charAt(i) == ']') count--;
                    else if (s.charAt(i) == '[') count++;
                    i++;
                }
                i--;
                String inner = decodeString(s.substring(str_begin, i));
                for (int j = 0; j < num; j++) {
                    res.append(inner);
                }
            } else {
                res.append(c);
            } 
        }
        return res.toString();
    }
}