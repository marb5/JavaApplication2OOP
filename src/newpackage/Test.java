package newpackage;
import javaapplication2oop.Client;

/**
 *
 * @author Marcin
 */
public class Test {
    public static void main(String[] args) {
        Client a = new Client("Marcin");
        Client b = new Client("Ryszard");
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(Client.nextId);
    }
}
