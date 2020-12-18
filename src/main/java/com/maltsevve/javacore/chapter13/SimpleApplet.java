package main.java.com.maltsevve.javacore.chapter13;

import java.applet.Applet;
import java.awt.*;
/*
<applet code="SimpleApplet" width=200 height=бO>
</applet>
 */

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Простейший аплет", 20, 20);
    }
}
