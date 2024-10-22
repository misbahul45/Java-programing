package learn.data;

//menggunakan abstract
// public abstract class Animal {
//     public String name;

//     public Animal(String name) {
//         this.name=name;
//     }
    
//     //kata kunci abstract ini akan memaksa anak turunnya untuk wajib memiliki method run
//     public abstract void run();
// }

//menggunakan interface yang dinama semua methodnya auto abstract seperti interface typescript

public interface Animal{
    void run(String name);
}