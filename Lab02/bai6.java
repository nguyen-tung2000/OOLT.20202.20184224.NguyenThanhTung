import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int tong=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        int n= sc.nextInt();
        int[] mang = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("Nhap phan tu thu :"+(i+1));
            mang[i]=sc.nextInt();
            tong +=mang[i];
        }
        System.out.println("Tong cua cac phan tu la:"+tong);
        System.out.println("Trung binh Bang:"+tong/n);

    }
    
}
