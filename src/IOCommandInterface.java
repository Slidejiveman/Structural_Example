import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class accepts the Password, or key, from the user. The password is
 * used first for encryption, then for decryption.
 */
public class IOCommandInterface extends IODecorator {

    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    IOCommandInterface(IOManager ioManager) {
        super(ioManager);
    }

    @Override
    public void write(String[] s) {
        System.out.print("PASSWORD:    ");
        try {
            in.readLine();
        } catch (IOException iex) {
            iex.printStackTrace();
        }
        super.write(s);
    }

    @Override
    public void read(String[] s) {
        System.out.print("PASSWORD:    ");
        try {
            in.readLine();
        } catch (IOException iex) {
            iex.printStackTrace();
        }
        super.read(s);
    }
}
