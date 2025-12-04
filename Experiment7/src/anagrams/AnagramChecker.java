package anagrams;

import java.util.Arrays;

public class AnagramChecker {

    public static boolean areAnagrams(String s1, String s2) {

        // 1. Mise en minuscules (insensible à la casse)
        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");

        // 2. Si les longueurs sont différentes → pas anagrammes
        if (s1.length() != s2.length()) {
            return false;
        }

        // 3. Convertir en tableaux de caractères
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // 4. Trier les lettres
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // 5. Comparer les tableaux triés
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("Listen", "Silent"));          // true
        System.out.println(areAnagrams("Astronomer", "Moon starer")); // true
        System.out.println(areAnagrams("Hello", "world"));            // false
    }
}
