import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap so cot,hang cua ma tran");
    int n=sc.nextInt();
    int m=sc.nextInt();
    int [][] mang1 = new int [n][m];
    int [][] mang2 = new int [n][m];
    System.out.println("Nhap ma tran thu nhat");
    for(int i=0;i<n;i++){
        for(int j =0;j<m;j++){
            System.out.print("a["+i+"]"+"["+j+"]:");
            mang1[i][j]=sc.nextInt();
        }
    }
    int [][] mang3 = new int[n][m];
    System.out.println("Nhap ma tran thu hai");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print("b["+i+"]"+"["+j+"]:");
            mang2[i][j]=sc.nextInt();
    }
    
    }
    System.out.println("Tong cua hai ma tran");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            mang3[i][j]=mang1[i][j]+mang2[i][j];
            System.out.print(mang3[i][j]+"   ");
        }
        System.out.print("\n");
    }

    }
}
