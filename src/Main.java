import model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.write;

public class Main {
    private static final List<User> users = new ArrayList<>();
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Xin chào đển vơi hệ thống !");
            System.out.println("1. login");
            System.out.println("2. Dăng ký.");
            System.out.println("3. Thoát.");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
//                    Login();
                    break;
                case 2:
                    Register();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Nhập sai, vui lòng nhập lại!");
            }
        }

    }

    public static void Login() {
        System.out.println("User name: ");
        String userName = scanner.nextLine();
        System.out.println("User password: ");
        String userPassword = scanner.nextLine();

        if (){
            System.out.println("Login successful!");
        } else {
            System.out.println("Account does not exist.");
        }

    }

    public static void Register() {
        System.out.println("Nhập username bạn muốn đăng ký: ");
        String username = scanner.nextLine();
        System.out.println("Nhập password : ");
        String password = scanner.nextLine();
        while (true) {
            System.out.println("Xác nhận lại password : ");
            String password2 = scanner.nextLine();
            if (password2.equals(password)) {
                users.add(new User(username, password));
                write();
                System.out.println("Đăng ký thành công!");
                break;
            }


        }
    }

    public static void write() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/data/Data.csv"));
            for (User user : users) {
                writer.write(user.convertData());
                writer.newLine();
                writer.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void read(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/data/Data.csv"));
            String line = reader.readLine();
            while (line != null) {
                users.add(converString(line));
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

    public static User converString(String string) {
        String[] listData = string.split(",");

        return new User(listData[0], listData[1], listData[2]);
    }
    }







