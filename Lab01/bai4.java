import javax.swing.JOptionPane;
public class bai4 {
    public static void main(String[] args){
        String str1,str2;
        String StrN ="You've just entered";
        str1 = JOptionPane.showInputDialog(null,"Nhap so thu nhat","So thu nhat",JOptionPane.INFORMATION_MESSAGE);
        StrN += str1 + "and";
        str2 =JOptionPane.showInputDialog(null, "Nhap so thu 2","So thu 2",JOptionPane.INFORMATION_MESSAGE);
        StrN += str2;
        JOptionPane.showMessageDialog(null,StrN,"Show two number", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
