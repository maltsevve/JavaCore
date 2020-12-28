package main.java.com.maltsevve.javacore.chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.InvalidPathException;

class ExplicitChannelReadOld {
    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;
        int count;

        try {
            fIn = new FileInputStream("test.txt");
            fChan = fIn.getChannel();
            mBuf = ByteBuffer.allocate(128);

            do {
                count = fChan.read(mBuf);
                if (count != -1) {
                    (mBuf).rewind();

                    for (int i = 0; i < count; i++)
                        System.out.print((char) (mBuf).get());
                }
            } while (count != -1);

            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
