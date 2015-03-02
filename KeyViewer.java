import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyViewer extends JFrame implements KeyListener {
    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press any key in the text field.");
    
    KeyViewer () {
        super("KeyViewer");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyText.addKeyListener(this);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);
        setVisible(true);
    }
    
    public void keyTyped(KeyEvent input) {
        char key = input.getKeyChar();
        keyLabel.setText("You pressed " + key);
    }
    
    public void keyPressed(KeyEvent txt) {
        // do nothing
    }
    
    public void keyReleased(KeyEvent txt) {
        // do nothing
    }
    
    public static void main(String[] args) {
        KeyViewer frame = new KeyViewer();
    }
}