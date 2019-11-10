/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiah;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public abstract class hadiah2 implements ActionListener {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame ("I am a JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20, 20, 300, 100);
        frame.getContentPane().setLayout(null);
        
        JButton butt = new JButton ("Click me");
        frame.getContentPane().add(butt);
        butt.setBounds(20, 20, 200, 20);
        
        hadiah2 app = new hadiah2 () {};
        
        app.label = new JLabel("0 clicks");
        app.label.setBounds(20, 40, 200, 20);
        frame.getContentPane().add(app.label);
        
        butt.addActionListener(app);
        frame.setVisible(true);
        
        }
    public void actionPerformed(ActionEvent e)
    {
        clickCount=+2;
        label.setText("Clicks = "+clickCount);
        
    }
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable () {
        public void run () {
            createAndShowGUI();
        }
    });
    }
int clickCount=5;
JLabel label;
}

