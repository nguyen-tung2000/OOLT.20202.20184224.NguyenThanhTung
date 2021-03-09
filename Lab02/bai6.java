import java.util.Random;
import java.util.Scanner;


public class bai6 {
    public static void sapxepmin(int[] arr){
        int temp = arr[0];
            for (int i = 0 ; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
    }
public static void sapxepmax(int[] arr){
    int temp = arr[0];
    for (int i = 0 ; i < arr.length - 1; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] < arr[j]) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }

}
    public static void main(String[] args) {
        Random rand =new Random();
        int tong=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        int n= sc.nextInt();
        char[] mang = new char[n];
        System.out.println("Nhap phan tu tu 0->9.\nNeu muon sinh ngau nhien hay chon ki tu bat ki(khong phai so)");
        for(int i =0;i<n;i++){
            System.out.println("Nhap phan tu thu :"+(i+1));
            mang[i]=sc.next().charAt(0);
        }
        int [] MangI =new int[n];
        for(int i=0;i<n;i++){
            if(Character.isDigit(mang[i])==false){
                MangI[i]=rand.nextInt(10);
            }
            else{
                MangI[i]=(int)mang[i]-'0';
            }
        }
        int lc;
        do{
        System.out.println("\nMoi nhap lua chon:");
        System.out.println("1.Tong cac phan tu cua mang");
        System.out.println("2.Trung binh cong cac phan tu cua mang");
        System.out.println("3.Sap xep cac phan tu cua mang tu nho den lon");
        System.out.println("4.Sap xep phan tu cua mang tu lon den nho");
        System.out.println("5.Thoat chuong Trinh");
        lc=sc.nextInt();
        switch(lc){
            case 1:{
                for(int i=1;i<n;i++){
                    tong+=MangI[i];
                }
                System.out.println("Tong cua cac phan tu la:"+tong);
                break;
            }
            case 2:{
                System.out.println("Trung binh Bang:"+tong/n);
                break;
            }
            case 3:{
                System.out.println("Mang sau khi sap xep:");
            sapxepmin(MangI);
            for(int i: MangI){
                System.out.print(i+"\t");
            }
            break;
            }
            case 4:{
                System.out.println("Mang sau khi sap xep:");
                sapxepmax(MangI);
                for(int i:MangI){
                    System.out.print(i+"\t");
                }

            }
        } 
        } while(lc!=5);
        


    }
    
