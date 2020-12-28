package main.java.com.maltsevve.javacore.chapter22;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

class Whois {
    public static void main(String[] args) throws Exception {
        int c;

        try (Socket s = new Socket("whois.internic.net", 43)) {
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            // сформировать строку запроса
            String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n ";

            byte[] buf = str.getBytes();

            // послать запрос
            out.write(buf);

            // прочитать и вывести ответ
            while ((c = in.read()) != -1)
                System.out.print((char) c);
        }
    }
}
