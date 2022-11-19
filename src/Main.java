import java.util.Scanner;

public class Main {
    static ManagerAccount managerAccount = new ManagerAccount();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Đăng ký");
            System.out.println("2. Đăng nhập");
            System.out.println("3. Đổi mật khẩu");
            System.out.println("4. Thoát");

            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    managerAccount.dangKy();
                    break;
                case 2:
                    managerAccount.dangNhap();
                    break;
                case 3:
                    managerAccount.doiMatKhau();
                case 4:
                    System.exit(0);
            }
        }
    }
}
