package by.grodno.dirs;

import java.util.Scanner;

public class ConsoleReader {
    String fio;

    public String read(int count,String s){
        fio = new String();
        String temp;
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < count-1; i++)
        {
            temp = sc.nextLine().toUpperCase();
            if (!temp.equals(""))
            {
                fio += temp + "_";
            }
        }
        fio += sc.nextLine().toUpperCase();
        return fio;
    }
}
