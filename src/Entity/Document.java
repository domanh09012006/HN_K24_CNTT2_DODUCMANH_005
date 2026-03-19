package Entity;

import java.util.Scanner;

public class Document {
    private String documentId;
    private String documentName;
    private double fileSize;
    private int downloads;
    public Document() {

    }
    public Document(String documentId, String documentName, double fileSize, int downloads) {
        this.documentId = documentId;
        this.documentName = documentName;
        this.fileSize = fileSize;
        this.downloads = downloads;
    }
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public void inputData(Scanner sc) {
        System.out.print("Nhap ID (vi du DC01): ");
        this.documentId = sc.nextLine();
        System.out.print("Nhap ten tai lieu: ");
        this.documentName = sc.nextLine();
        while (true) {
            try {
                System.out.print("Nhap kich thuoc (MB): ");
                this.fileSize = Double.parseDouble(sc.nextLine());
                if (this.fileSize > 0) break;
                System.out.println("Loi: Kich thuoc phai lon hon 0!");
            } catch (NumberFormatException e) {
                System.out.println("Loi: Vui long nhap so thuc!");
            }
        }
        while (true) {
            try {
                System.out.print("Nhap so luot tai: ");
                this.downloads = Integer.parseInt(sc.nextLine());
                if (this.downloads >= 0) break;
                System.out.println("Loi: Luot tai khong duoc am!");
            } catch (NumberFormatException e) {
                System.out.println("Loi: Vui long nhap so nguyen!");
            }
        }
    }
    public void displayData() {
        System.out.printf("ID: %s | Ten: %-15s | Size: %-6.2f | Downloads: %d\n",
                documentId, documentName, fileSize, downloads);
    }
}