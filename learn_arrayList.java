
import java.util.ArrayList;
import java.util.Scanner;

public class learn_arrayList {

    static void showAllClothes(ArrayList<String> clothes){
        if(clothes.isEmpty()){
            System.out.println("Belum ada baju yang disimpan");
            return;
        }
        for(int i=0; i<clothes.size();i++){
            System.out.println((i+1)+". "+clothes.get(i));
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        ArrayList<String> clothes=new ArrayList<String>();
        String[] menus={"Tambah Baju","Hapus Baju", "Simpan Baju"};

        while (true) {
              for(int i=0; i<menus.length;i++){
                System.out.println((i+1)+". "+menus[i]);
              }
              System.out.print("Pilih Menu : ");
              int menu=scanner.nextInt();

              scanner.nextLine();

              switch (menu) {
                case 1 -> {
                    System.out.print("Massukan baju : ");
                    String bajuBaru=scanner.nextLine();
                    clothes.add(bajuBaru);
                    System.out.println("Daftar Baju ");
                    System.out.println(clothes);
                    System.out.println("");
                }
                case 2 -> {
                    System.out.println("");
                    showAllClothes(clothes);
                    System.out.print("Pilih baju yang akan di hapus : ");
                    int noBaju=scanner.nextInt();
                    scanner.nextLine();
                    clothes.remove(noBaju-1);
                    System.out.println(clothes);
                    System.out.println("");
                }
                case 3 -> {
                    System.out.println("List Baju");
                    System.out.println(clothes);
                    System.out.println("Terima kasih baju telah disimpan");
                    return;
                }
              
                default ->{
                    System.out.println("Pilih menu yang valid");
                }
              }
        }   

    }
}
