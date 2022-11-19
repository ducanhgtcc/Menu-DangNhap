import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManagerAccount {
     Map<String, String> managerAccount = new HashMap<>();

    public void dangKy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập user name");
        String username = scanner.nextLine();
        System.out.println("Nhập password");
        String password = scanner.nextLine();

        if (managerAccount.containsKey(username)) {
            System.out.println("User name đã tồn tại");
        } else {
            CreatAccount creatAccount = new CreatAccount(username, password);
            managerAccount.put(creatAccount.getUsername(), creatAccount.getPassword());
        }
    }

    public void dangNhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập user name");
        String username = scanner.nextLine();
        System.out.println("Nhập password");
        String password = scanner.nextLine();

        if (managerAccount.containsKey(username)) {
            if (managerAccount.get(username).equals(password)) {
                System.out.println("Đăng nhập thành công");
            } else {
                System.out.println("Sai mật khẩu");
            }
        } else {
            System.out.println("Tài khoản không tồn tại");
        }
    }

    public void doiMatKhau() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập user name");
        String username = scanner.nextLine();
        System.out.println("Nhập password");
        String password = scanner.nextLine();

        if (managerAccount.containsKey(username)) {
            if (managerAccount.get(username).equals(password)) {
                System.out.println("Nhập mật khẩu mới");
                String password1 = scanner.nextLine();
                managerAccount.put(username, password1);
            } else {
                System.out.println("Sai mật khẩu");
            }
        } else {
            System.out.println("Tài khoản không tồn tại");
        }
    }
}
