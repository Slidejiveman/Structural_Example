/**
 * Entry point of the program.
 * This program accepts a password (or key) and an input.
 * The input is then encrypted. Entering the password again, decrypts the input
 * and prints it to the screen.
 *
 * Reference: https://sourcemaking.com/design_patterns/decorator/java/2
 */
public class Main {

    // The main method demonstrates a pretty standard decorator idiom: nested objects.
    public static void main(String[] args) {
        IOManager stream = new IOCommandInterface(new IOEncrypter(new PrimaryIOManager()));
        String[] str = {""};                      // empty string array to work with.
        stream.write(str);                        // encrypted value is now in the string array
        System.out.println("MAIN:    " + str[0]); // show this
        stream.read(str);                         // read the password. Decryption is then shown.
    }
}
