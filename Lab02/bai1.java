import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;
public class bai1 {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null,"Do you want to change to first class ticket");
        JOptionPane.showMessageDialog(null,"you have chosen:"+(option==JOptionPane.YES_OPTION?"Yes":"no"));
        System.exit(0);
    }
    
}
