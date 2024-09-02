class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            while ((i < chars.length - 1) && (chars[i] == chars[i + 1])) {
                i++;
                count++;
            }
            sb.append(chars[i]);
            if (count > 1) {
                sb.append(count);
            }
        }
        String val = sb.toString();
        char[] k = val.toCharArray();
        for (int i = 0; i < k.length; i++) {
            chars[i] = k[i];
        }
        
        return k.length;
    }
}
