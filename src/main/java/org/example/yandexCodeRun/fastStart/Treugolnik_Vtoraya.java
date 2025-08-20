package org.example.yandexCodeRun.fastStart;

import java.io.*;

public class Treugolnik_Vtoraya {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int first = Integer.parseInt(reader.readLine());
            int second = Integer.parseInt(reader.readLine());
            int third = Integer.parseInt(reader.readLine());

            if (first + second > third & second + third > first & first + third > second) {
                writer.write("YES");
            } else {
                writer.write("NO");
            }
        }
    }

}
