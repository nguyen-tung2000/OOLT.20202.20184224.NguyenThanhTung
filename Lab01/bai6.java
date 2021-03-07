import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class bai6{
    public static void main(String[] args){
        String[] options={"ax+b","ax+by","ax^2+bx+c","Thoat"};
        int x;
        do{
            x =JOptionPane.showOptionDialog(null,"chon chuong trinh","caculator", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(x==0){
        double a,b,c;
        String str;
        JOptionPane.showMessageDialog(null,"Nhap phuong trinh dang ax+b=c","Cu phap", JOptionPane.INFORMATION_MESSAGE);
        str = JOptionPane.showInputDialog(null,"Nhap phuong trinh","Phuong trinh",JOptionPane.INFORMATION_MESSAGE);
        String str1 = str.substring(0, str.indexOf('x'));
        if (str1.compareTo("") == 0) {
            str1="1";
        }
        a =Double.parseDouble(str1);
        String str2 = str.substring(str.indexOf('x')+1,str.indexOf('='));
        b =Double.parseDouble(str2);
        String str3 =str.substring(str.indexOf('=')+1,str.length());
        if(str3.compareTo("")==0){
            str3="0";
        }
        c= Double.parseDouble(str3);
        double d= (c-b)/a;
        JOptionPane.showMessageDialog(null,"Ngiem cua phuong trinh la:"+d,"Nghiem",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(x==1){
            String str1,str2;
            JOptionPane.showMessageDialog(null,"Nhap he phuong trinh dang ax+by=c","He Phuong Trinh",JOptionPane.INFORMATION_MESSAGE);
            JTextField f1 = new JTextField();
            JTextField f2 = new JTextField();
            Object[] fields ={"Nhap phuong trinh 1",f1,"Nhap Phuong trinh 2",f2};
            JOptionPane.showConfirmDialog(null,fields, "Nhap phuong trinh",JOptionPane.INFORMATION_MESSAGE);
            str1=f1.getText();
            str2=f2.getText();
            double a,b,c,d,e,f;
            String strA =str1.substring(0,str1.indexOf('x'));
            if(strA.compareTo("")==0){
                strA="1";
            }
            a=Double.parseDouble(strA);
            String strB=str1.substring(str1.indexOf('x')+1,str1.indexOf('y'));
            if(strB.compareTo("+")==0){
                strB="1";
            }
            else if(strB.compareTo("-")==0){
                strB="-1";
            }
            b=Double.parseDouble(strB);
            String strC=str1.substring(str1.indexOf('y')+2,str1.length());
            if(strC.compareTo("")==0){
                strC="0";
            }
            c=Double.parseDouble(strC);
            String strD =str2.substring(0,str2.indexOf('x'));
            if(strD.compareTo("")==0){
                strD="1";
            }
            d=Double.parseDouble(strD);
            String strE=str2.substring(str2.indexOf('x')+1,str2.indexOf('y'));
            if(strE.compareTo("+")==0){
                strE="1";
            }
            else if(strE.compareTo("-")==0){
                strE="-1";
            }
            e=Double.parseDouble(strE);
            String strF=str2.substring(str2.indexOf('y')+2,str2.length());
            if(strF.compareTo("")==0){
                strF="0";
            }
            f=Double.parseDouble(strF);
            double D,D1,D2;
            D=a*e-b*d;
            D1=c*e-f*b;
            D2=a*f-d*c;
            JOptionPane.showMessageDialog(null,"Hai nghiem cua phuong trinh la:x="+(D1/D)+"y="+(D2/D),"caculator", JOptionPane.OK_CANCEL_OPTION);
         }
        else if(x==2){
            String str;
            JOptionPane.showMessageDialog(null,"Nhap phuong trinh dang ax^2+bx+c");
            double a,b,c;
            str=JOptionPane.showInputDialog(null,"Nhap phuong trinh","Phuong trinh bac hai",JOptionPane.INFORMATION_MESSAGE);
            String strA=str.substring(0,str.indexOf('x'));
            if(strA.compareTo("")==0){
                strA="1";
            }
            else if(strA.compareTo("-")==0){
                strA="-1";
            }
            a=Double.parseDouble(strA);
            String strB=str.substring(str.indexOf("^2")+2,str.lastIndexOf('x'));
            if(strB.compareTo("+")==0){
                strB="1";
            }
            else if(strB.compareTo("-")==0){
                strB="-1";
            }
            b=Double.parseDouble(strB);
            String strC=str.substring(str.lastIndexOf('x')+1,str.length());
            if(strC.compareTo("")==0){
                strC="0";
            }
            c=Double.parseDouble(strC);
            double delta=b*b-4*a*c;
            if(delta<0){
                JOptionPane.showMessageDialog(null,"Phuong trinh vo nghiem","caculator",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(delta==0){
                JOptionPane.showMessageDialog(null,"Phuong trinh co nghiem duy nhat la x="+((-b)/2*a),"caculator",JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"Phuong trinh co 2 nghiem phan biet x1="+(-b+Math.sqrt(delta))/(2*a)+"x2="+(-b-Math.sqrt(delta))/(2*a),"caculator",0);
            }
        }
    }
        while(x!=3);
    }
}