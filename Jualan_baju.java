import java.util.ArrayList;
import java.util.Scanner;

public class Jualan_baju {

    static boolean validateAuth(String[] username, String[] pw, String userInput, String userPw) {
        boolean checkUsername = false;
        boolean isMatch = false;

        for (String name : username) {
            if (name.equals(userInput)) {
                checkUsername = true;
            }
        }

        if (!checkUsername) {
            return false;
        }

        for (String password : pw) {
            if (password.equals(userPw)) {
                isMatch = true;
            }
        }

        return isMatch;
    }
    static void string_showArrayList(ArrayList<String> bajuList, ArrayList<Integer> hargaList) {
        if (bajuList.isEmpty()) {
            System.out.println("Tidak ada baju yang dijual");
            return;
        }
        for (int i = 0; i < bajuList.size(); i++) {
            System.out.println((i + 1) + ". " + bajuList.get(i) + " Rp." + hargaList.get(i));
        }
    }

    static void string_showArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
        }
    }

    static void admin(ArrayList<String> daftarBaju, ArrayList<Integer> daftarHarga,
        boolean isAuthenticated, boolean isAdmin) {
        Scanner scanner = new Scanner(System.in);

        String[] daftarMenu = {"Tambah baju", "Hapus baju", "Keluar Account"};
        int menu;

        while (true) {
            System.out.println("\nWelcome my Admin");
            System.out.println("Daftar Baju:");
            string_showArrayList(daftarBaju, daftarHarga);
            System.out.println("\nMenu:");
            string_showArray(daftarMenu);

            System.out.print("Pilih menu (1-3): ");
            menu = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (menu) {
                case 1 -> {
                    System.out.print("Masukkan nama baju: ");
                    String namaBaju = scanner.nextLine();
                    System.out.print("Masukkan harga baju: ");
                    int hargaBaju = scanner.nextInt();
                    scanner.nextLine(); // Clear the buffer
                    daftarBaju.add(namaBaju);
                    daftarHarga.add(hargaBaju);
                    System.out.println("Baju berhasil ditambah.");
                }
                case 2 -> {
                    System.out.print("Masukkan nomor baju yang ingin dihapus: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index > 0 && index <= daftarBaju.size()) {
                        daftarBaju.remove(index - 1);
                        daftarHarga.remove(index - 1);
                        System.out.println("Baju berhasil dihapus.");
                    } else {
                        System.out.println("Nomor baju tidak valid.");
                    }
                }
                case 3 -> {
                    System.out.println("Keluar dari menu admin.");
                    return; // Exit the admin menu loop
                }
                default -> {
                    System.out.println("Pilihan tidak valid.");
                }
            }
        }
    }

    // Non-admin functionality: View the available clothes
    static void userView(ArrayList<String> daftarBaju, ArrayList<Integer> daftarHarga) {
        System.out.println("\nDaftar Baju yang Tersedia:");
        string_showArrayList(daftarBaju, daftarHarga);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernameUsers = {"taqin", "bahul", "misbah"};
        String[] pwUsers = {"taqin123", "bahul123", "misbah123"};
        String username = "";
        String pw = "";

        ArrayList<String> daftarBaju = new ArrayList<>();
        ArrayList<Integer> daftarHarga = new ArrayList<>();

        ArrayList<String> daftarBajuUser = new ArrayList<>();

        boolean isAuthenticated = false;
        boolean isAdmin = false;

        while (true) {
            System.out.println("1.Login");
            System.out.println("2.keluar");
            System.out.print("pilih menu : ");
            int actionMenu=scanner.nextInt();
            scanner.nextLine();
            if(actionMenu==2){
                return;
            }
            System.out.println(""); 
            if (!isAuthenticated) {
                System.out.println("User Menu Login");
                System.out.print("Masukkan username: ");
                username = scanner.nextLine();
                System.out.print("Masukkan password: ");
                pw = scanner.nextLine();
                boolean check = validateAuth(usernameUsers, pwUsers, username, pw);

                if (!check) {
                    System.out.println("Username atau password salah, coba lagi.\n");
                }
                isAuthenticated = check;
            }

            // Check if the user is an admin
            if (isAuthenticated && username.equals("taqin")) {
                isAdmin = true;
            }

            // If the user is authenticated
            if (isAuthenticated) {
                if (isAdmin) {
                    admin(daftarBaju, daftarHarga, isAuthenticated, isAdmin);
                    isAuthenticated = false;
                    isAdmin = false;
                    username = "";
                    pw = "";
                } else {
                     String[] daftarMenuUser={"beli baju","keluar"};
                     System.out.println("Selamat datang, " + username + "!");
                     string_showArray(daftarMenuUser);
                     System.out.print("Pilih Menu");
                     int menuUser=scanner.nextInt();
                     scanner.nextLine();
                     if(menuUser==1){
                        userView(daftarBaju, daftarHarga);
                        System.out.print("Pilih baju yang di beli : ");
                        int pilihBaju=scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("harga : "+daftarHarga.get(pilihBaju));
                        System.out.print("Masukan pembayaran : ");
                        int hargaBayar=scanner.nextInt();
                        if(hargaBayar<=daftarHarga.get(pilihBaju)){
                            System.out.println("Mohon maaf pembayaran kurang");
                        }else{
                            System.out.println("pembayaran sukses");
                            daftarBajuUser.add(daftarBaju.get(pilihBaju));
                        }
                     }else if(menuUser==2){
                        System.out.println("baju anda\n");
                        System.out.println(daftarBajuUser+"\n");
                        isAuthenticated = false;
                        username = "";
                        pw = ""; 
                     }
                }
            }
        }
    }
}
