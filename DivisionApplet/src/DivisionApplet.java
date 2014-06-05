import java.applet.Applet;
import java.awt.*;

public class DivisionApplet extends Applet {

    TextField textField1, textField2;
    String answerStr;

    public void init() {
        textField1 = new TextField(20);
        add(textField1);
        textField2 = new TextField(20);
        add(textField2);
        answerStr = "";
    }

    public boolean action(Event evt, Object arg) {
        String str1 = textField1.getText();
        String str2 = textField2.getText();
        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);
        int answer = int1 / int2;
        answerStr = str1 + "/" + str2 + "=" + String.valueOf(answer);
        repaint();
        return false;
    }

    public void paint(Graphics g) {
        Font font = new Font("Times New Roman", Font.PLAIN, 24);
        g.setFont(font);
        g.drawString(answerStr, 50, 100);
    }

}
