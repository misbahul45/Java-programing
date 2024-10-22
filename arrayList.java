
import java.util.ArrayList;

//aplikasi jualan makanan

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> products=new ArrayList<String>();

        //menambahkan
        products.add("Pizza");
        products.add("bakso");


        //mengupdate data
        products.set(0, "Gedang goreng");
        

        for(int i=0; i < products.size();i++ ){
            System.out.println(products.get(i));
        }
        //menghapus seluruh data
           products.clear();
        
        if(products.isEmpty()){
            System.out.println("Tidak ada data");
        }
    }
}
