package com.gmail.ahmedded.practise.bufferReader;

import java.io.*;

public class notes {
    public static void main(String[] args) {
        try {
            // -----------------------------
            // 0) Создание BufferedReader
            // -----------------------------
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            // FileReader читает символ за символом из файла
            // BufferedReader добавляет буферизацию для ускорения чтения
            // -----------------------------

            // -----------------------------
            // 1) read() — чтение одного символа
            // -----------------------------
            int ch = br.read();
            System.out.println("read() — первый символ: " + (char)ch);
            // read() возвращает int (код символа), -1 если конец файла
            // Зачем: когда нужно посимвольно обрабатывать текст

            // -----------------------------
            // 2) read(char[] cbuf, int off, int len) — чтение массива символов
            // -----------------------------
            char[] buffer = new char[5];
            int numRead = br.read(buffer, 0, buffer.length);
            System.out.println("read(char[]...) — прочитано символов: " + numRead + ", содержимое: " + new String(buffer, 0, numRead));
            // Зачем: читать сразу блок символов, быстрее чем по одному

            // -----------------------------
            // 3) readLine() — чтение строки целиком
            // -----------------------------
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("readLine() — строка: " + line);
            }
            // readLine() возвращает строку до перевода строки или null если конец файла
            // Зачем: удобно обрабатывать текстовые файлы построчно

            // -----------------------------
            // 4) ready() — проверка готовности данных
            // -----------------------------
            if (br.ready()) {
                System.out.println("ready() — данные готовы к чтению");
            } else {
                System.out.println("ready() — поток на конце файла, данных нет");
            }
            // ready() возвращает true если можно читать без блокировки
            // Зачем: проверять перед чтением, особенно при работе с сетью или консолью

            // -----------------------------
            // 5) close() — закрытие потока
            // -----------------------------
            br.close();
            System.out.println("close() — поток закрыт, ресурсы освобождены");
            // Зачем: важно всегда закрывать поток, чтобы не было утечки ресурсов

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
