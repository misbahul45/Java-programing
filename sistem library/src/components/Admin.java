package components;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {
    public Admin(String name, String password) {
        super(name, password);
    }

    public ArrayList<User> addUser(User newUser, ArrayList<User> listUser) {
        // add new User
        listUser.add(newUser);

        return listUser;
    }

    public ArrayList<User> deleteUser(ArrayList<User> listUser) {
        Scanner scanner = new Scanner(System.in);
        // add new User
        for (int i = 0; i < listUser.size(); i++) {
            System.out.println((i + 1) + ". " + listUser.get(i).getName());
        }
        System.out.print("Delete User index : ");
        int indexUser = scanner.nextInt();
        scanner.nextLine();

        // delete user
        listUser.remove(indexUser - 1);

        return listUser;
    }

    public void showListUser(ArrayList<User> listUser) {
        for (int i = 0; i < listUser.size(); i++) {
            System.out.println((i + 1) + ". " + listUser.get(i).getName());
        }
        System.out.println("");
    }

    public ArrayList<Buku> addBuku(Buku newBuku, ArrayList<Buku> listBuku) {
        listBuku.add(newBuku);
        return listBuku;
    }

    public ArrayList<Buku> deleteBuku(ArrayList<Buku> listBuku) {
        Scanner scanner = new Scanner(System.in);
        // add new User
        for (int i = 0; i < listBuku.size(); i++) {
            System.out.println((i + 1) + ". " + listBuku.get(i).getJudul());
        }
        System.out.print("Delete User index : ");
        int indexUser = scanner.nextInt();
        scanner.nextLine();

        // delete user
        listBuku.remove(indexUser - 1);

        return listBuku;
    }

    public void showListBuku(ArrayList<Buku> listBuku) {
        for (int i = 0; i < listBuku.size(); i++) {
            System.out.println((i + 1) + ". " + listBuku.get(i).getJudul());
        }
        System.out.println("");
    }
}
