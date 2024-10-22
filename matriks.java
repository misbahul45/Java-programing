import java.util.Scanner;

public class matriks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int baris_1, kolom_1;
        int value;
        int barisIndex=0;
        int kolomIndex;
        
        System.out.print("Panjang baris : ");
        baris_1=scanner.nextInt();
        
        System.out.print("panjang kolom : ");
        kolom_1=scanner.nextInt();

        int[][] matriks_1=new int[baris_1][kolom_1];


        while (barisIndex<(baris_1)) {
            kolomIndex=0;
            while (kolomIndex<=(kolom_1-1)) {
                System.out.print("Masukkan value baris-> "+(barisIndex+1)+", kolom-> "+(kolomIndex+1)+": ");
                value=scanner.nextInt();
                matriks_1[barisIndex][kolomIndex]=value;
                kolomIndex++;
            }
            System.out.println("");
            System.out.println("continue");
            System.out.println("");
            barisIndex++;
        }

        for(int[] nums:matriks_1){
            for(int num:nums){
             if(num==nums[nums.length-1]){
                System.out.print(num+" ]");
             }else{
                if(num==nums[0]){
                    System.out.print("[ "+num+", ");
                }else{
                    System.out.print(num+", ");
                }
             }  
            }
            System.out.println("");

        }

        scanner.close();

    }
}
