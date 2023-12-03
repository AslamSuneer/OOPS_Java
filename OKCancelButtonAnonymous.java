import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;


public class OkCancel extends JFrame {
    JLabel jlab;
    OkCancel(){
        JFrame jfrm = new JFrame("An Event example");
        jfrm.setLayout(new FlowLayout()); //layout setting
        jfrm.setSize(220,90); // size setting
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit window on close button
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");
        jbtOK.addActionListener(new ActionListener() { //registering the event with anonymous object
            public void actionPerformed(ActionEvent e) {
                jlab.setText("OK Pressed");
            }
        }); 
        jbtCancel.addActionListener(new ActionListener() { //registering the event with anonymous object
            public void actionPerformed(ActionEvent e) {
                jlab.setText("CANCEL Pressed");
            }
        });
        jfrm.add(jbtOK); // add button
        jfrm.add(jbtCancel); // add button
        jlab=new JLabel("Press a button!"); // set inital label text
        jfrm.add(jlab); // add label
        jfrm.setVisible(true); // setting visibility to true
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){ // override run method
                new OkCancel();
            }
        });
    }
}
