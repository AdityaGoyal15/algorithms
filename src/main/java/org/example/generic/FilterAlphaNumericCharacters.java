package org.example.generic;

public class FilterAlphaNumericCharacters {

    public String filter(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) || ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122) | ((int) str.charAt(i) >= 48 && (int) str.charAt(i) <= 57)) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
