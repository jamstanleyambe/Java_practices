import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

private  JButton btn;
private  JTextArea textarea;
    public MainFrame(){
        super("hello world");
        btn = new JButton("button");
        textarea = new JTextArea();

        setLayout(new BorderLayout());
        add(textarea, BorderLayout.CENTER);
        add(btn,  BorderLayout.SOUTH);
        JFrame frame = new JFrame();
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }


}
