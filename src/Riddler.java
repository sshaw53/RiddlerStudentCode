/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: SIERRA
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";
        char shifted = ' ';
        for (int i = 0; i < encrypted.length(); i++) {
            if (Character.isAlphabetic(encrypted.charAt(i))) {
                if (Character.isUpperCase(encrypted.charAt(i))) {
                    shifted = (char)((encrypted.charAt(i) - 'A' + 9) % 26 + 'A');
                }
                else {
                    shifted = (char)((encrypted.charAt(i) - 'a' + 9) % 26 + 'a');
                }
                decrypted += shifted;
            }
            else {
                decrypted += encrypted.charAt(i);
            }
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        String mini = "";
        for (int i = 0; i < encrypted.length(); i++) {
            if (encrypted.charAt(i) != ' ') {
                mini += encrypted.charAt(i);
            }
            else {
                int num = Integer.parseInt(mini);
                decrypted += (char) num;
                mini = "";
            }
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        // TODO: Complete the decryptThree() function.
        String decrypted = "";
        String binary = "";
        for (int i = 0; i < encrypted.length() + 1; i++) {
            if (i == 0 || i % 8 != 0) {
                binary += encrypted.charAt(i);
            }
            else {
                int parseInt = Integer.parseInt(binary, 2);
                decrypted += (char)parseInt;
                binary = "";
            }
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";
        char shifted = ' ';
        // TODO: Complete the decryptFour() function.
        for (int i = 0; i < encrypted.length(); i++) {
            shifted = (char) ((encrypted.codePointAt(i) - 9951) + ' ');
            decrypted += shifted;
        }
        System.out.println(decrypted);
        return decrypted;
    }
}
