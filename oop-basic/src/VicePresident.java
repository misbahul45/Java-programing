//extends digunakan untuk penurunan atau anak dari Managernya
//kelass anaknya akan memiliki semua data dari parentnya kecuali constructornya harus menggunakan kata kunci super untuk menirunya
public class VicePresident extends Manager{
    public VicePresident(String name){
        super(name);
    }

    //method overriding(mendefinisikan lagi method yang sudah ada di parentnya)
    void SayHello(String name){
        System.out.println("Hello, "+name+". My name is Vice President "+this.name);
    }
}
