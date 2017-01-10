package by.grodno.files;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    private FileWriter writer;

    public MyFileWriter(String filename) throws IOException {
        writer = new FileWriter(filename);
    }

    public void writeLine(String l) throws IOException {
        writer.write(l);
    }

    public void close() throws IOException {
        writer.close();
    }
}
