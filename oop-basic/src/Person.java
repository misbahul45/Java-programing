public class Person {
    //Namanya field
    String name;
    String address;
    final String country="Indonesia";

    public Person(String paraName, String paraAddress) {
        name=paraName;
        address=paraAddress;
    }
    //constructor overloading
    public Person(String paraName){
        //memanggil constructor lain yang pertama
        this(paraName,null);
    }
    public Person(){
        //memanggil  constructor lain yang kedua
        this(null);
    }
    
    void SayHello(String paraName){
        System.out.println("Hello, "+ paraName +", my name is "+name);
    }
    void SayHello(String name, String address){
        //kata kunci this, ini digunakan untuk mengambil variabel di field class yang bukan dari field paramater fungsi 
        System.out.println("Hello, "+ name +", my name is "+ this.name+" nice to met you my friend from "+address+", and introducem i'm from "+this.address);
    }

}
