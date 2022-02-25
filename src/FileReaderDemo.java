import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.NullPointerException;




public class FileReaderDemo {
    public static void main(String[] args) {

        int readCharacter;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/test.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("could  not open file, please check path ");
        }
        //now the file is open

        try {
            do {
                readCharacter = fileInputStream.read();
                if (readCharacter != -1) {
                    System.out.print((char) readCharacter);
                }
            } while (readCharacter != -1);

        } catch (IOException ioException) {
            System.err.println("Error in reading file");
        } catch (NullPointerException nullPointerException) {
            System.err.println("the file input read is reference to null");
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException ioException) {
                System.err.println("Error in closing the file");
            }
        }

    }
}