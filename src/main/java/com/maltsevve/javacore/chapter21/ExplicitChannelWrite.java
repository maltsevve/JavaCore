package main.java.com.maltsevve.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class ExplicitChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {

            ByteBuffer mBuf = ByteBuffer.allocate(26);
            for (int i = 0; i < 26; i++)
                mBuf.put((byte)('A' + i)); // каждый вызов метода put смещает текущую позицию
            mBuf.rewind(); // требуется для обнуления текущей позиции после записи данных
            fChan.write(mBuf);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
            System.exit(1);
        }
    }
}
