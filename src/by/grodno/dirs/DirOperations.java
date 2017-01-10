package by.grodno.dirs;

import java.io.File;

public class DirOperations {
    private static String currDir = new File("").getAbsolutePath()+"\\test\\";

    public boolean mkDir(String fileName)
    {
        File file = new File(currDir+fileName);
        System.out.println("Создана директория " + fileName);
        return file.mkdir();
    }

    public void showDirList(){
        File file = new File(currDir);
        System.out.println("Список директорий "+file.getAbsolutePath());
        for (File f:file.listFiles())
        {
            if (f.isDirectory())
                System.out.println(f.getName());
        }
    }

    public void deleteAllDirs(){
        File file = new File(currDir);
        for (File f:file.listFiles())
        {
            if (f.isDirectory())
            {
                f.delete();
            }
        }
        System.out.println("Все директории удалены");
    }

}
