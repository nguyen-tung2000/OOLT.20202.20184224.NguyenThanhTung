import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class test{
    public static void main(String[] args){
        JTextField f1=new JTextField();
        JTextField f2=new JTextField();
        Object[] fields={"A",f1,"B",f2};
        JOptionPane.showConfirmDialog(null, fields, "test", JOptionPane.OK_CANCEL_OPTION);
                    System.out.print(f2.getText());
        
        
    }
}
