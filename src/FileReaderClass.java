import java.io.*;

public class FileReaderClass {

    public static void main(String[] args) {

        try {
            File file = new File("src/textFile.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {
                System.out.println(text);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }
}
