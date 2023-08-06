import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class enframe {
    JFrame frame=new JFrame("Encryption/Decryption");
    JButton b1=new JButton("Select");
    JButton b2=new JButton("Encrypt / Decrypt");
    JTextField ft=new JTextField(10);
    enframe(){
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);

        b1.setSize(100, 30);
        b1.setFocusable(false);
        b1.setLocation(10,70);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFileChooser chooser=new JFileChooser();
                chooser.showOpenDialog(null);
                ft.setText(chooser.getSelectedFile().getAbsolutePath());
            }
        });

        b2.setSize(170, 30);
        b2.setFocusable(false);
        b2.setLocation(100,150);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                File file= new File(ft.getText());
                frame.dispose();
                new fileEncripter(file);
            }
        });
        ft.setLocation(115, 70);
        ft.setSize(200, 30);
        frame.add(ft);
        
        


        frame.add(b1);
        frame.add(b2);

    }
}
