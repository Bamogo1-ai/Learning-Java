package compression;

public class StringCompressor {

    public static String compress(String str) {
        // Si la chaîne est vide ou de longueur 1, la compression n'a aucun intérêt
        if (str == null || str.length() <= 1) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1; 
            }
        }

        
        compressed.append(str.charAt(str.length() - 1)).append(count);

        
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa")); 
        System.out.println(compress("abc"));         
    }
}
