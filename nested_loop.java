
import java.util.Scanner;

public class nested_loop {
    public static void main(String[] args) {
        int baris,kolom;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Baris tabel : ");
        baris=scanner.nextInt();
        System.out.print("Kolom tabel : ");
        kolom=scanner.nextInt();

        System.out.print("Simbol baris : ");
        String symbol=scanner.next();
        for(int i=1; i<=baris;i++){
            System.out.print(i +". ");
            for(int j=1; j<=kolom;j++){
                System.out.print(symbol);
            }
            System.out.println("");
        }
    }
}
