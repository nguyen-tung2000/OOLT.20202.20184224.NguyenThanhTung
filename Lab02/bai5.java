import javax.swing.JOptionPane;
public class bai5{
    public static int checkMonth(int x){
        if(x==1 || x==3 || x==5 || x==7 || x==8 || x==10 || x==12) {
            return 1;
        }
        else if(x==4 || x==6 || x==9 || x==11) {
            return 2;
        }
        else if(x==2) {
            return 3;
        }
        return 0;
    }
    public static int checkYear(int y) {
        if(y%100==0 && y%400!=0){
            return 1;
        }
        else if(y%4!=0){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Xin moi nhap ngay thang nam sinh.");
        int x=1;
        do{
            String str;
            str = JOptionPane.showInputDialog(null,"Cu phap:yyyy/mm/dd","ngay thang nam sinh",JOptionPane.INFORMATION_MESSAGE);
            String yyyy =str.substring(0, str.indexOf('/'));
            int y =Integer.parseInt(yyyy);
            if(y<=0 || y>=2021) {
                System.out.print("So nam phai lon hon 0");
                x=0;
            }
            String mm=str.substring(yyyy.length()+1,str.lastIndexOf('/'));
            int m =Integer.parseInt(mm);
            if(m<=0 || m>12){
                System.out.println("So thang phai lon hon 0 va nho hon hoac bang 12");
                x=0;
            }
            String dd =str.substring(str.lastIndexOf("/")+1,str.length());
            int d=Integer.parseInt(dd);
            if(checkMonth(m)==1 && (d>31||d<=0)){
                System.out.println("So ngay trong thang thuoc khoang tu 1-31");
                x=0;
            }
            else if(checkMonth(m)==2 && (d>30 || d<=0)){
                System.out.println("So ngay trong thang thuoc khoang tu 1-30");
                x=0;
            }
            else if(checkMonth(m)==3 && checkYear(y)==0 && (d>29 || d<=0)){
                System.out.println("So ngay trong thang thuoc khoang tu 1-29");
                x=0;
            }
            else if(checkMonth(m)==3 && checkYear(y)==1 && (d>28 || d<=0)){
                System.out.println("So ngay trong thang thuoc khoang tu 1-28");
                x=0;
            }
            if(x==0){
                JOptionPane.showMessageDialog(null,"Nhap sai xin moi nhap lai");
            }
            else if(x==1){
                JOptionPane.showMessageDialog(null,"Nhap thanh cong");
            }
        }
        while(x!=1);
    }
}