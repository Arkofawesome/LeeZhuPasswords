import javax.swing.*;

public class LeeZhuPasswordApp extends JFrame{
    LeeZhuPasswordApp(LeeZhuPasswordPannel passwordPannel) {
        this.add(passwordPannel);
        this.setTitle("Messages");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
