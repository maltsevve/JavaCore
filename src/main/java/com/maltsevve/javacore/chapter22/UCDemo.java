package main.java.com.maltsevve.javacore.chapter22;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

class UCDemo {
    public static void main(String[] args) throws Exception{
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();

        long date = hpCon.getDate();
        if (date == 0)
            System.out.println("Сведения о дате отсутствуют");
        else
            System.out.println("Дата: " + new Date(date));

        System.out.println("Тип содержимого: " + hpCon.getContentType());

        date = hpCon.getExpiration();
        if (date == 0)
            System.out.println("Сведения о сроке действия отсутствуют.");
        else System.out.println("Срок действия истекает: " + new Date(date));

        date = hpCon.getLastModified();
        if (date == 0)
            System.out.println("Сведения о дате последней модификвции.");
        else System.out.println("Дата последней модификвции: " + new Date(date));

        long len = hpCon.getContentLength();
        if (len == -1)
            System.out.println("Длина содержимого недоступнв.");
        else
            System.out.println("Длина содердимого: " + len);

        if (len != 0) {
            System.out.println("=== Содержимое ===");
            InputStream input = hpCon.getInputStream();
            while ((c = input.read()) != -1)
                System.out.print((char) c);
            input.close();
        } else
            System.out.println("Содержимое недоступно.");
    }
}
