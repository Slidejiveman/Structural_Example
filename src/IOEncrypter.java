/**
 * This class writes out an encrypted stream and then decrypts it before
 * calling the IODecorator, which wraps a PrimaryIOManager. This prints the decrypted
 * output out to the screen.
 */
public class IOEncrypter extends IODecorator {

    IOEncrypter(IOManager inner) {
        super(inner);
    }

    @Override
    public void write(String[] s) {
        super.write(s);
        System.out.println("ENCRYPT:    ");
        StringBuilder sb = new StringBuilder(s[0]);
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, (char)(sb.charAt(i) - 5));
        }
        s[0] = sb.toString();
    }

    @Override
    public void read(String[] s) {
        StringBuilder sb = new StringBuilder(s[0]);
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, (char) (sb.charAt(i) + 5));
        }
        s[0] = sb.toString();
        System.out.println( "DECRYPT:    ");
        super.read(s);
    }
}
