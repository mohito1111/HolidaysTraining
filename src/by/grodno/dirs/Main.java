package by.grodno.dirs;

import java.io.IOException;

public class Main {
    private static final String HELLO_STRING = "Введите имя и фамилию";
    private static final int NAME_COUNT = 2;
    private static String fio;
    private static final String admin = "ADMIN_ADMIN";

    public static void main(String[] args) throws IOException {
        ConsoleReader console = new ConsoleReader();
        fio = console.read(NAME_COUNT,HELLO_STRING);
        decision(fio);

    }

    public static void decision(String s){
        DirOperations dir = new DirOperations();
        switch (s)
        {
            case "":
            {
                dir.deleteAllDirs();
                break;
            }
            case admin:
            {
                dir.showDirList();
                break;
            }
            default:
            {
                dir.mkDir(s);
            }
        }
    }
}
