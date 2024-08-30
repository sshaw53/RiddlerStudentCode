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
        // Iterate through the letters in the encrypted string
        for (int i = 0; i < encrypted.length(); i++) {
            // If the character is a letter, shift it by 9 -> the Caesar cipher
            if (Character.isAlphabetic(encrypted.charAt(i))) {
                // When shifting, make sure that it doesn't spill over by using modulus 26
                if (Character.isUpperCase(encrypted.charAt(i))) {
                    shifted = (char)((encrypted.charAt(i) - 'A' + 9) % 26 + 'A');
                }
                else {
                    shifted = (char)((encrypted.charAt(i) - 'a' + 9) % 26 + 'a');
                }
                // Add the character to the decrypted String
                decrypted += shifted;
            }
            else {
                // If the character isn't alphabetic, just add it
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
            // Each number is separated by spaces, so if there isn't a space at the given character,
            // add it to a temp string called mini
            if (encrypted.charAt(i) != ' ') {
                mini += encrypted.charAt(i);
            }
            // Once you reach a space, convert the mini temp (representing the number) to an int of that String
            // Then convert it to a char to add to decrypted and reset mini to an empty string for the next traverse
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
        String decrypted = "";
        String binary = "";
        int power = 1;
        for (int i = 0; i < encrypted.length() + 1; i++) {
            // If it hasn't reached the 8 character length (8-bit binary), keep adding the characters (0 or 1) to the binary String
            if (i == 0 || i % 8 != 0) {
                binary += encrypted.charAt(i);
            }
            // Once the binary String is 8 characters, convert it to decimal and add the char version of the decimal to the decrypted string
            // Then, reset the binary String for the next traverse
            else {
                int shift = 0;
                // Altering the multiplicative value so that the power increases for each value
                for (int j = 0; j < binary.length(); j++) {
                    shift += (binary.charAt(binary.length() - 1 - j) - '0') * power;
                    power = power * 2;
                }
                decrypted += (char)shift;
                binary = "";
                power = 1;
            }
        }
        System.out.println(decrypted);
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";
        char shifted = ' ';
        for (int i = 0; i < encrypted.length(); i++) {
            // codePointAt converts the symbol to decimal (using Unicode)
            // Subtracting 9951 because that's the shift from the Unicode truck value (representing the space) and then added the ' ' value back
            // to shift it back
            shifted = (char) ((encrypted.codePointAt(i) - 9951) + ' ');
            decrypted += shifted;
        }
        System.out.println(decrypted);
        return decrypted;
    }
}
