import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten hoac duong dan thu muc can kiem tra kich co: ");
        String path = scanner.nextLine();
        FileCalculator fileCalculator = new FileCalculatorAdapter();
        Client client = new Client(fileCalculator);
        client.printFileSize(path);
    }
}
