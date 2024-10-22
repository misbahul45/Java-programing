package components;

import java.util.ArrayList;

public class User {
    private String name;
    private String password;
    private ArrayList<Buku> listBuku = new ArrayList<Buku>();

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Buku> getListBuku() {
        return listBuku;
    }

    public void setListBuku(ArrayList<Buku> listBuku) {
        this.listBuku = listBuku;
    }

    public void addBuku(Buku buku) {
        listBuku.add(buku);
    }

    public void showListBuku() {
        for (Buku buku : listBuku) {
            System.out.println(buku.getJudul());
        }
    }

    @Override
    public String toString() {
        StringBuilder listBuku = new StringBuilder();
        for (int i = 0; i < this.listBuku.size(); i++) {
            listBuku.append((i + 1) + "." + this.listBuku.get(i).getJudul()).append("\n");
        }
        return "Name : " + this.name + "\nList Buku : " + "\n" + listBuku;
    }
}
