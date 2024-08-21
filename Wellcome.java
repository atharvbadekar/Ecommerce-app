package EcommerceApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wellcome {
    UserDetails details;
    List<UserDetails> users = new ArrayList<>();
    Homepage homepage = new Homepage();
    Scanner sc = new Scanner(System.in);

    public void welcome() {
        while (true) {
            System.out.println("1. Create an Account");
            System.out.println("2. Already a User");
            System.out.println("3. Exit\n");
            System.out.print("Enter your choice : ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Incorrect input ");
            }
        }
    }

    public void createAccount() {
        try {
            System.out.println("---------Create Account------------");
            sc.nextLine();
            System.out.print("Enter the username : ");
            String userName = sc.nextLine();
            System.out.print("Enter the password : ");
            String password = sc.nextLine();
            System.out.print("Enter the address : ");
            String address = sc.nextLine();
            System.out.print("Enter the phoneNo : ");
            Double phoneNo = sc.nextDouble();

            details = new UserDetails(userName, password, address, phoneNo);
            addUser(details);

            System.out.println("------Account Created Successful----------");
        } catch (Exception e) {
            System.out.println("Try creating account again ");
            createAccount();
        }
    }

    public void login() {
        boolean flag = true;
        for (int i = 3; i > 0; i--) {
            System.out.println("---------Login------------");
            if (flag) {
                sc.nextLine();
            }
            System.out.print("Enter the username : ");
            String userName = sc.nextLine();
            System.out.print("Enter the password : ");
            String password = sc.nextLine();

            for (UserDetails user : users) {
                if (user.userName.equals(userName) && user.password.equals(password)) {
                    System.out.println("-------Login Success---------");
                    homepage.homepage();
                    return;
                }
            }

            System.out.println("Incorrect details ");
            System.out.println("Attempts left : " + i);
            flag = false;
        }
        System.out.println("Maximum attempts reached. Please try again later.");
    }

    public void addUser(UserDetails details) {
        users.add(details);
    }
}
