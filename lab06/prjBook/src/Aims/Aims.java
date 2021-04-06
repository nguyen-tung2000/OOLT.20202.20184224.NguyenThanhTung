package Aims;
import Oder.Oder;
import Media.Media;
import Media.Book;
import java.util.Scanner;

public class Aims {

	public static void main(String[] args) {
			showMenu();
	}
	public static void showMenu() {
		Oder items = new Oder();	
		int a;
		do {
		System.out.println("Order Management Application ");
		System.out.println("----------------------------");
		System.out.println("1.Create new order");
		System.out.println("2.Add item to the order");
		System.out.println("3.Delete item by id");
		System.out.println("4.Display the items list of order");
		System.out.println("0.Exit");
		System.out.println("Please choose a number:0-1-2-3-4 :");

			Scanner sc = new Scanner(System.in);
			 a = sc.nextInt();
			if(a == 1) {
				System.out.println("Create new order successfully !");
			}
			else if(a == 2) {
				Media b = new Media();
				int id;
				String title;
				String caterogy;
				float cost;
				
			System.out.println("Enter id of item:");
			Scanner sc1 = new Scanner(System.in);
			id = sc1.nextInt();
			b.setId(id);
			
			System.out.println("Enter title:");
			Scanner sc2 = new Scanner(System.in);
			title = sc2.nextLine();
			b.setTitle(title);
			
			System.out.println("Enter category :");
			Scanner sc3 = new Scanner(System.in);	
			caterogy = sc3.nextLine();
			b.setCategory(caterogy);
			
			System.out.println("Enter cost");
			Scanner sc4 = new Scanner(System.in);	
			cost = sc4.nextLong();
			b.setCost(cost);
			items.addMedia(b);
			
			}
			else if(a == 3) {
				int x;
				System.out.println("Remove item have id:");
				Scanner sc1 = new Scanner(System.in);
				x = sc1.nextInt();
				if(items.removebyID(x)) {
					System.out.println("Deleted Successfully !");
				}
				else {
					System.out.println("Invalid id !");
				}
			}
			else if(a == 4) {
				items.show();
			}
			else if(a == 0) {
				System.out.println("Thoat chuong trinh");
			}
		}
		while(a != 0);
	}
}

