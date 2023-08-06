import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class fileEncripter {
    fileEncripter(File file){
       try {
        FileInputStream fis=new FileInputStream(file);
        byte data[]=new byte[fis.available()];
        fis.read(data);
        int i=0;
        for(byte b:data){
            data[i]=(byte)(data[i]^15);
            i++;
        }
        
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);
        fis.close();
        fos.close();
        JOptionPane.showMessageDialog(null,"Done");
       } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Failed");
        e.getStackTrace();
       }
    }
}
