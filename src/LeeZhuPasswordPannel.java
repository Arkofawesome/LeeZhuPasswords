/**
 * @author Jackson Lee
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;

public class LeeZhuPasswordPannel extends JPanel {
    private final int SCREEN_WIDTH = 400;
    private final int SCREEN_HEIGHT = 400;
    private final int MSG_BOX_WIDTH = 200;
    private final int MSG_BOX_HEIGHT = 50;
    private JTextField messageField = new JTextField(25);
    private String password;
    private Color passwordStrengthColor;
    private int colorLength;
    private int passwordStrength;
    private JLabel strengthExplanation;
    private LeeZhuPasswords passwordTester;

    LeeZhuPasswordPannel() {
        this.setLayout(null);
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        password = "";
        start();
        passwordStrengthColor = Color.RED;
        colorLength = (SCREEN_WIDTH - 60) / 4;
        passwordStrength = 0;
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
        g.setColor(passwordStrengthColor);
        g.fillRect(30, 250, colorLength, 20);
        g.setColor(Color.BLACK);
        g.drawRect(30, 250, SCREEN_WIDTH - 60, 20);
        g.drawLine((SCREEN_WIDTH - 60) / 4 + 30, 250, (SCREEN_WIDTH - 60) / 4 + 30, 270);
        g.drawLine((SCREEN_WIDTH - 60) / 4 * 2 + 30, 250, (SCREEN_WIDTH - 60) / 4 * 2 + 30, 270);
        g.drawLine((SCREEN_WIDTH - 60) / 4 * 3 + 30, 250, (SCREEN_WIDTH - 60) / 4 * 3 + 30, 270);
    }
    public void start() {
        passwordTester = new LeeZhuPasswords();
        msg_Box();
        passwordStrengthExplanation();
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
                    strengthExplanation.setVisible(false);
                    password = messageField.getText();
//                    System.out.println(password);
                    testPassword();
                    repaint();
                }
            });
    }

    public void testPassword() {
        passwordTester.setPassword(password);
        try {
//            System.out.println(passwordStrength);
            passwordStrength = passwordTester.determineStrength();
            if (passwordStrength > 5) {
                passwordStrengthColor = Color.green;
                colorLength = (SCREEN_WIDTH - 60);
                testExplanation();
            } else if (passwordStrength > 3) {
                passwordStrengthColor = Color.YELLOW;
                colorLength = (SCREEN_WIDTH - 60) / 4 * 3;
                testExplanation();
            } else if (passwordStrength > 1) {
                passwordStrengthColor = Color.ORANGE;
                colorLength = (SCREEN_WIDTH - 60) / 4 * 2;
//                passwordStrength = 1;
                testExplanation();
            } else {
                passwordStrengthColor = Color.RED;
                colorLength = (SCREEN_WIDTH - 60) / 4;
                testExplanation();
            }
            System.out.println(passwordStrength);
        } catch (LeeZhuPasswordFormatException e) {
            error();
        }
    }


    public void error() {
        passwordStrengthColor = Color.RED;
        colorLength = (SCREEN_WIDTH - 60) / 4;
        passwordStrength = 0;

        Font ExplanationFont = new Font("Calibri", Font.BOLD, 38);

        strengthExplanation = new JLabel("Error, please try again!");
        strengthExplanation.setFont(ExplanationFont);
        strengthExplanation.setBounds(25,SCREEN_HEIGHT / 2 + 10,SCREEN_WIDTH, 50);
        strengthExplanation.setVisible(true);
        this.add(strengthExplanation);
    }

    public void passwordStrengthExplanation() {
        Font ExplanationFont = new Font("Calibri", Font.BOLD, 38);

        strengthExplanation = new JLabel("" + passwordStrength);
        strengthExplanation.setFont(ExplanationFont);
        strengthExplanation.setBounds(SCREEN_WIDTH / 2 - 10,SCREEN_HEIGHT / 2 + 10,SCREEN_WIDTH, 50);
        strengthExplanation.setVisible(true);
        this.add(strengthExplanation);

        
    }
    public void testExplanation() {
        strengthExplanation.setVisible(true);
        if (passwordStrength > 0) {
            strengthExplanation.setText("+" + passwordStrength);
            strengthExplanation.setBounds(SCREEN_WIDTH / 2 - 15,SCREEN_HEIGHT / 2 + 10,SCREEN_WIDTH, 50);
        }
        else if (passwordStrength < 0) {
            strengthExplanation.setText("-" + passwordStrength);
            strengthExplanation.setBounds(SCREEN_WIDTH / 2 - 15,SCREEN_HEIGHT / 2 + 10,SCREEN_WIDTH, 50);
        }
        else {
            strengthExplanation.setText("" + passwordStrength);
            strengthExplanation.setBounds(SCREEN_WIDTH / 2 - 10,SCREEN_HEIGHT / 2 + 10,SCREEN_WIDTH, 50);
        }

    }

}


