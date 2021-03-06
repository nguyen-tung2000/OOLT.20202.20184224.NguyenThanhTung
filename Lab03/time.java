import java.util.Scanner;

public class time {
    private int d;
    private int m;
    private int y;
    public time(){
        String CurTime = java.time.LocalDate.now().toString();
        this.d=Integer.parseInt(CurTime.substring(CurTime.lastIndexOf("-")+1,CurTime.length()));
        this.m=Integer.parseInt(CurTime.substring(CurTime.indexOf("-")+1,CurTime.lastIndexOf("-")));
        this.y=Integer.parseInt(CurTime.substring(0,CurTime.indexOf("-")));
    }
    private int checkMonth(int x){
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
    private int checkYear(int x){
        if(x%100==0 && x%400!=0){
            return 1;
        }
        else if(x%4!=0){
            return 1;
        }
        return 0;
    }
    public void setYear(int y){
        if(y<=2021 || y>=0){
            this.y=y;
        }
        else {
            System.out.println("Invalid Year");
        }
        }
    public void setMonth(int m){
        if(m<=0 || m >=12){
            this.m=m;
        }
        else{
            System.out.println("Invaid MonthMonth");
        }
    }
    public void setDay(int d){
        if(checkMonth(m)==1 && d <=31 && d>=1){
            this.d=d;
        }
        else if(checkMonth(m)==2 &&(d<=30 && d>=1)){
            this.d=d;
        }
        else if(checkMonth(m)==3 && checkYear(y)==0 && d<=28 && d>=1){
            this.d=d;
        }
        else if(checkMonth(m)==3 && checkYear(y)==1 && d<=29 && d>=1){
            this.d=d;
        }
        else{
            System.out.println("Invalid Day");
        }
    }
    public int getDay(){
        return d;
    }
    public int getMonth(){
        return m;
    }
    public int getYear(){
        return y;
    }
    public void accept(){    
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap thoi gian dang yyyy-mm-dd");
        String Timechain = sc.nextLine();
        this.d=Integer.parseInt(Timechain.substring(Timechain.lastIndexOf("-")+1,Timechain.length()));
        this.m=Integer.parseInt(Timechain.substring(Timechain.indexOf("-")+1,Timechain.lastIndexOf("-")));
        this.y=Integer.parseInt(Timechain.substring(0,Timechain.indexOf("-")));
    }
    public void print(){
        System.out.println(java.time.LocalDate.now());
    }

}
    
