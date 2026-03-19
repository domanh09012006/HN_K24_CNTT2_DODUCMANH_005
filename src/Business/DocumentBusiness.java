package Business;

import Entity.Document;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocumentBusiness {
    List<Document> documentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void getAll() {
        if (documentList.isEmpty()) {
            System.out.println("Danh sach hien dang trong.");
            return;
        }
        for (Document d : documentList) {
            d.displayData();
        }
    }

    public void add() {
        Document newDoc = new Document();
        newDoc.inputData(sc);
        boolean isExist = false;
        for (Document d : documentList) {
            if (d.getDocumentId().equalsIgnoreCase(newDoc.getDocumentId())) {
                isExist = true;
                break;
            }
        }
        if (isExist) {
            System.err.println("Loi: ID da ton tai!");
        } else {
            documentList.add(newDoc);
            System.out.println("Them moi thanh cong.");
        }
    }
    public void update() {
        System.out.print("Nhap ID can sua: ");
        String id = sc.nextLine();
        boolean found = false;
        for (Document d : documentList) {
            if (d.getDocumentId().equalsIgnoreCase(id)) {
                try {
                    System.out.print("Nhap ten moi: ");
                    d.setDocumentName(sc.nextLine());
                    System.out.print("Nhap size moi: ");
                    d.setFileSize(Double.parseDouble(sc.nextLine()));
                    System.out.println("Cap nhat thanh cong.");
                } catch (NumberFormatException e) {
                    System.err.println("Loi: Kieu du lieu khong hop le!");
                }
                found = true;
                break;
            }
        }
        if (!found) System.err.println("Loi: Khong tim thay ID!");
    }
    public void delete() {
        System.out.print("Nhap ID can xoa: ");
        String id = sc.nextLine();
        int index = -1;
        for (int i = 0; i < documentList.size(); i++) {
            if (documentList.get(i).getDocumentId().equalsIgnoreCase(id)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            documentList.remove(index);
            System.out.println("Da xoa tai lieu.");
        } else {
            System.err.println("Loi: Khong co phan tu de xoa!");
        }
    }
}