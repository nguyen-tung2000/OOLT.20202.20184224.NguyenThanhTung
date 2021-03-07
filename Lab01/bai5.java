import javax.swing.JOptionPane;
public class bai5 {
    public static void main(String[] args){
        String a,b;
        a = JOptionPane.showInputDialog(null,"Nhap so thu nhat","So thu nhat",JOptionPane.INFORMATION_MESSAGE);
        b = JOptionPane.showInputDialog(null,"Nhap so thu hai","So thu hai",JOptionPane.INFORMATION_MESSAGE);
        double c = Double.parseDouble(a);
        double d= Double.parseDouble(b);
        JOptionPane.showMessageDialog(null,c+d,"Tong hai so",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,c-d,"Hieu hai so",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,c*d,"Tich hai so",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,c/d,"Thuong hai so",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
