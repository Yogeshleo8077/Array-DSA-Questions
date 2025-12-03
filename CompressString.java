public class CompressString {
    public static String compressString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                compressed.append(count);

                // reset count for new character
                count = 1;
            }
        }

        // do not forget to add last pair
        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);

        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String args[]) {
        String str = "aaabbcaaa";
        System.out.println(compressString(str));
    }
}