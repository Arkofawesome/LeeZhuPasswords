import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;

public class PasswordPannel extends JPanel {
    private final int SCREEN_WIDTH = 400;
    private final int SCREEN_HEIGHT = 400;
    private final int MSG_BOX_WIDTH = 200;
    private final int MSG_BOX_HEIGHT = 50;
    private JTextField messageField = new JTextField(25);
    private String password;
    private Color passwordStrengthColor;

    PasswordPannel() {
        this.setLayout(null);
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        password = "";
        start();
        passwordStrengthColor = Color.RED;
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
        g.setColor(passwordStrengthColor);
        g.fillRect(30, 250, SCREEN_WIDTH - 60, 20);
    }
    public void start() {
        msg_Box();

    }

    public void msg_Box() {
        messageField.setBounds(SCREEN_WIDTH / 2 - MSG_BOX_WIDTH / 2, 50, MSG_BOX_WIDTH, MSG_BOX_HEIGHT);
        messageField.setVisible(true);
        messageField.setFont(new Font("Arial", Font.BOLD, 16));
        messageField.setFocusable(true);
        messageField.setMargin(new Insets(5,10,5,10));
        this.add(messageField);
        messageField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    password = messageField.getText();
                    System.out.println(password);
                    testPassword();
                    repaint();
                }
            });
    }

    public void testPassword() {
        if (password.length() >= 17) {
            passwordStrengthColor = Color.green;
        }
        else if (password.length() >= 12) {
            passwordStrengthColor = Color.YELLOW;
        }
        else if (password.length() >= 8) {
            passwordStrengthColor = Color.ORANGE;
        }
        else {
            passwordStrengthColor = Color.RED;
        }
    }

}


