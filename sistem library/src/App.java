import java.util.ArrayList;
import java.util.Scanner;

import components.Admin;
import components.Buku;
import components.User;
import components.auth.Login;
import validations.Validation;

public class  App {
    static void showMenu(String type) {
        String[] UserMenu = { "add buku", "delete buku", "list buku", "Update Username", "logout" };
        String[] adminMenu = { "add user", "delete user", "list user", "add buku", "delete buku", "list buku",
                "logout" };
        if (type.equals("admin")) {
            for (int i = 0; i < adminMenu.length; i++) {
                System.out.println((i + 1) + ". " + adminMenu[i]);
            }
        } else {
            for (int i = 0; i < UserMenu.length; i++) {
                System.out.println((i + 1) + ". " + UserMenu[i]);
            }
        }
    }

    public static void main(String[] args) throws Exception {

        // Inisialisasi class
        Scanner userInput = new Scanner(System.in);
        Validation validation = new Validation();

        // Daftar Buku dan User
        ArrayList<Buku> daftarBuku = new ArrayList<Buku>();
        ArrayList<User> daftarUser = new ArrayList<User>();

        // Login
        User userLogin = new User(null, null);
        Admin adminLogin = new Admin(null, null);

        daftarBuku.add(new Buku("Harry Potter", "J.K Rowling", new String[] { "Fantasy", "Action", "Horror" }, 1984));
        daftarBuku.add(new Buku("The Lord of the Rings", "J.R.R. Tolkien",
                new String[] { "Fantasy", "Action", "Horror" }, 1954));
        daftarBuku.add(
                new Buku("The Hunger Games", "Suzanne Collins", new String[] { "Fantasy", "Action", "Horror" }, 2008));
        daftarBuku.add(new Buku("The Hobbit", "J.R.R. Tolkien", new String[] { "Fantasy", "Action", "Horror" }, 1937));
        daftarBuku.add(new Buku("The Return of the King", "J.R.R. Tolkien",
                new String[] { "Fantasy", "Action", "Horror" }, 1955));
        daftarBuku.add(
                new Buku("The Two Towers", "J.R.R. Tolkien", new String[] { "Fantasy", "Action", "Horror" }, 1954));
        daftarBuku.add(new Buku("The Fellowship of the Ring", "J.R.R. Tolkien",
                new String[] { "Fantasy", "Action", "Horror" }, 1954));

        daftarUser.add(new User("taqin", "taqin123"));
        daftarUser.add(new User("jefri", "jefri123"));
        daftarUser.add(new User("hafiz", "hafiz123"));
        daftarUser.add(new User("admin", "admin123"));

        while (true) {
            if (userLogin.getName() == null && adminLogin.getName() == null) {
                System.out.println("1.Login");
                System.out.println("2.Register\n");
                System.out.print("Select menu : ");
                int mainMenu = userInput.nextInt();
                userInput.nextLine();

                if (mainMenu == 1) {
                    // Proses Login
                    Login login = new Login();
                    System.out.println("Login");
                    System.out.print("Username : ");
                    String username = userInput.nextLine();
                    System.out.print("Password : ");
                    String password = userInput.nextLine();

                    try {
                        validation.ValidationAuth(new User(username, password));
                        if (username.equals("admin") && password.equals("admin123")) {
                            adminLogin.setName(username);
                            adminLogin.setPassword(password);
                        } else {
                            login.setName(username);
                            login.setPassword(password);
                            login.LoginUser(daftarUser);
                        }
                        // user login
                        userLogin.setName(username);
                        userLogin.setPassword(password);

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else if (mainMenu == 2) {
                    // Proses Register
                    Login login = new Login();
                    System.out.println("Register");
                    System.out.print("Username : ");
                    String username = userInput.nextLine();
                    System.out.print("Password : ");
                    String password = userInput.nextLine();

                    try {
                        validation.ValidationAuth(new User(username, password));
                        login.setName(username);
                        login.setPassword(password);
                        login.RegisterUser(daftarUser);

                        // user login
                        userLogin.setName(username);
                        userLogin.setPassword(password);

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.err.println("Please input a valid menu!!!");
                }
            } else {
                if (!userLogin.getName().equals("admin")) {
                    showMenu(userLogin.getName());
                    System.out.print("\nSelect menu : ");
                    int selectMenu = userInput.nextInt();
                    userInput.nextLine();
                    switch (selectMenu) {
                        case 1 -> {

                        }
                        default -> {

                        }
                    }
                    return;
                } else {

                    showMenu(adminLogin.getName());
                    System.out.print("\nSelect menu : ");
                    int selectMenu = userInput.nextInt();
                    userInput.nextLine();

                    switch (selectMenu) {
                        case 1 -> {
                            System.out.print("Masukkan Username : ");
                            String newUserName = userInput.nextLine();

                            System.out.print("Masukkan Password : ");
                            String newPassword = userInput.nextLine();

                            daftarUser = adminLogin.addUser(new User(newUserName, newPassword), daftarUser);
                            adminLogin.showListUser(daftarUser);
                        }
                        case 2 -> {
                            daftarUser = adminLogin.deleteUser(daftarUser);
                            adminLogin.showListUser(daftarUser);
                        }
                        case 3 -> {
                            adminLogin.showListUser(daftarUser);
                        }
                        case 4 -> {
                            System.out.print("Masukkan Judul Buku : ");
                            String newJudul = userInput.nextLine();

                            System.out.print("Masukkan Penulis : ");
                            String newPenulis = userInput.nextLine();

                            System.out.print("Masukkan Tahun : ");
                            int newTahun = userInput.nextInt();
                            userInput.nextLine();

                            System.out.print("Masukkan Category : ");
                            String[] newCategory = userInput.nextLine().split(",");
                            daftarBuku = adminLogin.addBuku(new Buku(newJudul, newPenulis, newCategory, newTahun),
                                    daftarBuku);
                            adminLogin.showListBuku(daftarBuku);
                        }
                        case 5 -> {
                            daftarBuku = adminLogin.deleteBuku(daftarBuku);
                            adminLogin.showListBuku(daftarBuku);
                        }
                        case 6 -> {
                            adminLogin.showListBuku(daftarBuku);
                        }
                        case 7 -> {
                            System.out.println("Terima Kasih");
                            System.exit(0);
                            return;
                        }
                        default -> {
                            System.out.println("Please input a valid menu!!!");
                        }
                    }
                }
            }
        }
    }
}
