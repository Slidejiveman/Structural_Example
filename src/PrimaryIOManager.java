import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The primary IOManager is itself a decorator of a Buffered reader, which
 * may actually be a decorator of the InputStreamReader. The same could be said about the
 * InputStreamReader and System.in.
 *
 * This class prompts the user for unencrypted input and prints out unencrypted input.
 */
class PrimaryIOManager implements IOManager {

    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void write(String[] s) {
        System.out.print("INPUT:    ");
        try {
            s[0] = input.readLine();
        } catch (IOException iex) {
            iex.printStackTrace();
        }
    }

    @Override
    public void read(String[] s) {
        System.out.println("OUTPUT:    " + s[0]);
    }
}
