import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try (InputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Accessing properties
        String value = properties.getProperty("db.url");
        System.out.println("Value for key 'db.url': " + value);

        // Setting properties
        properties.setProperty("newKey", "newValue");

        // Saving properties
        try (OutputStream output = new FileOutputStream("config.properties")) {
            properties.store(output, "Updated properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
