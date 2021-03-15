import java.util.Scanner;

public class DateTest {
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("1.Nhap ngay thang nam (yyyy-mm-dd) va in");
    System.out.println("2.In ra ngay thang nam hien tai");
    System.out.println("3.Thoat chuong trinh");
    System.out.println("Moi nhap:");
    int x;
    do{
        x=sc.nextInt();
        if(x==1){
            time tg =new time();
            tg.accept();
            System.out.println("Ngay ban nhap la ngay "+tg.getDay()+" thang "+ tg.getMonth()+" nam "+tg.getYear());
        }
        else if(x==2){
            time tg=new time();
            tg.print();
        }
        else if(x==3){
            System.out.println("bye");
        }
    }
    while(x!=3);

}
}
