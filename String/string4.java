public class string4 {
    public static int countPatterns(String str) {
        int count = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '0') {
                int j = i + 1;
                while (j < n && str.charAt(j) == '1') {
                    j++;
                }
                if (j < n && str.charAt(j) == '0') {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String input = "01101111010";
        int result = countPatterns(input);
        System.out.println("The total number of 0(1+)0 patterns is: " + result);
    }
}
