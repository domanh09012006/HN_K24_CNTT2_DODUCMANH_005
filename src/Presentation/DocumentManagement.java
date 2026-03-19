package Presentation;

import Business.DocumentBusiness;
import java.util.Scanner;

public class DocumentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DocumentBusiness business = new DocumentBusiness();

        while (true) {
            System.out.println("""
                    ------------QUAN LY TAI LIEU SO-----------
                    1. Hien thi danh sach toan bo tai lieu
                    2. Them moi tai lieu
                    3. Cap nhat thong tin tai lieu theo ma
                    4. Xoa tai lieu theo ma
                    5. Tim kiem tai lieu theo ten
                    6. Loc danh sach tai lieu pho bien (downloads>1000)
                    7. Sap xep giam dan theo luot tai
                    8. Thoat
                    """);
            System.out.println("Nhap lua chon cua ban: ");
            int choice= Integer.parseInt(sc.nextLine());;
            switch (choice) {
                case 1:
                    business.getAll();
                    break;
                case 2:
                    business.add();
                    break;
                case 3:
                    business.update();
                    break;
                case 4:
                    business.delete();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Khong co lua chon nay");
                    break;
            }
        }
    }
}