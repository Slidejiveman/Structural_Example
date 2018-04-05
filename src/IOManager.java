/**
 * This interface contains the two methods that will be shared between the core class
 * and its decorators. Since this is about IO, the two methods are read and write.
 *
 * Note: At times, these method names are misnomers based on the behavior of implementing classes.
 */
public interface IOManager {
    void write(String[] s);
    void read(String[] s);
}
