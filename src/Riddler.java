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
        // TODO: Complete the decryptOne() function.
        String decrypted = "";
        int shift = 0;
        for (int i = 0; i < encrypted.length(); i++) {
            if (!Character.isLetter(encrypted.charAt(i))) {
                if (Character.isUpperCase(encrypted.charAt(i))) {
                    if ((int)encrypted.charAt(i) + 9 > 90) {
                        shift = 65 + (int)encrypted.charAt(i) + 9 - 90;
                    }
                }
                else {
                    if ((int)encrypted.charAt(i) + 9 > 122) {
                        shift = 97 + (int)encrypted.charAt(i) + 9 - 122;
                    }
                }
                decrypted += (char) ((int)encrypted.charAt(i) + shift);
            }
            else {
                decrypted += encrypted.charAt(i);
            }
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        // TODO: Complete the decryptTwo() function.
        String decrypted = "";
        String mini = "";
        char toAdd = ' ';
        for (int i = 0; i < encrypted.length(); i++) {
            if (encrypted.charAt(i) != ' ') {
                mini += encrypted.charAt(i);
            }
            else {
                int num = Integer.valueOf(mini);
                toAdd = (char) num;
                decrypted += toAdd;
            }
        }
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        // TODO: Complete the decryptThree() function.
        String decrypted = "";
        String binary = "";
        char toAdd = ' ';
        for (int i = 0; i < encrypted.length(); i++) {
            if (i % 7 != 0) {
                binary += encrypted.charAt(i);
            }
            else {
                int parseInt = Integer.parseInt(binary, 2);
                toAdd = (char)parseInt;
                decrypted += toAdd;
            }
        }
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
