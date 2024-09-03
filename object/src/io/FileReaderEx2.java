package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileReaderEx2 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader(".\\src\\io\\FileEx.java", Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(fr)) {

            int data = 0;
            String str = null;
            int lineNum = 1;
            // br.readLine() : 줄 단위로 읽어오기
            while ((str = br.readLine()) != null) {
                System.out.println(lineNum + "] " + str);
                lineNum++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
