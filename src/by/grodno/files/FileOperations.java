package by.grodno.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
    public static final String defaulString = " - Проверено \n";

    public static void main(String[] args)
    {
        try {
            Scanner fileScanner = new Scanner(new File("review.txt"));
            MyFileWriter myFileWriter = new MyFileWriter("reviewed.txt");
            String line = new String();
            while (fileScanner.hasNext()) {
                line = fileScanner.nextLine() + defaulString;
                myFileWriter.writeLine(line);
            }
            myFileWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
