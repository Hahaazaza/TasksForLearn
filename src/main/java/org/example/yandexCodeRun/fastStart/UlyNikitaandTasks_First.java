package org.example.yandexCodeRun.fastStart;

import java.io.*;

public class UlyNikitaandTasks_First {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String[] parts = reader.readLine().split(" ");
            long A = Long.parseLong(parts[0]);
            long B = Long.parseLong(parts[1]);

            writer.write(String.valueOf(A + B));
            writer.newLine();

            // reader.close();
            // writer.close();
            /*
            Эти close тут не нужны, блок try автоматически закрывает
            и не дает тратить системные ресурсы. Также предотвращает утечки в памяти,
            и в целом чище.
            */
        }
    }
}
